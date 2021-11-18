package demo;

import demo.protobuf.generated.Data;

public class Main {

    public static void main(String[] args) {
        Data.Message message = Data.Message.newBuilder()
                .setNumber(111)
                .setText("aaa")
                .setEnum(Data.Message.Enum.WHITE)
                .build();
        System.out.println(message);
    }

}
