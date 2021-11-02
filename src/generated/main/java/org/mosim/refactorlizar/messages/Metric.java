// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Messages.proto

package org.mosim.refactorlizar.messages;

/**
 * Protobuf type {@code org.mosim.refactorlizar.messages.Metric}
 */
public  final class Metric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.mosim.refactorlizar.messages.Metric)
    MetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metric.newBuilder() to construct.
  private Metric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metric() {
    cohesion_ = 0D;
    complexity_ = 0D;
    coupling_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metric(
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
          case 9: {

            cohesion_ = input.readDouble();
            break;
          }
          case 17: {

            complexity_ = input.readDouble();
            break;
          }
          case 25: {

            coupling_ = input.readDouble();
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
    return org.mosim.refactorlizar.messages.Messages.internal_static_org_mosim_refactorlizar_messages_Metric_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mosim.refactorlizar.messages.Messages.internal_static_org_mosim_refactorlizar_messages_Metric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mosim.refactorlizar.messages.Metric.class, org.mosim.refactorlizar.messages.Metric.Builder.class);
  }

  public static final int COHESION_FIELD_NUMBER = 1;
  private double cohesion_;
  /**
   * <code>double cohesion = 1;</code>
   */
  public double getCohesion() {
    return cohesion_;
  }

  public static final int COMPLEXITY_FIELD_NUMBER = 2;
  private double complexity_;
  /**
   * <code>double complexity = 2;</code>
   */
  public double getComplexity() {
    return complexity_;
  }

  public static final int COUPLING_FIELD_NUMBER = 3;
  private double coupling_;
  /**
   * <code>double coupling = 3;</code>
   */
  public double getCoupling() {
    return coupling_;
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
    if (cohesion_ != 0D) {
      output.writeDouble(1, cohesion_);
    }
    if (complexity_ != 0D) {
      output.writeDouble(2, complexity_);
    }
    if (coupling_ != 0D) {
      output.writeDouble(3, coupling_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cohesion_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, cohesion_);
    }
    if (complexity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, complexity_);
    }
    if (coupling_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, coupling_);
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
    if (!(obj instanceof org.mosim.refactorlizar.messages.Metric)) {
      return super.equals(obj);
    }
    org.mosim.refactorlizar.messages.Metric other = (org.mosim.refactorlizar.messages.Metric) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getCohesion())
        == java.lang.Double.doubleToLongBits(
            other.getCohesion()));
    result = result && (
        java.lang.Double.doubleToLongBits(getComplexity())
        == java.lang.Double.doubleToLongBits(
            other.getComplexity()));
    result = result && (
        java.lang.Double.doubleToLongBits(getCoupling())
        == java.lang.Double.doubleToLongBits(
            other.getCoupling()));
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
    hash = (37 * hash) + COHESION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCohesion()));
    hash = (37 * hash) + COMPLEXITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getComplexity()));
    hash = (37 * hash) + COUPLING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCoupling()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mosim.refactorlizar.messages.Metric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mosim.refactorlizar.messages.Metric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mosim.refactorlizar.messages.Metric parseFrom(
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
  public static Builder newBuilder(org.mosim.refactorlizar.messages.Metric prototype) {
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
   * Protobuf type {@code org.mosim.refactorlizar.messages.Metric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.mosim.refactorlizar.messages.Metric)
      org.mosim.refactorlizar.messages.MetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mosim.refactorlizar.messages.Messages.internal_static_org_mosim_refactorlizar_messages_Metric_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mosim.refactorlizar.messages.Messages.internal_static_org_mosim_refactorlizar_messages_Metric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mosim.refactorlizar.messages.Metric.class, org.mosim.refactorlizar.messages.Metric.Builder.class);
    }

    // Construct using org.mosim.refactorlizar.messages.Metric.newBuilder()
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
      cohesion_ = 0D;

      complexity_ = 0D;

      coupling_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mosim.refactorlizar.messages.Messages.internal_static_org_mosim_refactorlizar_messages_Metric_descriptor;
    }

    public org.mosim.refactorlizar.messages.Metric getDefaultInstanceForType() {
      return org.mosim.refactorlizar.messages.Metric.getDefaultInstance();
    }

    public org.mosim.refactorlizar.messages.Metric build() {
      org.mosim.refactorlizar.messages.Metric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.mosim.refactorlizar.messages.Metric buildPartial() {
      org.mosim.refactorlizar.messages.Metric result = new org.mosim.refactorlizar.messages.Metric(this);
      result.cohesion_ = cohesion_;
      result.complexity_ = complexity_;
      result.coupling_ = coupling_;
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
      if (other instanceof org.mosim.refactorlizar.messages.Metric) {
        return mergeFrom((org.mosim.refactorlizar.messages.Metric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mosim.refactorlizar.messages.Metric other) {
      if (other == org.mosim.refactorlizar.messages.Metric.getDefaultInstance()) return this;
      if (other.getCohesion() != 0D) {
        setCohesion(other.getCohesion());
      }
      if (other.getComplexity() != 0D) {
        setComplexity(other.getComplexity());
      }
      if (other.getCoupling() != 0D) {
        setCoupling(other.getCoupling());
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
      org.mosim.refactorlizar.messages.Metric parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.mosim.refactorlizar.messages.Metric) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double cohesion_ ;
    /**
     * <code>double cohesion = 1;</code>
     */
    public double getCohesion() {
      return cohesion_;
    }
    /**
     * <code>double cohesion = 1;</code>
     */
    public Builder setCohesion(double value) {
      
      cohesion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double cohesion = 1;</code>
     */
    public Builder clearCohesion() {
      
      cohesion_ = 0D;
      onChanged();
      return this;
    }

    private double complexity_ ;
    /**
     * <code>double complexity = 2;</code>
     */
    public double getComplexity() {
      return complexity_;
    }
    /**
     * <code>double complexity = 2;</code>
     */
    public Builder setComplexity(double value) {
      
      complexity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double complexity = 2;</code>
     */
    public Builder clearComplexity() {
      
      complexity_ = 0D;
      onChanged();
      return this;
    }

    private double coupling_ ;
    /**
     * <code>double coupling = 3;</code>
     */
    public double getCoupling() {
      return coupling_;
    }
    /**
     * <code>double coupling = 3;</code>
     */
    public Builder setCoupling(double value) {
      
      coupling_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double coupling = 3;</code>
     */
    public Builder clearCoupling() {
      
      coupling_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:org.mosim.refactorlizar.messages.Metric)
  }

  // @@protoc_insertion_point(class_scope:org.mosim.refactorlizar.messages.Metric)
  private static final org.mosim.refactorlizar.messages.Metric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mosim.refactorlizar.messages.Metric();
  }

  public static org.mosim.refactorlizar.messages.Metric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metric>
      PARSER = new com.google.protobuf.AbstractParser<Metric>() {
    public Metric parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metric(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metric> getParserForType() {
    return PARSER;
  }

  public org.mosim.refactorlizar.messages.Metric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

