package com.moe.java.effective.cahper01.advantage.advantage03;

import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceMain {
    public static void main(String[] args) {
//        HelloServiceFactory helloServiceFactory = new HelloServiceFactory();
//
//        //인스턴스(interface)를 리턴받아 구현체를 사용하는 방법
//        //Client 입장에서는 인터페이스까지만 노출이됨.(보안상 좋음)
//        HelloService ko = helloServiceFactory.of("ko");
//        System.out.println(ko.hello());

        //
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        Optional<HelloService> first = load.findFirst();
        List<HelloService> list = first.stream().toList();
        list.forEach(System.out::println);
    }
}
