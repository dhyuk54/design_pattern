package com.hyuk.design.principle.dependenceinversion;

public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("hyuk在学习FE课程");
    }
}
