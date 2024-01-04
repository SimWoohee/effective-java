package com.moe.java.effective.chapter02.enumeration;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Order {

    //OrderStatus의 enum값 외에는 어떠한 값도 들어갈 수 없음
    //private OrderStatus orderStatus = "DELIVERED"; (컴파일에러)
    private OrderStatus orderStatus = OrderStatus.DELIVERED;

    public static void main(String[] args) {
        //enum내에 있는 값들을 모두 가져오는 함수 values()
        OrderStatus[] values = OrderStatus.values();
        List<OrderStatus> list = Arrays.stream(values).toList();
        list.forEach(System.out::println);
    }


}
