// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package demo.protobuf.generated;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>int32 number = 2;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>.Message.Enum enum = 3;</code>
   * @return The enum numeric value on the wire for enum.
   */
  int getEnumValue();
  /**
   * <code>.Message.Enum enum = 3;</code>
   * @return The enum.
   */
  demo.protobuf.generated.Message.Enum getEnum();
}
