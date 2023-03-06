package cn.lioyan.lucene.index;

import org.apache.lucene.store.DataOutput;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.packed.PackedLongValues;


/**
 * {@link org.apache.lucene.index.BinaryDocValuesWriter}
 *<pre>
 *  用于保存 {@link BytesRef} 类型的数据，保存大数组
 *  基本逻辑与{@link NumericDocValuesWriter}
 *  值的保存通过 {@link  DataOutput} 将所有的值进行保存。
 *  {@link PackedLongValues} 保存 DataOutput 的下标
 *
 *
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/6  11:03
 */
public class BinaryDocValuesWriter
{
}
