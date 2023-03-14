package cn.lioyan.lucene.index;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.BytesRef;

import java.io.IOException;
import java.nio.file.Paths;


/**
 * {@link org.apache.lucene.index.TermsHashPerField}
 *<pre>
 *     内存版 的倒排索引，它是一个链式结构。在初始化和添加文档时，都会链式调用。这个是父类
 *     这个相对与创建了bytePool 存储的逻辑，至于具体时存储什么，由子类实现
 *
 * 基本逻辑：
 *     bytePool:  所有写入的具体内容都在这里;具体写入的内容包括freq, pos ,offset, payload
 *     streamCount： 存储几种不通类型
 *     intPool ： bytePool已经使用的索引
 *     postingsArray.addressOffset : 记录termId 到 intPool 的映射
 *     postingsArray.byteStarts： 记录termId 到 bytePool 的映射。
 *
 *
 *{@link org.apache.lucene.index.TermsHashPerField#add(BytesRef, int)}  存入一个分词后的词、BytesRef 为词、int为文件id
 *     1、首先通过 bytesHash 保存词，并返回这个词的编号
 *     2、对于不同情况分别调用， 第一次出现这个词：initStreamSlices、其他：positionStreamSlice
 *
 *
 *{@link org.apache.lucene.index.TermsHashPerField#initStreamSlices} 当前词第一次出现时
 *     1、分别分配bytePool 和记录 intPool、postingsArray.addressOffset、postingsArray.byteStarts的映射
 *     2、之后调用{@link org.apache.lucene.index.TermsHashPerField#newTerm(int, int)}
 *
 *
 *{@link org.apache.lucene.index.TermsHashPerField#positionStreamSlice} 多次出现时调用
 *      调用{@link org.apache.lucene.index.TermsHashPerField#addTerm(int, int)} 子类实现
 *
 *{@link org.apache.lucene.index.TermsHashPerField#writeByte} 在 bytePool 中写内容
 *      stream 第几个流
 *      b 内容
 *      1、首先通过termStreamAddressBuffer 也就是正在使用的intPool ，计算出bytePool 的位置，
 *      2、判断是否需要扩容，即写入的地方是否为0，不需要就直接写，否则扩容
 *      3、扩容是通过 allocSlice 方法，会在 当前位置记录下一个块的索引
 *
 *
 *</pre>
 *
 *
 */
public class TermsHashPerField {

    public static void main(String[] args)
        throws IOException
    {
        MAIN();
    }
    public static void MAIN() throws IOException
    {
        // 0. Specify the analyzer for tokenizing text.
        //    The same analyzer should be used for indexing and searching
        StandardAnalyzer analyzer = new StandardAnalyzer();
        // 1. create the index
        Directory directory = FSDirectory.open(Paths.get("tempPath"));
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        IndexWriter w = new IndexWriter(directory, config);
        addDoc(w, "Lucene Action lucene");
        addDoc(w, "like Lucene and CPP");
        addDoc(w, "Lucene and lucene");

        w.close();
    }


    private static void addDoc(IndexWriter w, String title) throws IOException {
        Document doc = new Document();
        doc.add(new TextField("title", title, Field.Store.YES));
        doc.add(new TextField("title2", title, Field.Store.YES));

        w.addDocument(doc);
    }


}
