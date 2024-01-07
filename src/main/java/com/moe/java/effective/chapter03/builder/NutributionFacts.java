package com.moe.java.effective.chapter03.builder;

public class NutributionFacts {

    private final int servingSize ;  //필수
    private final int servings ;     //필수
    private final int caloried ;     //선택
    private final int fat ;          //선택
    private final int sodium ;       //선택
    private final int carbohydrate ; //선택


    public static void main(String[] args) {

        //플루언트 API : pipeline 처럼 흐르듯이 진행이 되는 구조
        //필수 값은 빌더의 매개변수로 넣어주고 선택 값들은 플루언트 api 사용
        NutributionFacts cocaCoal = new Builder(240,30)
                .caloried(100)
                .fat(20)
                .carbohydrate(40)
                .sodium(20)
                .build();
    }

    private NutributionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        caloried = builder.caloried;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }


    //생성자 빌드 패턴
    //장점 생성자 매개변수에 필수 값이 있을시 사용을 고려
    public static class Builder{
        private final int servingSize ;  //필수
        private final int servings ;     //필수
        private int caloried ;     //선택
        private int fat ;          //선택
        private int sodium ;       //선택
        private int carbohydrate ; //선택

        //필수 매개변수 셋팅법
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //선택 매개변수 셋팅법
        public Builder caloried(int val)
        { caloried = val;  return this; }

        public Builder fat(int val)
        { fat = val;  return this; }

        public Builder sodium(int val)
        { sodium = val;  return this; }

        public Builder carbohydrate(int val)
        { carbohydrate = val;  return this; }

        //인스턴스 리턴
        public  NutributionFacts build() {return new NutributionFacts(this);}

    }
}
