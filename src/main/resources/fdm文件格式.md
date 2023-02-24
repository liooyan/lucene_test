# 1 IndexHeader

与 fdt 相同， CodecName 位 Lucene85FieldsIndexMeta


# chunkSize

chunk 的数量 vint，每个chunk包含多少个doc


# Version
 版本号，默认 2

# 其他内容

- numDocs 文本数量
- blockShift 多少chunk的数据进行一个block存储
- totalChunks 总共有多少个chunk


数量相关的斜率

- fdxStartPointer  fdx 的开始位置
- Min  通过编码计算的最小值
- AvgInc 通过编码计算的平均斜率
- ChunDocsNumIndex 从开始写入到现在, fdx文件的偏移量
- BitRequired
- fdxEndPointer fdx 的结束位置


位置相关的斜率

- Min  通过编码计算的最小值
- AvgInc 通过编码计算的平均斜率
- ChunDocsNumIndex 从开始写入到现在, fdx文件的偏移量
- BitRequired

- fdxEndPointer fdx 的结束位置
- maxPointer 在fdt文件中最大位置



- numChunks
- numDirtyChunks
- numDirtyDocs
- footer

