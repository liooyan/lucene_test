package cn.lioyan.lucene.util.packed;

import java.util.Random;


/**
 * {@link org.apache.lucene.util.packed.PackedLongValues}
 * <pre>
 *     用于存储 打包后的 一批 long 类型数据，
 *     通过 {@link org.apache.lucene.util.packed.PackedLongValues#iterator()} 可以变量这些数据
 *     猜想：计算处 这些数据最大需要占用的位数，然后进行压缩
 *      pageSize 为 多少个字符后进行压缩
 *
 * </pre>
 *
 *
 */
public class PackedLongValues {

    static Random random = new Random();
    public static void main(String[] args) {
        org.apache.lucene.util.packed.PackedLongValues.Builder builder =  org.apache.lucene.util.packed.PackedLongValues.packedBuilder(256, 0.0F);


        for (int i = 0; i < 1000000 ; i++) {
            builder.add(random.nextInt(10000));
        }
        org.apache.lucene.util.packed.PackedLongValues packedLongValues = builder.build();

        org.apache.lucene.util.packed.PackedLongValues.Iterator iterator = packedLongValues.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
