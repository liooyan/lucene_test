package cn.lioyan.test;

import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.BytesRefBuilder;
import org.apache.lucene.util.IntsRefBuilder;
import org.apache.lucene.util.fst.Builder;
import org.apache.lucene.util.fst.FST;
import org.apache.lucene.util.fst.PositiveIntOutputs;
import org.apache.lucene.util.fst.Util;

import java.util.Calendar;
import java.util.Date;


/**
 * {@link Test}
 *
 * @author com.lioyan
 * @date 2023/3/22  21:05
 */
public class Test
{

    public static void main(String[] args)
    {

        System.out.println(getExpression());
    }

    public  static  String getExpression(){
        Calendar beforeTime = Calendar.getInstance();
        beforeTime.add(Calendar.MINUTE, 5);
        int year = beforeTime.get(Calendar.YEAR);
        int month = beforeTime.get(Calendar.MONTH)+1;
        int day = beforeTime.get(Calendar.DAY_OF_MONTH);
        int hour = beforeTime.get(Calendar.HOUR_OF_DAY);
        int minute = beforeTime.get(Calendar.MINUTE);

        return minute+" "+hour+" "+day+" "+month+" "+year;
    }
}
