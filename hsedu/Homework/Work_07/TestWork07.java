package com.hsedu.Homework.Work_07;

public class TestWork07 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch(green){
            case RED:
                System.out.println("赤にマッチングしています");
                break;
            case BLUE:
                System.out.println("青にマッチングしています");
                break;
            case BLACK:
                System.out.println("黒にマッチングしています");
                break;
            case GREEN:
                System.out.println("緑にマッチングしています");
                break;
            case YELLOW:
                System.out.println("黄色にマッチングしています");
                break;
            default:
                System.out.println("何もマッチングしていますせん");
        }
    }
}

enum Color implements IMyInterface {
    RED(255, 0, 0),BLUE(0, 0, 255),
    BLACK(0, 0, 0),YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性値は　" + redValue + "," + greenValue + "," + blueValue + ",");
    }
}

interface IMyInterface {
    public void show();
}
