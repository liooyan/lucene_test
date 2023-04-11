package cn.lioyan;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.BytesRef;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;


/**
 * {@link DocValueTest}
 * 数据类型：https://blog.csdn.net/AmbHowie/article/details/105575815
 * @author com.lioyan
 * @date 2023/2/21  18:00
 */
public class DocValueTest
{
static  Random random = new Random(100);
    public static void main(String[] args)
        throws IOException, ParseException
    {
        MAIN();
    }

    public static void MAIN() throws IOException {
//        // 0. Specify the analyzer for tokenizing text.
//        //    The same analyzer should be used for indexing and searching
        StandardAnalyzer analyzer = new StandardAnalyzer();
//
//        // 1. create the index
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        config.setUseCompoundFile(false);
//        SortedSetSortField sortedSetSortField = new SortedSetSortField("title",true,SortedSetSelector.Type.MIN);
//        config.setIndexSort(new Sort(sortedSetSortField));
        IndexWriter w = new IndexWriter(directory, config);
        for (int i = 0; i < 200000; i++)
        {
            addDoc(w, "Lucene Lucene in Action", "193398817", -5, new int[]{1,2}, new String[]{"los angles", "beijing"});
            addDoc(w, "Lucene for Dummies", "55320055Z", 4, new int[]{5,1}, new String[]{"shanghai", "beijing"});
            addDoc(w, "Managing Gigabytes", "55063554A", 12, new int[]{0, 1, 2}, new String[]{"shenzhen", "guangzhou"});
            addDoc(w, "The Art of Computer Science", "9900333X", 2, new int[]{10, 4, 3}, new String[]{"shanghai", "los angles"});
            addDoc(w, "C++ Primer", "914324235", 11, new int[]{0, 5, 2, 3}, new String[]{"beijing", "shenzhen"});
            addDoc(w, "I like Lucene", "fdsjfa2313", 1, new int[]{0, 1, 2, 4}, new String[]{"nanjing", "tianjin"});
            addDoc(w, "Lucene and C++ Primer", "fdsfaf", 10, new int[]{0, 1, 2}, new String[]{"shenzhen", "guangzhou"});
            addDoc(w, "C++ api", "411223432", 2, new int[]{0, 11, 2}, new String[]{"shenzhen", "shanghai"});
            addDoc(w, "C++ Primer", "914324236", 50, new int[]{3,2,6,1}, new String[]{"beijing"});

        }
        w.close();

        // 2. query
        String querystr =  "primer";

        // the "title" arg specifies the default field to use
        // when no field is explicitly specified in the query.
         Query q = new TermQuery(new Term("title", querystr));
//         BooleanQuery query = new BooleanQuery();
//        MatchAllDocsQuery q = new MatchAllDocsQuery();

        //sort
        SortField visitSort = new SortedNumericSortField("visit", SortField.Type.INT, false);
        Sort sort = new Sort(visitSort);

        // 3. search
        int hitsPerPage = 10;
        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);
        for (int i = 0; i < 3; i++)
        {
            long startTime = System.currentTimeMillis();
            TopDocs docs = searcher.search(q, hitsPerPage, sort);
            ScoreDoc[] hits = docs.scoreDocs;

            // 4. display results
            System.out.println("Found " + hits.length + " hits.");
            for(int j=0;j<hits.length;++j) {
                int docId = hits[j].doc;
                Document d = searcher.doc(docId);
                System.out.println(docId + ". " + d.get("isbn") + "\t" + d.get("title") + "\t" + d.get("visit"));
            }
            System.out.println("查询时间："+ (System.currentTimeMillis()-startTime));
        }


        // reader can only be closed when there
        // is no need to access the documents any more.
        reader.close();
    }
    private static void addDoc(IndexWriter w, String title, String isbn, int visit, int [] sale_list, String []locations) throws IOException {
        Document doc = new Document();
//        doc.add(new StoredField("visit", visit));
        doc.add(new TextField("title", title, Field.Store.YES));
        doc.add(new TextField("title", title, Field.Store.YES));
        int visit2 = random.nextInt(10000);

        // use a string field for isbn because we don't want it tokenized
        doc.add(new StringField("isbn", isbn, Field.Store.YES));
        doc.add(new SortedDocValuesField("title",new BytesRef(title)));
        if(visit2 != 33){
            doc.add(new NumericDocValuesField("visit", visit2));
            doc.add(new StoredField("visit", visit2));
        }
        for (int sale : sale_list){
            doc.add(new SortedNumericDocValuesField("sale", sale));
            doc.add(new SortedNumericDocValuesField("sale", sale));
        }

        for (String location: locations){
            doc.add(new SortedSetDocValuesField("city", new BytesRef(location)));
        }

        w.addDocument(doc);
    }
}
