package cn.lioyan.lucene.util;

import org.apache.lucene.util.BytesRef;


/**
 * {@link org.apache.lucene.util.BytesRefHash}
 * <pre>
 *     它是一个特殊的保存.BytesRef 的 hash字典
 *     通过add 添加数据， 返回的id的自增的。
 *     如果已经存在，返回的 是 +1 取反
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/27  13:51
 */
public class BytesRefHash
{
    public static void main(String[] args)
    {
        org.apache.lucene.util.BytesRefHash bytesRefHash = new org.apache.lucene.util.BytesRefHash();
        int liyan = bytesRefHash.add(new BytesRef(new String("liyan").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan1").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan1").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan1").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan2").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan3").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan4").getBytes()));
         liyan = bytesRefHash.add(new BytesRef(new String("liyan5").getBytes()));
        System.out.println(liyan);

    }
}
