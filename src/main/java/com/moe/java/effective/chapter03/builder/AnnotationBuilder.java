package com.moe.java.effective.chapter03.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

/*
  @Builder 어노테이션으로 빌더 구성
 */
@Builder(builderClassName = "Builder")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AnnotationBuilder {

    private final int servingSize ;  //필수
    private final int servings ;     //필수
    private final int caloried ;     //선택
    private final int fat ;          //선택
    private final int sodium ;       //선택
    private final int carbohydrate ; //선택

    public static void main(String[] args) {
        AnnotationBuilder annotationBuilder = new Builder()
                .servingSize(10)
                .caloried(20)
                .fat(40)
                .build();

    }
}
