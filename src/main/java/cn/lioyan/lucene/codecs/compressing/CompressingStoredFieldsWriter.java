package cn.lioyan.lucene.codecs.compressing;

import org.apache.lucene.index.FieldInfo;
import org.apache.lucene.index.IndexableField;


/**
 * {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter}
 *<pre>
 *     正排索引生成类。
 *     成员变量：
 *          fieldsStream：  fdt 文件， 用于存储 原始的field信息
 *
 *       添加一个字段
 *      {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#writeField}
 *       在一个文档保存完成后 执行
 *      {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#finishDocument}
 *
 *       落盘
 *      {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#flush}
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/22  9:56
 */
public class CompressingStoredFieldsWriter
{
}
