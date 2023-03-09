package cn.lioyan.lucene.index;

import org.apache.lucene.codecs.NormsProducer;
import org.apache.lucene.index.SegmentWriteState;

import java.util.Map;


/**
 * {@link org.apache.lucene.index.FreqProxTermsWriter}
 *<pre>
 *     {@link  TermsHash} 子类
 *     实现对于{@link FreqProxTermsWriterPerField} 的落盘
 *
 * {@link org.apache.lucene.index.FreqProxTermsWriter#flush(Map, SegmentWriteState, org.apache.lucene.index.Sorter.DocMap, NormsProducer)}
 *      参数：fieldsToFlush：String 字段名，TermsHashPerField
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/9  9:55
 */
public class FreqProxTermsWriter
{
}
