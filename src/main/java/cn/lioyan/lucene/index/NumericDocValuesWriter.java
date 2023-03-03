package cn.lioyan.lucene.index;


import org.apache.lucene.codecs.DocValuesConsumer;
import org.apache.lucene.index.SegmentWriteState;

/**
 * {@link  org.apache.lucene.index.NumericDocValuesWriter}
 *
 * <pre>
 *    落盘 Numeric 类型数据。
 *    通过{@link  org.apache.lucene.util.packed.DeltaPackedLongValues} 记录值
 *    通过{@link  org.apache.lucene.index.DocsWithFieldSet} 记录id
 *
 *    最后将他们组装为{@link SortedNumericDocValues} 对象
 *
 *    在 {@link  org.apache.lucene.index.NumericDocValuesWriter#flush}
 *    调用DocValuesConsumer 的方法
 *
 * </pre>
 *
 *
 */
public class NumericDocValuesWriter {
}
