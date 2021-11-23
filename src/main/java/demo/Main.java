package demo;

import demo.protobuf.generated.Message;

public class Main {

    public static void main(String[] args) {
        Message message = Message.newBuilder()
                .setNumber(111)
                .setText("aaa")
                .setEnum(Message.Enum.WHITE)
                .build();
        System.out.println(message);
    }

}
