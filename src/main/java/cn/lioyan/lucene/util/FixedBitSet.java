package cn.lioyan.lucene.util;

/**
 * {@link org.apache.lucene.util.FixedBitSet}
 *<pre>
 *     将一组 数据 以 bit 位进行存储 用于doc 的存储
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/3/2  10:50
 */
public class FixedBitSet
{
    public static void main(String[] args)
    {
        org.apache.lucene.util.FixedBitSet fixedBitSet = new org.apache.lucene.util.FixedBitSet(300);
        fixedBitSet.set(1);
        fixedBitSet.set(2);
        fixedBitSet.set(3);
        fixedBitSet.set(4);
        fixedBitSet.set(5);
        fixedBitSet.set(6);

        boolean have7 = fixedBitSet.get(7);
        System.out.println(have7);
    }
}
