package com.hspedu.smallchange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //アプローチの分析：
    // 1. まずメニューを表示し、メニューを選択し、対応するヒントを表示する。
    // 2. 小銭通明細の完成
    // 3. 収益の入金の完成
    // 4. 支出
    // 5. 終了
    // 6. ユーザーが4を入力して終了する際、'終了してもよろしいですか？ y/n'というメッセージを表示し、
    // 正しい y/n を入力するまでループし続けます。
    //7. 収益の入金と消費の際に、金額が妥当かどうかを判断し、適切なヒントを表示する。

    public static void main(String[] args) {
        // 1. まずメニューを表示し、メニューを選択し、対応するヒントを表示する。
        //関連する変数を定義する
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        // 2. 小銭通明細の完成
        //（1）収益の入金と消費を配列に保存できます
        // （2）オブジェクトを直接使用できます
        // （3）簡単な場合はStringの結合を使用できます
        String details = "-------------小銭通明細-------------";

        // 3. 収益の入金の完成 機能を完了するために新しい変数とコードを追加する
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日付のフォーマットに使用する

        // 4.支出  新しい変数を定義し、支出の理由を保存します
        String note = "";
        do {
            System.out.println("\n-------------小銭通メニュー-------------");
            System.out.println("\t\t\t1 小銭通明細");
            System.out.println("\t\t\t2 収益の入金");
            System.out.println("\t\t\t3 支出");
            System.out.println("\t\t\t4 終了");

            System.out.println("選んでください（1 - 4）:");
            key = scanner.next();

            //switch文を使用した条件分岐
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("収益の入金金額：");
                    money = scanner.nextDouble();//money の値を検証する必要があります
                    //不正な金額条件を見つけ、その後、ヒントを表示し、直ちに break します
                    if (money <= 0) {
                        System.out.println("収益の入金金額は0より大きい必要があります");
                        break;
                    }
                    balance += money;
                    //収益の入金情報を details に結合する
                    date = new Date();//現在の日付を取得する
                    details += "\n収益の入金\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("支出の金額：");
                    money = scanner.nextDouble();//money の値を検証する必要があります
                    //不正な金額条件を見つけ、その後、ヒントを表示し、直ちに break します
                    if (money <= 0 || money > balance) {
                        System.out.println("支出の金額は0以上である必要があります，0-" + balance);
                        break;
                    }
                    System.out.println("支出の説明：");
                    note = scanner.next();
                    balance -= money;
                    //支出額情報を details に結合する
                    date = new Date();//現在の日付を取得する
                    details += "\n" + note + "\t-" +  money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    //6. ユーザーが4を入力して終了する際、'終了してもよろしいですか？ y/n'というメッセージを表示し、
                    // 正しい y/n を入力するまでループし続けます。
                    //（1）変数 choice を定義し、ユーザーの入力を受け取ります
                    //（2）y または n を受け取る処理のために while + break を使用する
                    //（3）while を抜けた後、choice が y か n かを判断し、退出するかどうかを決定できます
                    //（4）一つの小さな機能を実行するためのコードはなるべく混在させないようにします
                    String choice = "";
                    while (true) {//ユーザーに y/n を入力するように要求し、そうでない場合は無限ループします
                        System.out.println("終了しますか？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("選択が誤っています。もう一度選択してください");
            }
        } while (loop);
        System.out.println("-------------小銭通プロジェクトを終了しました-------------");
    }
}
