package com.hsedu.Homework.Work_03;

public class TestInterface {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10, 8);

        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },10, 8);
    }
}

interface ICalculate {
    public double work(double n1, double n2);
}

class CellPhone {
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);
        System.out.println("計算した結果：" + result);
    }
}
