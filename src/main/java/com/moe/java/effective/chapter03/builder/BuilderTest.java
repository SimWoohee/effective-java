package com.moe.java.effective.chapter03.builder;

public class BuilderTest {
    public static void main(String[] args) {

        //모든 매개 변수를 받는 생성자가 Builder에 의해 자동으로 생성된다.
        //이걸 막는 방법은 @AllArgsConstructor(access = AccessLevel.PRIVATE) 주면 빌드내에서만 사용가능
        //AnnotationBuilder annotationBuilder = new AnnotationBuilder(10,20,30,50,60,70);(컴파일에러)

    }
}
