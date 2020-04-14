package com.hyuk.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        //版本1
      /*  Hyuk hyuk = new Hyuk();
        hyuk.studyFECourse();
        hyuk.studyJavaCourse();*/
      //版本2
/*        Hyuk hyuk = new Hyuk();
        hyuk.studyImoocCourse(new JavaCourse());
        hyuk.studyImoocCourse(new FECourse());
        hyuk.studyImoocCourse(new PythonCourse());*/
        //版本3

        //版本4
        Hyuk hyuk = new Hyuk();
        hyuk.setiCourse(new JavaCourse());
        hyuk.studyImoocCourse();

        hyuk.setiCourse(new FECourse());
        hyuk.studyImoocCourse();
    }
}
