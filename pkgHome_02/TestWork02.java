package com.hspedu.pkgHome_02;

public class TestWork02 {
    public static void main(String[] args) {
        Professor professor = new Professor("jack", 30, "高級", 30000, 1.3);
        AssociateProfessor associateprofessor = new AssociateProfessor("mary", 25,
                "中級", 15000, 1.2);
        Lecturer lecturer = new Lecturer("jack", 23, "初級", 10000, 1.1);
        professor.introduce();
        associateprofessor.introduce();
        lecturer.introduce();
    }
}
