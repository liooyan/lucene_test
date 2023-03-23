package cn.lioyan.test;

import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.BytesRefBuilder;
import org.apache.lucene.util.IntsRef;
import org.apache.lucene.util.IntsRefBuilder;
import org.apache.lucene.util.fst.Builder;
import org.apache.lucene.util.fst.FST;
import org.apache.lucene.util.fst.PositiveIntOutputs;
import org.apache.lucene.util.fst.Util;


/**
 * {@link FSTTest}
 *
 * @author com.lioyan
 * @date 2023/3/22  21:05
 */
public class FSTTest
{

    public static void main(String[] args)
    {
        try
        {
            String inputValues[] = {"cat", "deep", "do", "dog", "dogs","adogsg"};
            long outputValues[] = {5, 7, 17, 18, 21,99};
            PositiveIntOutputs outputs = PositiveIntOutputs.getSingleton();
            Builder<Long> builder = new Builder<>(FST.INPUT_TYPE.BYTE1, outputs);
            BytesRefBuilder scratchBytes = new BytesRefBuilder();
            IntsRefBuilder scratchInts = new IntsRefBuilder();
            for (int i = 0; i < inputValues.length; i++)
            {
                scratchBytes.copyChars(inputValues[i]);
                IntsRef intsRef = Util.toIntsRef(scratchBytes.get(), scratchInts);
                builder.add(intsRef, outputValues[i]);
            }
            FST<Long> fst = builder.finish();
            Long value = Util.get(fst, new BytesRef("dogsg"));
            long ramBytes = fst.ramBytesUsed();
            System.out.println(value); // 18
            System.out.println(ramBytes);
        }
        catch (Exception e)
        {
            ;
        }
    }
}
