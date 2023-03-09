package cn.lioyan.lucene.index;

/**
 * {@link org.apache.lucene.index.FreqProxFields}
 *<pre>
 *     分词字段集合，内部包含  Map<String,FreqProxTermsWriterPerField> 。保存分词结果
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/9  11:54
 */
public class FreqProxFields
{

    /**
     *  {@link org.apache.lucene.index.FreqProxFields.FreqProxTermsEnum}
     *
     *  next 获取下一个term的词
     *  通过 ParallelPostingsArray对象 获取的这个词在bytePool的下标
     *
     *
     */
    public static class FreqProxTermsEnum{

    }
}
