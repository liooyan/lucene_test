package cn.lioyan.lucene.codecs.lucene80;

/**
 * {@link org.apache.lucene.codecs.lucene80.Lucene80DocValuesConsumer}
 *<pre>
 *     写 dvd、dvm 文件。 用于存储 列数据
 *
 *
 * 核心方法：
 * {@link  org.apache.lucene.codecs.lucene80.Lucene80DocValuesConsumer#writeValues}  用于保存数值类型
 *  这里可能 key--value 一对一，也可能key-value 一对多。
 *  对于dvd都是一样的，区别在于 dvm多记录一个每个docId 的value偏移量
 *
 *  {@link  org.apache.lucene.codecs.lucene80.Lucene80DocValuesConsumer#addBinaryField}
 *  处理 字符数组类型
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/6  13:35
 */
public class Lucene80DocValuesConsumer
{
}
