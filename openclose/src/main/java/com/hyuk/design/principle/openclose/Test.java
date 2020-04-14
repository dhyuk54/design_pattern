package com.hyuk.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(96,"java从零到企业级电商开发",348d);
        JavaDiscountCourse  javaCourse1 = (JavaDiscountCourse) javaCourse;
        System.out.println("课程ID:"
                +javaCourse.getId() +"课程名称"
                +javaCourse.getName() +"课程价格"
                +javaCourse.getPrice()+"折后价格"
                +javaCourse1.getOriginPrice());
    }
}
