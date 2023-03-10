package cn.lioyan.lucene.index;



/**
 * {@link org.apache.lucene.index.DefaultIndexingChain}
 *<pre>
 *
 * 核心类
 *
 * 构造函数：
 *      创建 {@link org.apache.lucene.index.FreqProxTermsWriter} 他的addField 方法创建了{@link FreqProxTermsWriterPerField}对象，存储倒排索引
 *
 *
 *
 * {@link org.apache.lucene.index.DefaultIndexingChain.PerField#invert}
 * 反向索引，每个字段都是一个单独的对象
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/22  9:40
 */
public class DefaultIndexingChain
{

    /**
     * {@link org.apache.lucene.index.DefaultIndexingChain.PerField}
     * <pre>
     *     在 DefaultIndexingChain 中关于字段属性的存储解析：
     * {@link org.apache.lucene.index.DefaultIndexingChain#getOrAddField}
     *  根据  name和 IndexableFieldType获取PerField 对象，如果PerField没有，则新建
     *
     * 对于PerField 本身就是一个链表。 与hashmap类似，被保存在 {@link org.apache.lucene.index.DefaultIndexingChain#fieldHash} 中
     *
     * 主要逻辑为PerField 创建。其中主要属性：FieldInfo
     * FieldInfo 是通过{@link FieldInfos} 创建的。其中编号也是通过他生成的
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * </pre>
     *
     */
    public static class PerField{




    }
}
