package cn.lioyan.lucene.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.*;
import org.apache.lucene.util.BytesRef;
import org.apache.lucene.util.Version;

import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.util.Version;

/**
 * {@link org.apache.lucene.analysis.TokenStream}
 *
 * 分词器{@link Analyzer} 执行后，分词结果流。
 *  测试用例{@link TokenStream#displayToken}
 * {@link org.apache.lucene.analysis.TokenStream#incrementToken()} 判断是否还有词，并获取下一个解决至Attribute
 * {@link org.apache.lucene.analysis.TokenStream#reset()} 重置流，由消费者调用，使用前必须调用
 *
 *
 *
 * @author com.lioyan
 * @date 2023/2/21  17:18
 */
public class TokenStream {

    /**
     *
     * Description:         查看分词信息
     * @param str        待分词的字符串
     * @param analyzer    分词器
     *
     */
    public static void displayToken(String str,Analyzer analyzer){
        try {
            //将一个字符串创建成Token流
            org.apache.lucene.analysis.TokenStream stream  = analyzer.tokenStream("", new StringReader(str));
            //保存相应词汇
            CharTermAttribute cta = stream.getAttribute(CharTermAttribute.class);
            TermToBytesRefAttribute    termAttribute = stream.getAttribute(TermToBytesRefAttribute.class);
            TermFrequencyAttribute    termFreqAttribute = stream.addAttribute(TermFrequencyAttribute.class);
            PositionIncrementAttribute    posIncrAttribute = stream.addAttribute(PositionIncrementAttribute.class);
            OffsetAttribute       offsetAttribute = stream.addAttribute(OffsetAttribute.class);
            PayloadAttribute    payloadAttribute = stream.getAttribute(PayloadAttribute.class);
            stream.reset();
            while(stream.incrementToken()){
                BytesRef bytesRef = termAttribute.getBytesRef();
                int termFrequency = termFreqAttribute.getTermFrequency();
                int positionIncrement = posIncrAttribute.getPositionIncrement();
                int start = offsetAttribute.startOffset();
                int end = offsetAttribute.endOffset();
//                BytesRef payload = payloadAttribute.getPayload();
                System.out.print("[" + cta + "]");
                System.out.print("[" + termFrequency + "]");
                System.out.print("[" + positionIncrement + "]");
            }
            stream.end();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Analyzer aly1 = new StandardAnalyzer();

        String str = "hello kim kim,I am dennisit dennisit,我是 中国人,my email is dennisit@163.com, and my QQ is 1325103287";

        TokenStream.displayToken(str, aly1);
        TokenStream.displayToken(str, aly1);
        TokenStream.displayToken(str, aly1);
        TokenStream.displayToken(str, aly1);
    }
}
