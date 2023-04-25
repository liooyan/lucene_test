package cn.lioyan.lucene.util;

import org.apache.lucene.util.BytesRef;


/**
 * {@link org.apache.lucene.util.ByteBlockPool}
 * <pre>
 *     存储 Byte 的切片池子。 通过二维数组构成
 *     当需要扩容时，通过添加第一维的数量进行扩容
 *     我们可以程
 *     buffers ： 已经存储完成的数据
 *     buffer : 当前正在使用的数据
 *     byteOffset：buffers 中数据的使用空间
 *     bufferUpto ：buffers 使用的长度
 *     byteUpto： buffer 中已经使用空间的数量
 * {@link org.apache.lucene.util.ByteBlockPool#nextBuffer()}
 *      将现在的 buffer 存储到 buffers中，
 *      并为 buffer 申请新空间，buffers如果不够，扩容
 *      设置几个不同的标志位
 * {@link org.apache.lucene.util.ByteBlockPool#newSlice}
 *      申请 x 个空间，并返回当前空间开始的下标。
 *      申请空间时，将新空间的最后以为设为 16。 16 表示下一个分片将分片的空间
 *      如果空间不够，就调用 nextBuffer
 * {@link org.apache.lucene.util.ByteBlockPool#allocSlice}
 *      当申请的切片使用完后，重新申请切片.
 *      申请新的空闲空间，并腾出4个空间，记录下一个的索引
 * {@link org.apache.lucene.util.ByteBlockPool#setBytesRef(BytesRef, int)}
 *      将 int 位 的内容设置到BytesRef ，他的第一位位长度
 * TODO 对于读取，目前没碰到。后面详细解析
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/3/9  13:28
 */
public class ByteBlockPool
{

    public static void main(String[] args)
    {

        org.apache.lucene.util.ByteBlockPool byteBlockPool = new org.apache.lucene.util.ByteBlockPool(new org.apache.lucene.util.ByteBlockPool.DirectAllocator());
        int index = byteBlockPool.newSlice(5);
        byte[] buffer = byteBlockPool.buffer;
        for (int i = index;index < 100000 ; i++)
        {
            if (buffer[i] != 0)
            {
                index = byteBlockPool.allocSlice(buffer, i);
                buffer = byteBlockPool.buffer;
                i = index-1;
                continue;
            }
            buffer[i] = 17;
        }
    }

}
