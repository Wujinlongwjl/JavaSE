package com.itheima.mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //零散数据获取stream流
        Stream.of(1, 2, 3, 4, 5).forEach(s-> System.out.println(s));
        Stream.of("a", "b", "c").forEach(s -> System.out.println(s));
    }
}
