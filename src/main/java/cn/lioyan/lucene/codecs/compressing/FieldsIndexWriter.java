package cn.lioyan.lucene.codecs.compressing;

/**
 * {@link org.apache.lucene.codecs.compressing.FieldsIndexWriter}
 *<pre>
 *     在 {@link  CompressingStoredFieldsWriter} 中辅助 fdx、fdm
 *
 *      会有两个零时文件：-doc_ids，file_pointers
 *
 *
 *
 * {@link org.apache.lucene.codecs.compressing.FieldsIndexWriter#writeIndex(int, long)}
 *   在一个chunk完成时调用，
 *   参数： numDocs 当前chunk的开始文档id；startPointer，被索引文件的位置如：（fdt文件）
 *   将文档id写入到 -doc_ids; 将 位置写入到 file_pointers
 *
 *
 *
 * {@link org.apache.lucene.codecs.compressing.FieldsIndexWriter#finish}
 *    将 文档ids和位置以及索引。分别写到fdx、fdm
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/24  10:31
 */
public class FieldsIndexWriter
{
}
