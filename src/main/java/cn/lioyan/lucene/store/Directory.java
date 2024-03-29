package cn.lioyan.lucene.store;

import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.IOContext;
import org.apache.lucene.store.IndexOutput;

import java.io.IOException;
import java.nio.file.Paths;


/**
 * {@link org.apache.lucene.store.Directory}
 *<pre>
 *     文件管理接口，指定某个目录。对这个目录下的文件一些操作
 *      默认方法有几种基本数据类型，和string。 string 为先长度，后内容。
 *      其中 写 byte 方法未实现。
 *
 *      特殊的有：变长数字： vint  一个字节，第一位为标志位，判断下一位使用有内容，后面7位为内容
 *              和表示负数的 zint
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/22  13:12
 */
public class Directory
{

    public static void main(String[] args)
        throws IOException
    {
        org.apache.lucene.store.Directory directory = FSDirectory.open(Paths.get("tempPath"));
        String[] strings = directory.listAll();
        System.out.println(strings);

        IndexOutput test = directory.createOutput("test", IOContext.DEFAULT);

        test.writeByte((byte)'a');

        test.close();
    }
}
