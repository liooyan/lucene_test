package cn.lioyan.lucene.util;

/**
 * {@link org.apache.lucene.util.FutureArrays}
 *
 *
 * 计算两个 byte数组之间的前缀最大相同数
 * {@link org.apache.lucene.util.FutureArrays#mismatch}
 * @author com.lioyan
 * @date 2023/3/22  17:00
 */
public class FutureArrays
{

    public static void main(String[] args)
    {
        byte[] a = "12345".getBytes();
        byte[] b = "122457".getBytes();

        int mismatch = org.apache.lucene.util.FutureArrays.mismatch(a, 0, a.length, b, 0, b.length);
        System.out.println(mismatch);
    }
}
