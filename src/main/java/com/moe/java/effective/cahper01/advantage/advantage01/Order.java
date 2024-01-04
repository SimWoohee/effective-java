package com.moe.java.effective.cahper01.advantage.advantage01;

public class Order {

    //생성자의 기본 지식
    //1. 클래스명과 동일
    //2. return type은 해당 클래스 타입 must!
    //3. 한 클래스의 시그니처 생성자는 1개여야 한다.
    //4. 생성자가 하나도 존재하지 않으면 기본 생성자가 default로 하나 생성된다.
    private  boolean prime;

    private  boolean urgent;

    private  Product product;

//    한 클래스의 시그니처는 한종류의 시그니처만 존재해야한다.(컴파일 에러 발생)
//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    }

//    우회방법 파라미터의 타입을 변경해주면 컴파일 에러는 피할수 있따.
//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(Product product, boolean urgent) {
//        this.urgent = urgent;
//        this.product = product;
//    }

    //정적 팩토리 메소드방식으로 변경, 생성자의 시그니처가 중복되는 경우에 고려할만 하다!
    //장점
    //1. 표현이 더 자유롭다, 정적팩토리의 메소드 이름만 봐도 어떤 특징을 가지고 있는지 유추 할 수 있다.
    public static Order primeProduct(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentProduct(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

}
