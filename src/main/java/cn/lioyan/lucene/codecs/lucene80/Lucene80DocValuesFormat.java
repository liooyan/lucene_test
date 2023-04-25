package cn.lioyan.lucene.codecs.lucene80;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.SegmentInfo;
import org.apache.lucene.index.SegmentReadState;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;


/**
 * {@link org.apache.lucene.codecs.lucene80.Lucene80DocValuesFormat}
 *
 * @author com.lioyan
 * @date 2023/4/14  17:40
 */
public class Lucene80DocValuesFormat
{
    public static void main(String[] args)
        throws IOException
    {
//        Directory directory = FSDirectory.open(Paths.get("tempPath"));
//        IndexReader reader = DirectoryReader.open(directory);
//        reader.getContext().segmentInfos.get(0);
//        SegmentInfo segmentInfo = new SegmentInfo();
//        SegmentReadState state = new SegmentReadState(directory, SegmentInfo.NO);
//
//
//        org.apache.lucene.codecs.lucene80.Lucene80DocValuesFormat format = new org.apache.lucene.codecs.lucene80.Lucene80DocValuesFormat();
//        format.fieldsProducer(state)
    }
}
