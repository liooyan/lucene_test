package cn.lioyan.lucene.codecs.blocktree;

import org.apache.lucene.codecs.NormsProducer;
import org.apache.lucene.index.Fields;


/**
 * {@link org.apache.lucene.codecs.blocktree.BlockTreeTermsWriter}
 *<pre>
 *     基于块的术语索引和词典编写器
 * {@link org.apache.lucene.codecs.blocktree.BlockTreeTermsWriter#write(Fields, NormsProducer)}
 *      在分词刷新时调用
 *
 * {@link org.apache.lucene.codecs.blocktree.BlockTreeTermsWriter.TermsWriter#finish}
 *      完成一个term后调用，在这里完成对fst 的建立
 *
 *
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/9  10:54
 */
public class BlockTreeTermsWriter
{
}
