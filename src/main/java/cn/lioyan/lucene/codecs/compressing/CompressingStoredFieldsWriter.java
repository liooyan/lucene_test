package cn.lioyan.lucene.codecs.compressing;

import org.apache.lucene.index.FieldInfo;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.index.SegmentInfo;
import org.apache.lucene.store.ByteBuffersDataOutput;


/**
 * {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter}
 *<pre>
 *正排索引生成类。包括 ：fdt、fdx、fdm
 *构造方法：
 * 通过参数 {@link SegmentInfo} 识别是哪个段
 * metaStream fdm 对 fdx 的索引
 * indexWriter fdx ，对fdt的索引
 * fieldsStream fdt。保存数据
 * 完成了 metaStream 与 fieldsStream 的Header。
 *
 *
 *  {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#startDocument}
 *  无任何实现
 *
 *
 *  {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#writeField}
 *  将 字段值 零时写入到 {@link ByteBuffersDataOutput} 缓存中
 *
 *
 *  在一个文档保存完成后 执行
 *  {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#finishDocument}
 *  1、记录几个值
 *      numBufferedDocs 当前文档数量
 *      numStoredFields 每个文档的字段数量
 *      endOffsets 每个节点结束后对于 {@link ByteBuffersDataOutput} 的偏移量
 *  2、判断是否需要刷新落盘，条件：1、当前存储文件大小大于chunkSize，当前文件数量是否大于maxDocsPerChunk
 *      如果需要刷新就执行   {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#flush}
 *
 * 落盘
 * {@link org.apache.lucene.codecs.compressing.CompressingStoredFieldsWriter#flush}
 * 首先 numChunks 记录当前是第几个块。
 *
 *
 *
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/22  9:56
 */
public class CompressingStoredFieldsWriter
{
}
