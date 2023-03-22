package cn.lioyan.lucene.codecs.lucene84;

/**
 * {@link org.apache.lucene.codecs.lucene84.Lucene84PostingsWriter}
 *<pre>
 *     doc 、pos文档生成
 *
 * doc 用于存储 trem  所在的文档id和频率
 * pos 位置、偏移量
 *
 * startTerm 一个term开始时调用
 * startDoc  记录这个term出现的文档与频率
 * addPosition 添加 position 相关数据
 * finishDoc 完成当前文档的term记录
 * finishTerm 完成当前term时调用
 *
 *
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/24  18:46
 */
public class Lucene84PostingsWriter
{
}
