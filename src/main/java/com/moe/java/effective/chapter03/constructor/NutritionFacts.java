package com.moe.java.effective.chapter03.constructor;

public class NutritionFacts {
    private final int servingSize ;  //필수
    private final int servings ;     //필수
    private final int caloried ;     //선택
    private final int fat ;          //선택
    private final int sodium ;       //선택
    private final int carbohydrate ; //선택

//    public NutritionFacts(int servingSize, int servings) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.caloried = 0;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//    public NutritionFacts(int servingSize, int servings, int caloried) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.caloried = caloried;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//
//    public NutritionFacts(int servingSize, int servings, int caloried, int fat) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.caloried = caloried;
//        this.fat = fat;
//        this.sodium = 0;
//        this.carbohydrate = 0;
//    }
//
//    public NutritionFacts(int servingSize, int servings, int caloried, int fat, int sodium) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.caloried = caloried;
//        this.fat = fat;
//        this.sodium = sodium;
//        this.carbohydrate = 0;
//    }
//
//    public NutritionFacts(int servingSize, int servings, int caloried, int fat, int sodium, int carbohydrate) {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.caloried = caloried;
//        this.fat = fat;
//        this.sodium = sodium;
//        this.carbohydrate = carbohydrate;
//    }

    //정적 팩터리와 생성자에 선택적 매개변수가 많을 때 고려할 수 있는 방안
    //대안1: 점층적 생성자 패턴 또는 생성자 체이닝
    //대안2: 자바빈즈 패턴

    // 점층적 생성자 패턴(생성자 체이닝 진행)
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int caloried) {
        this(servingSize, servings, caloried, 0);
    }

    public NutritionFacts(int servingSize, int servings, int caloried, int fat) {
        this(servingSize, servings, caloried,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int caloried, int fat, int sodium) {
        this(servingSize, servings, caloried,fat,sodium,0);
    }

    public NutritionFacts(int servingSize, int servings, int caloried, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.caloried = caloried;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }


    public static void main(String[] args) {
        new NutritionFacts(10, 10, 10);
    }
}
