package cn.lioyan.lucene.index;

import org.apache.lucene.index.IndexOptions;


/**
 * {@link org.apache.lucene.index.IndexableFieldType}
 * <pre>
 *     索引字段熟悉
 *     stored 使用用于存储
 *     tokenized  是否有 Analyzer，
 *     storeTermVectors          字段的索引形式也应存储到术语向量中，
 *     storeTermVectorOffsets    如果此字段的标记字符偏移量也应存储到术语向量中，则为True
 *     storeTermVectorPositions  如果此字段的标记位置也应存储到术语向量中，则为True。
 *     storeTermVectorPayloads   如果该字段的令牌有效载荷也应存储到术语向量中，则为True
 *     omitNorms  如果字段应省略规范化值，则为True。
 *     indexOptions   描述应记录到反转索引中的内容  {@link  IndexOptions}
 *     docValuesType 存储值类型，{@link  DocValuesType}
 *     pointDimensionCount   如果该值为正值（表示点维度的数量），则字段将作为点进行索引。
 *     pointIndexDimensionCount 用于索引键的维度数
 *     pointNumBytes  每个维度值中的字节数。
 *     getAttributes  字段类型的属性。
 *
 *
 *
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/3/2  11:56
 */
public class IndexableFieldType
{
}
