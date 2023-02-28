package cn.lioyan.lucene.index;


import org.apache.lucene.index.DocsWithFieldSetTest;
import org.apache.lucene.search.DocIdSetIterator;
import org.apache.lucene.util.FixedBitSet;

import java.io.IOException;

/**
 * {@link org.apache.lucene.index.DocsWithFieldSet}
 * <pre>
 *     用于记录docid，通过 add 方法，添加id。 iterator 获取id
 *     这里要求，id必须自增
 *
 *      如果是连续的，就直接记录，不是连续的，就需要{@link FixedBitSet} 记录。
 *      它事业数组，一个 bit表示有当前的docId
 * </pre>
 */
public class DocsWithFieldSet {

    public static void main(String[] args) throws IOException {

        DocsWithFieldSetTest docsWithFieldSetTest = new DocsWithFieldSetTest();
        for (int i = Integer.MAX_VALUE-1000000; i < Integer.MAX_VALUE-1; i++) {
            if(i == Integer.MAX_VALUE-444){
                continue;
            }
            docsWithFieldSetTest.add(i);
        }
        DocIdSetIterator iterator = docsWithFieldSetTest.iterator();
        int doc;
        while ((doc = iterator.nextDoc()) != Integer.MAX_VALUE) {
            System.out.println(doc);
        }
    }
}
