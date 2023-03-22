package cn.lioyan.lucene.codecs;

/**
 * {@link org.apache.lucene.codecs.MultiLevelSkipListWriter}
 *<pre>
 *     多级跳表写类，用于生成多级跳表
 *      skipInterval 跳表的间隔
 *      skipMultiplier 不同等级间的间隔数
 *      maxSkipLevels  最大的跳表等级
 *      df  跳表的总数
 *
 *
 * 成员变量：
 *      numberOfSkipLevels 当前跳表需要的等级
 *
 * {@link org.apache.lucene.codecs.MultiLevelSkipListWriter#init()}
 *      初始化
 *      skipBuffer 初始化了一个numberOfSkipLevels 的内存空间
 *
 * {@link org.apache.lucene.codecs.MultiLevelSkipListWriter#bufferSkip}
 *      写跳表
 *      首先 计算出当前id 需要写几级跳表
 *      然后依次调用  writeSkipData 写 跳表，如果不是底层，需要 writeChildPointer 记录低层跳表的内容
 *
 *
 * {@link org.apache.lucene.codecs.MultiLevelSkipListWriter#writeSkip}
 *      将skipBuffer 内容 写到文件中， 先写高级跳表 。后写低级跳表
 *
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/22  13:35
 */
public class MultiLevelSkipListWriter
{
}
