package cn.lioyan;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;


/**
 * {@link StoredFieldTest}
 * 数据类型：https://blog.csdn.net/AmbHowie/article/details/105575815
 * @author com.lioyan
 * @date 2023/2/21  18:00
 */
public class StoredFieldTest
{

    public static void main(String[] args)
        throws IOException
    {
        MAIN();
    }

    public static void MAIN()
        throws IOException
    {
        // 指定analyzer
        StandardAnalyzer analyzer = new StandardAnalyzer();

        // 指定目录
        Directory directory = FSDirectory.open(Paths.get("tempPath"));
        // 指定config
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        // 建立IndexWriter
        IndexWriter w = new IndexWriter(directory, config);
        // 创建document
        Document doc = new Document();
        doc.add(new TextField("title", "Lucene in action", Field.Store.YES));
        doc.add(new StringField("isbn", "193398817", Field.Store.YES));
        doc.add(new StoredField("visit", 5));
        doc.add(new SortedNumericDocValuesField("visit", 5));
        // 添加document到indexWriter
        w.addDocument(doc);
        // 落盘flush
        w.close();

    }
}
