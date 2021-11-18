Java Protocol Buffers Demo
=======================

```
brew install protobuf
protoc --java_out=./src/main/java ./data.proto
```

将会在`src/main/java/demo/protobuf/generated`生成相关的Java文件（`Data.java`）。

需要注意的是，生成的Java代码中，只包含定义的`message`，而没有`service`。

`service`需要是为`gPRC`服务的，需要用其它的办法生成（见其它的demo）。命令行的办法比较麻烦。

```
mvn clean compile exec:java -Dexec.mainClass="demo.Main"
```