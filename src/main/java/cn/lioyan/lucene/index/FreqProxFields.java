package cn.lioyan.lucene.index;

/**
 * {@link org.apache.lucene.index.FreqProxFields}
 *<pre>
 *     分词字段集合，内部类：
 *     1、 FreqProxTermsEnum term的迭代器
 *     2、FreqProxDocsEnum 某个term下的doc迭代器
 *     3、FreqProxPostingsEnum Postings 迭代器
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


    /**
     *  {@link org.apache.lucene.index.FreqProxFields.FreqProxDocsEnum}
     *
     *  读取不统计频率的 docid
     *  通过{@link ByteSliceReader} 读取bytepool中的数据
     *
     *
     */
    public static class FreqProxDocsEnum{

    }
    /**
     *  {@link org.apache.lucene.index.FreqProxFields.FreqProxPostingsEnum}
     *
     *  读取统计频率、和postings的 docid、prox、posting
     *  与 FreqProxDocsEnum 逻辑类似
     *
     *
     */
    public static class FreqProxPostingsEnum{

    }
}
