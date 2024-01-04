package com.moe.java.effective.cahper01.advantage.advantage03;

public class HelloServiceFactory {

//    advantage03.매개변수에 의해 다른 인스턴스를 반환 할 수 있다.
//    advantage04.java8 이후에는 Interface안에 static 메소드 구현이 가능, 많은 정적 팩토리 메소드 클래스들을 만들 필요가 없다.(interface로 이동)
//    (Client에게 구체적인 타입을 숨기는것도 가능)
    public static HelloService of(String lang){
        if(lang.equals("ko")){
            return new KoreanHelloSerivce();
        }else{
            return new EnglishHelloSerivce();
        }
    }



}
