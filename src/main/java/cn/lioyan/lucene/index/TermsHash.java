package cn.lioyan.lucene.index;

import org.apache.lucene.index.FieldInfo;


/**
 * {@link org.apache.lucene.index.TermsHash}
 * <pre>
 *     为各个字段的 {@link TermsHashPerField} 提供存储，如：
 *      bytePool:
 *      intPool ：
 *      也就是说 不同字段的TermsHashPerField 内容，其实都是存储在一起的。
 *      通过 {@link org.apache.lucene.index.TermsHash#addField} 方法创建各个字段不同的{@link TermsHashPerField} 对象
 *      虽然 内容都存储在一起，但 addField 方法传入了：{@link FieldInfo} 对象。
 *      在 postingsArray变量中保存了各自字段在 bytePool中的偏移量
 * {@link org.apache.lucene.index.TermsHash#flush} 为倒排索引的落盘方法
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/3/9  9:44
 */
public class TermsHash
{
}
