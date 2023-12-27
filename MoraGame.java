import java.util.Random;
import java.util.Scanner;
public class MoraGame {
	public static void main (String[] args) {
		Tom t = new Tom();
		//最後の勝敗回数を記録する
		int isWinCount = 0;
		//二次元配列、回数を受け取り、Tomとコンピューターの出し手の状況を受け取る
		int [][] arr1 = new int[3][3];
		int j = 0;
		
		//一次元配列、勝敗の状況を受け取る
		String[] arr2 = new String[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {  //試合三回
			//プレイヤーの手を取得する
			System.out.println("出す手を入力してください（0 - グー，1 - チョキ， 2 - パー） ：");
			int num = scanner.nextInt();
			t.setTomGuessNum(num);
			int tomGuess = t.getTomGuessNum();
			arr1[i][j + 1] = tomGuess;
			
			//コンピューターの手を取得する
			int comGuess = t.computerNum();
			arr1[i][j + 2] = comGuess;
			
			//プレイヤーとコンピューターの手を比較する
			String isWin = t.vsComputer();
			arr2[i] = isWin;
			arr1[i][j] = t.count;
			
			//各局の最終結果を出力する
			System.out.println("===================================================");
			System.out.println("回数\tプレイヤーの手\tコンピューターの手\t勝敗の状況");
			System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + arr2[i]);
			System.out.println("===================================================");
			System.out.println("\n\n");
			isWinCount = t.winCount(isWin);
		}
		
		//ゲームの最終結果を出力する
		System.out.println("回数\t\tプレイヤーの手\tコンピューターの手\t勝敗の状況");
		for (int a = 0; a < arr1.length; a++) {
			for (int b = 0; b < arr1[a].length; b++) {
				System.out.print(arr1[a][b] + "\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("あなた" + isWinCount + "回勝ちます");
	}
}
class Tom {
	//プレイヤーの出す手のタイプ
	int tomGuessNum;
	//コンピューターの出す手のタイプ
	int comGuessNum;
	//プレイヤーの勝利回数
	int winCountNum;
	//試合の回数
	int count = 1;
	
	public void showInfo () {
		
	}
	//コンピューターのじゃんけんの数字
	public int computerNum () {
		Random r = new Random();
		comGuessNum = r.nextInt(3);
		return comGuessNum;
	}
	//プレイヤーのじゃんけんの数字
	public void setTomGuessNum (int tomGuessNum) {
		if (tomGuessNum > 2 || tomGuessNum < 0) {
			throw new IllegalArgumentException("数字の入力エラー");
		}
		this.tomGuessNum = tomGuessNum;
	}
	public int getTomGuessNum() {
		return tomGuessNum;
	}
	/**
	 * じゃんけんの結果を比較する
	 * @return プレイヤーが勝った場合はtrueを返し、それ以外の場合はfalseを返す
	 */
	public String vsComputer() {
		if (tomGuessNum == 0 && comGuessNum == 1) {
			return "あなたの勝ちです";
		} else if (tomGuessNum == 1 && comGuessNum == 2) {
			return "あなたの勝ちです";
		} else if (tomGuessNum == 2 && comGuessNum == 0) {
			return "あなたの勝ちです";
		} else if (tomGuessNum == comGuessNum) {
			return "引き分け";
		} else {
			return "あなたの負けです";
		}
	}
	public int winCount(String s) {
		count++;
		if (s.equals("あなたの勝ちです")) {
			winCountNum++;
		}
		return winCountNum;
	}
}