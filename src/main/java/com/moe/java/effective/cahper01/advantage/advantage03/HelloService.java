package com.moe.java.effective.cahper01.advantage.advantage03;

public interface HelloService {
    String hello();

    //advantage04.java8 이후에는 Interface안에 static 메소드 구현이 가능, 많은 정적 팩토리 메소드 클래스들을 만들 필요가 없다.
    static HelloService of(String lang){
        if(lang.equals("ko")){
            return new KoreanHelloSerivce();
        }else{
            return new EnglishHelloSerivce();
        }
    }
}
