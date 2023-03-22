package cn.lioyan.lucene.codecs.lucene84;

/**
 * {@link org.apache.lucene.codecs.lucene84.Lucene84SkipWriter}
 * <pre>
 *     跳表，辅助 {@link Lucene84PostingsWriter 生成跳表}
 *
 * 当一个trem开始写时,流程如下:
 *
 {@link org.apache.lucene.codecs.lucene84.Lucene84SkipWriter#resetSkip()}
 *  重置 lastDocFP\lastPosFP\lastPayFP  分别记录几个文档的位置
 *
 *
 * {@link org.apache.lucene.codecs.lucene84.Lucene84SkipWriter#writeSkipData}
 *  首先是 docId ，后面依次是分别需要记录的几种不同的偏移量
 *
 *
 *
 *

 *
 * </pre>
 * @author com.lioyan
 * @date 2023/3/17  17:08
 */
public class Lucene84SkipWriter
{
}
