package cn.lioyan.lucene.store;

import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Checksum;


/**
 * {@link org.apache.lucene.store.OutputStreamIndexOutput}
 *<pre>
 *     {@link  DataOutput} 的子类
 *     实现 writeBytes ，通过构造函数传入的{@link OutputStream} 对象
 *
 *     其中包含{@link java.util.zip.CRC32} 方法，用于计算crc32校验码
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/23  11:24
 */
public class OutputStreamIndexOutput
{
    public static void main(String[] args) {
        int bytes = 55;

        Checksum checksum = new CRC32();
        checksum.reset();

        checksum.update(bytes);
        long checksumValue = checksum.getValue();

        System.out.println("CRC32 checksum :" + checksumValue);
    }


}
