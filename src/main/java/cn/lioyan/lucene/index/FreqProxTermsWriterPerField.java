package cn.lioyan.lucene.index;

/**
 * {@link org.apache.lucene.index.FreqProxTermsWriterPerField}
 *<pre>
 *     继承自{@link TermsHashPerField}
 *     bytePool 被分为两个 流
 *     第一个 k-v 方式。 k：docId（差值） ，出现次数
 *     第二个 为 position 位置， 前面出现次数 对应一个id就有几个
 *
 *</pre>
 *
 *
 * https://juejin.cn/post/7087218915893313544
 *
 * @author com.lioyan
 * @date 2023/3/8  15:14
 */
public class FreqProxTermsWriterPerField
{
}