package com.moe.java.effective.cahper01.advantage.advantage05;

import java.util.Optional;
import java.util.ServiceLoader;

public class BusinessMain {
    public static void main(String[] args) {
        //구현체가 없이 Interface의 메소드를 통하여 ni hao 출력

        //load() => 등록되어 있는 구현체가 있으면 모두 가져온다 iterator type
        ServiceLoader<BusinessService> load = ServiceLoader.load(BusinessService.class);
        Optional<BusinessService> first = load.findFirst();
        first.ifPresent(h -> {
            System.out.println(h.hello());
        });

    }
}
