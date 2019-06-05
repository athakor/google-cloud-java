// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/instruction.proto

package com.google.cloud.datalabeling.v1beta1;

public final class InstructionOuterClass {
  private InstructionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Instruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/datalabeling/v1beta1/inst"
          + "ruction.proto\022!google.cloud.datalabeling"
          + ".v1beta1\032/google/cloud/datalabeling/v1be"
          + "ta1/dataset.proto\032\037google/protobuf/times"
          + "tamp.proto\032\034google/api/annotations.proto"
          + "\"\200\003\n\013Instruction\022\014\n\004name\030\001 \001(\t\022\024\n\014displa"
          + "y_name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022/\n\013cre"
          + "ate_time\030\004 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\005 \001(\0132\032.google.protobu"
          + "f.Timestamp\022>\n\tdata_type\030\006 \001(\0162+.google."
          + "cloud.datalabeling.v1beta1.DataType\022J\n\017c"
          + "sv_instruction\030\007 \001(\01321.google.cloud.data"
          + "labeling.v1beta1.CsvInstruction\022J\n\017pdf_i"
          + "nstruction\030\t \001(\01321.google.cloud.datalabe"
          + "ling.v1beta1.PdfInstruction\"&\n\016CsvInstru"
          + "ction\022\024\n\014gcs_file_uri\030\001 \001(\t\"&\n\016PdfInstru"
          + "ction\022\024\n\014gcs_file_uri\030\001 \001(\tBx\n%com.googl"
          + "e.cloud.datalabeling.v1beta1P\001ZMgoogle.g"
          + "olang.org/genproto/googleapis/cloud/data"
          + "labeling/v1beta1;datalabelingb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_Instruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "DataType",
              "CsvInstruction",
              "PdfInstruction",
            });
    internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor,
            new java.lang.String[] {
              "GcsFileUri",
            });
    internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor,
            new java.lang.String[] {
              "GcsFileUri",
            });
    com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
