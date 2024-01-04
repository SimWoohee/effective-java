package com.moe.java.effective.cahper01.advantage.advantage02;

public class SettingsMain {
    public static void main(String[] args) {

        Settings settings = new Settings();
        //매번 새로운 인스턴스를 생성.
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());

        //정적 팩토리를 사용하여 인스턴스 생성을 통제
        System.out.println(settings.getInstance());
        System.out.println(settings.getInstance());
        System.out.println(settings.getInstance());

        //플라이웨이트 패턴 : 자주사용하는것들을 캐쉬에 보관해놓고 자주 꺼내쓰는것


    }
}
