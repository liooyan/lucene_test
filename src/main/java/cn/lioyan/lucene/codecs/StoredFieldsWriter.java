package cn.lioyan.lucene.codecs;

import org.apache.lucene.index.FieldInfo;
import org.apache.lucene.index.IndexableField;


/**
 * {@link org.apache.lucene.codecs.StoredFieldsWriter}
 *<pre>
 *     原始数据存储落盘类
 * 几个抽象方法：
 *      startDocument 开始保存一个文档之前
 *      finishDocument 一个文档保存结束之后
 *
 *      writeField 写一个字段参数：{@link FieldInfo} 字段的属性 {@link IndexableField} 字段的值
 *      finish 完成当前分段时，调用
 *
 *      merge 合并 //TODO
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/2  18:46
 */
public class StoredFieldsWriter
{
}
