package cn.lioyan.lucene.index;

import cn.lioyan.lucene.util.ByteBlockPool;


/**
 * {@link org.apache.lucene.index.ByteSliceReader}
 *<pre>
 *     {@link ByteBlockPool} 内容的读取方法
 *
 *  初始化
 * {@link org.apache.lucene.index.ByteSliceReader#init}
 *      ByteBlockPool 读取的内容
 *      startIndex  开始的索引
 *      endIndex    结束的索引
 *  设置一些遍历的初始化内容：
 *      bufferUpto 当前读取数组的索引
 *      bufferOffset  当前读取数组的数量
 *      buffer 正在读取的数组
 *      upto  当前读取数组的偏移量
 *      limit 当前块的最大限制
 *
 * {@link org.apache.lucene.index.ByteSliceReader#eof}
 *      判断是否有数据未读取
 *
 * {@link org.apache.lucene.index.ByteSliceReader#readByte()}
 *      读取数据
 *      读取数组 buffer， 并且 upto++
 *      主要在 nextSlice ，切换
 *
 * {@link org.apache.lucene.index.ByteSliceReader#nextSlice}
 *      通过最后的4个字节获取下一个索引
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/14  12:07
 */
public class ByteSliceReader
{
}
