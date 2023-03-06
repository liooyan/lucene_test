package cn.lioyan.lucene.index;

import org.apache.lucene.util.BytesRef;


/**
 * {@link org.apache.lucene.index.SortedDocValuesWriter}
 *<pre>
 *    用于保存 多个{@link BytesRef} 类型的数据.
 *    
 * {@link org.apache.lucene.index.SortedDocValuesWriter#addOneValue(BytesRef)}
 *     值通过 BytesRefHash 保存
 *     他其实也是单值保存，只不过会有多个key
 *</pre>
 * @author com.lioyan
 * @date 2023/3/6  11:18
 */
public class SortedDocValuesWriter
{
}
