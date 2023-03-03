package org.apache.lucene.index;


import org.apache.lucene.search.DocIdSetIterator;
import org.apache.lucene.util.BitSetIterator;
import org.apache.lucene.util.FixedBitSet;

public class DocsWithFieldSetTest  {


    private DocsWithFieldSet docsWithFieldSet =new DocsWithFieldSet();
    public void add(int docID) {
      docsWithFieldSet.add(docID);
    }

    public long ramBytesUsed() {
      return docsWithFieldSet.ramBytesUsed();
    }

    public DocIdSetIterator iterator() {
       return docsWithFieldSet.iterator();
    }
}
