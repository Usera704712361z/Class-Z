package com.hspedu.exception_;

public class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("パラメーターの数が合っていません");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);
            System.out.println("計算結果は = " + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("パラメーターの形式が正しくありません。整数を出力してください");
        } catch (ArithmeticException e) {
            System.out.println("0での除算例外が発生しました");
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}