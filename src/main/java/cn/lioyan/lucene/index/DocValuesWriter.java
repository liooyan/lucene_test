package cn.lioyan.lucene.index;

import org.apache.lucene.index.DocValuesType;


/**
 * {@link org.apache.lucene.index.DocValuesWriter}
 *<pre>
 *     将某一列 数据 落盘
 *     通过 {@link  org.apache.lucene.index.DefaultIndexingChain.PerField#docValuesWriter} 与文档的每个字段绑定
 *      通过{@link DocValuesType} 的不同使用不同的实例化格式
 *      {@link DocValuesType#NUMERIC}  {@link org.apache.lucene.index.NumericDocValuesWriter}
 *      {@link DocValuesType#BINARY}  {@link org.apache.lucene.index.BinaryDocValuesWriter}
 *      {@link DocValuesType#SORTED}  {@link org.apache.lucene.index.SortedDocValuesWriter}
 *      {@link DocValuesType#SORTED_NUMERIC}  {@link org.apache.lucene.index.SortedNumericDocValuesWriter}
 *      {@link DocValuesType#SORTED_SET}  {@link org.apache.lucene.index.SortedSetDocValuesWriter}
 *
 * 分别是通过 addValue 方法执行。
 * flush 方法是在当前段完成时调用。
 *</pre>
 */
public class DocValuesWriter {
}
