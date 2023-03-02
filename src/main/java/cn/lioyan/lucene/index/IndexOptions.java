package cn.lioyan.lucene.index;

/**
 * {@link org.apache.lucene.index.IndexOptions}
 * <pre>
 *     分词后存储类型
 *     {@link org.apache.lucene.index.IndexOptions#NONE}
 *     {@link org.apache.lucene.index.IndexOptions#DOCS}  仅对文档进行索引：省略术语频率和位置
 *     {@link org.apache.lucene.index.IndexOptions#DOCS_AND_FREQS}  只有文档和术语频率被索引：位置被省略。
 *     {@link org.apache.lucene.index.IndexOptions#DOCS_AND_FREQS_AND_POSITIONS}  索引文档、频率和位置。
 *     {@link org.apache.lucene.index.IndexOptions#DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS}  索引文档、频率、位置和偏移量。字符偏移量与位置一起编码。
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/3/2  13:38
 */
public class IndexOptions
{
}
