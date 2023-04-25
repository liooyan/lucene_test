package cn.lioyan.lucene.store;

import java.io.IOException;


/**
 * {@link org.apache.lucene.store.DataInput}
 *
 * @author com.lioyan
 * @date 2023/4/13  18:43
 */
public class DataInput
{
    public static void main(String[] args)
        throws IOException
    {
        byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        org.apache.lucene.store.DataInput dataInput = new org.apache.lucene.store.DataInput()
        {
            int user = 0;

            @Override
            public byte readByte()
                throws IOException
            {
                return bytes[user++];
            }

            @Override
            public void readBytes(byte[] b, int offset, int len)
                throws IOException
            {
                for (int i = offset; i < len; i++)
                {
                    b[i] = readByte();
                }
            }
        };
        for (int i = 0; i < bytes.length; i++)
        {
            byte b = dataInput.readByte();
            System.out.println(b);
        }

    }
}
