package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// じゃんけんクラスのインスタンスを作成する
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

		// 自分のじゃんけんの手を入力する
        String myChoice = jyanken.getMyChoice();

		// 相手のじゃんけんの手が乱数で選ばれる
        String random = jyanken.getRandom();
		
		// じゃんけんの結果を出力する
		jyanken.playGame(myChoice, random);
	}
}