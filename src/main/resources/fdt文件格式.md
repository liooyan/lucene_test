https://cloud.tencent.com/developer/article/1783729


# 1 IndexHeader 
IndexHeader 非位两部分，第一部分为codeHeader ，所有文件都统一有的，剩下的为 fdt特有的
通过 rg.apache.lucene.codecs.CodecUtil#writeIndexHeader 生成统一的文件头

# 1.1、文件头 codeHeader

通过 rg.apache.lucene.codecs.CodecUtil#writeHeader 生成统一的文件头
所有文件的codeHeader 都是一样的， 不同类型CodecName 不同。

- 32位固定魔数: 0x3fd76c17
- CodecName  当前编码的名字: String 类型, 当前版本的 fdt 文件为: Lucene87StoredFieldsFastData
- vsersion 版本号: 32位 int类型, 版本号。 当前版本为 4


# 1.2 IndexHeader 
- SegmentID: 16位 随机id
- SegmentSuffix : 当前Segment的后缀



# 2 chunk
一个chunk 就是多个 文档的集合

# 2.1 chunkHeader

- docBase vint 格式 : 第一个docID 的值，后面的文档id根据docBase + 索引来计算
- numBufferedDocs vint 格式: 当前chunk 有多少文档，最后两位为标记位： slicedBit  dirtyBit。
- numStoredFields int数组: 记录每个文档有多少个字段。 如果值都相同，会被压缩
- lengths int数组: 记录每个文档有多长(字节)。 如果值都相同，会被压缩

# 2.2 chunk

之后就是压缩后的文本内容,未压缩时，格式如下：

- infoAndBits :vlong 类型， 最后3位表示数据类型、其他位当前字段编号
- body： 文本内容


# 3 footer

- footerCode： ~codeHeader
- 32位 固定 位 0
- crc32 验证





