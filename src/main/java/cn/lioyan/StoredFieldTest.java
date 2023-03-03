package cn.lioyan;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
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
        throws IOException, ParseException
    {
        MAIN();
    }

    public static void MAIN()
        throws IOException, ParseException
    {
        // 指定analyzer
        StandardAnalyzer analyzer = new StandardAnalyzer();

        // 指定目录
        Directory directory = FSDirectory.open(Paths.get("tempPath"));
        // 指定config
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        config.setUseCompoundFile(false);
        // 建立IndexWriter
        IndexWriter w = new IndexWriter(directory, config);
        // 创建document
        for (int i = 0; i < 100000; i++)
        {
            add(w,i%2 == 0);
        }
        // 落盘flush
        w.close();
        read(  );

    }

    public static void add(  IndexWriter w,Boolean fa)
        throws IOException
    {
        Document doc = new Document();
        doc.add(new TextField("title", "This is the text to be indexed.", Field.Store.YES));
        if(fa){
            doc.add(new StringField("isbn", "193398817", Field.Store.YES));
        }
        doc.add(new StoredField("visit", 25));
        doc.add(new SortedNumericDocValuesField("visit", 5));
        // 添加document到indexWriter
        w.addDocument(doc);
    }
    public static void read(  )
        throws IOException, ParseException
    {
        // 指定analyzer
        StandardAnalyzer analyzer = new StandardAnalyzer();
        Directory directory = FSDirectory.open(Paths.get("tempPath"));
        // Now search the index:
        DirectoryReader ireader = DirectoryReader.open(directory);
        IndexSearcher isearcher = new IndexSearcher(ireader);
        // Parse a simple query that searches for "text":
        QueryParser parser = new QueryParser("title", analyzer);
        Query query = parser.parse("text");
        ScoreDoc[] hits = isearcher.search(query, Integer.MAX_VALUE).scoreDocs;
        // Iterate through the results:
        for (int i = 0; i < hits.length; i++) {
            Document hitDoc = isearcher.doc(hits[i].doc);
            IndexableField title = hitDoc.getField("title");
            System.out.println(title);
        }
        ireader.close();
    }
}
