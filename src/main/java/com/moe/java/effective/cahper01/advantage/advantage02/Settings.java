package com.moe.java.effective.cahper01.advantage.advantage02;

public class Settings {
    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    /*
        생성자로는 인스턴스를 컨트롤 할 수 없다. 매번 새로운 인스턴스를 생성 할 수 있음, new Settins();
        그러나 정적 팩토리를 사용하여 인스턴스를 1개만 생성할 수 있도록 통제할 수 있다.
     */

    //정적 팩토리를 사용하여 인스턴스 생성을 통제
    private static final Settings SETTINGS = new Settings();

    public Settings getInstance(){
        return  SETTINGS;
    }



}
