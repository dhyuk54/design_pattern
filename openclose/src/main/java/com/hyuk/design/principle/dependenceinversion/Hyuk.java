package com.hyuk.design.principle.dependenceinversion;

public class Hyuk {

    private ICourse iCourse;
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void studyImoocCourse(){
        //调用类成员中的变量来调用studyCourse方法
        iCourse.studyCourse();
    }


}
