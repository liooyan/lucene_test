package cn.lioyan.lucene.util.packed;

/**
 * {@link org.apache.lucene.util.packed.DeltaPackedLongValues}
 *<pre>
 *     在父类的基础上，添加了 打包时的差值，计算。这样就可以方式数据过大造成数据浪费
 *
 *
 *</pre>
 *
 */
public class DeltaPackedLongValues {

    public static void main(String[] args) {
        org.apache.lucene.util.packed.PackedLongValues.Builder builder =  org.apache.lucene.util.packed.PackedLongValues.deltaPackedBuilder(256, 0.0F);

        for (int i = 0; i < 100000 ; i++) {
            builder.add(System.currentTimeMillis());
            builder.add(System.currentTimeMillis());
            builder.add(System.currentTimeMillis());
        }

        org.apache.lucene.util.packed.PackedLongValues build = builder.build();

        org.apache.lucene.util.packed.PackedLongValues.Iterator iterator = build.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
