// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/raft.proto

package com.xbb.javakv.connect.peer.message;

/**
 * Protobuf type {@code com.xbb.javakv.connect.peer.message.Entry}
 */
public  final class Entry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.xbb.javakv.connect.peer.message.Entry)
    EntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Entry.newBuilder() to construct.
  private Entry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Entry() {
    type_ = 0;
    term_ = 0L;
    index_ = 0L;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Entry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            term_ = input.readUInt64();
            break;
          }
          case 24: {

            index_ = input.readUInt64();
            break;
          }
          case 34: {

            data_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xbb.javakv.connect.peer.message.RaftProto.internal_static_com_xbb_javakv_connect_peer_message_Entry_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xbb.javakv.connect.peer.message.RaftProto.internal_static_com_xbb_javakv_connect_peer_message_Entry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xbb.javakv.connect.peer.message.Entry.class, com.xbb.javakv.connect.peer.message.Entry.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
   */
  public com.xbb.javakv.connect.peer.message.EntryType getType() {
    com.xbb.javakv.connect.peer.message.EntryType result = com.xbb.javakv.connect.peer.message.EntryType.valueOf(type_);
    return result == null ? com.xbb.javakv.connect.peer.message.EntryType.UNRECOGNIZED : result;
  }

  public static final int TERM_FIELD_NUMBER = 2;
  private long term_;
  /**
   * <code>uint64 term = 2;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int INDEX_FIELD_NUMBER = 3;
  private long index_;
  /**
   * <code>uint64 index = 3;</code>
   */
  public long getIndex() {
    return index_;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 4;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != com.xbb.javakv.connect.peer.message.EntryType.EntryNormal.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (term_ != 0L) {
      output.writeUInt64(2, term_);
    }
    if (index_ != 0L) {
      output.writeUInt64(3, index_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(4, data_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.xbb.javakv.connect.peer.message.EntryType.EntryNormal.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, term_);
    }
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, index_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, data_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xbb.javakv.connect.peer.message.Entry)) {
      return super.equals(obj);
    }
    com.xbb.javakv.connect.peer.message.Entry other = (com.xbb.javakv.connect.peer.message.Entry) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (getTerm()
        == other.getTerm());
    result = result && (getIndex()
        == other.getIndex());
    result = result && getData()
        .equals(other.getData());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xbb.javakv.connect.peer.message.Entry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xbb.javakv.connect.peer.message.Entry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.xbb.javakv.connect.peer.message.Entry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.xbb.javakv.connect.peer.message.Entry)
      com.xbb.javakv.connect.peer.message.EntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xbb.javakv.connect.peer.message.RaftProto.internal_static_com_xbb_javakv_connect_peer_message_Entry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xbb.javakv.connect.peer.message.RaftProto.internal_static_com_xbb_javakv_connect_peer_message_Entry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xbb.javakv.connect.peer.message.Entry.class, com.xbb.javakv.connect.peer.message.Entry.Builder.class);
    }

    // Construct using com.xbb.javakv.connect.peer.message.Entry.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      type_ = 0;

      term_ = 0L;

      index_ = 0L;

      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xbb.javakv.connect.peer.message.RaftProto.internal_static_com_xbb_javakv_connect_peer_message_Entry_descriptor;
    }

    public com.xbb.javakv.connect.peer.message.Entry getDefaultInstanceForType() {
      return com.xbb.javakv.connect.peer.message.Entry.getDefaultInstance();
    }

    public com.xbb.javakv.connect.peer.message.Entry build() {
      com.xbb.javakv.connect.peer.message.Entry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xbb.javakv.connect.peer.message.Entry buildPartial() {
      com.xbb.javakv.connect.peer.message.Entry result = new com.xbb.javakv.connect.peer.message.Entry(this);
      result.type_ = type_;
      result.term_ = term_;
      result.index_ = index_;
      result.data_ = data_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xbb.javakv.connect.peer.message.Entry) {
        return mergeFrom((com.xbb.javakv.connect.peer.message.Entry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xbb.javakv.connect.peer.message.Entry other) {
      if (other == com.xbb.javakv.connect.peer.message.Entry.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xbb.javakv.connect.peer.message.Entry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xbb.javakv.connect.peer.message.Entry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
     */
    public com.xbb.javakv.connect.peer.message.EntryType getType() {
      com.xbb.javakv.connect.peer.message.EntryType result = com.xbb.javakv.connect.peer.message.EntryType.valueOf(type_);
      return result == null ? com.xbb.javakv.connect.peer.message.EntryType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
     */
    public Builder setType(com.xbb.javakv.connect.peer.message.EntryType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.xbb.javakv.connect.peer.message.EntryType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long term_ ;
    /**
     * <code>uint64 term = 2;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>uint64 term = 2;</code>
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 term = 2;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0L;
      onChanged();
      return this;
    }

    private long index_ ;
    /**
     * <code>uint64 index = 3;</code>
     */
    public long getIndex() {
      return index_;
    }
    /**
     * <code>uint64 index = 3;</code>
     */
    public Builder setIndex(long value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 index = 3;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 4;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 4;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 4;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.xbb.javakv.connect.peer.message.Entry)
  }

  // @@protoc_insertion_point(class_scope:com.xbb.javakv.connect.peer.message.Entry)
  private static final com.xbb.javakv.connect.peer.message.Entry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xbb.javakv.connect.peer.message.Entry();
  }

  public static com.xbb.javakv.connect.peer.message.Entry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Entry>
      PARSER = new com.google.protobuf.AbstractParser<Entry>() {
    public Entry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Entry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Entry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Entry> getParserForType() {
    return PARSER;
  }

  public com.xbb.javakv.connect.peer.message.Entry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

