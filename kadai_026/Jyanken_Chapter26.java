package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    HashMap<String, String> jyankenMap = new HashMap<String, String>();
    public Jyanken_Chapter26() {
        jyankenMap.put("r", "グー");
        jyankenMap.put("s", "チョキ");
        jyankenMap.put("p", "パー");
    }
    // 自分のじゃんけんの手を入力する
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        // 自分のじゃけんの手を入力する
        Scanner scanner = new Scanner(System.in);
        String myChoice = scanner.next();

        // 正しいじゃんけんの手であるか判定する
        while(jyankenMap.get(myChoice) == null) {
        	System.out.println("r または s または pを入力してください");
            // 自分のじゃんけんの手を入力する
            myChoice = scanner.next();
        }
        scanner.close();
        // じゃんけんクラスを実行するクラスに、自分のじゃんけんの手を返す
        return myChoice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom() {
        // 配列にじゃんけんの手をセットする
        String[] randomArray = {"r", "s", "p"};
        // 乱数で対戦相手のじゃんけんの手を選ぶ
        String random = randomArray[(int)Math.floor(Math.random() * 3)];
        // じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの手を返す
        return random;
    }

    // じゃんけんを行う
    public void playGame(String myChoice, String random) {
        // 自分と対戦相手のじゃんけんの手を出力する
        System.out.println("自分の手は" + jyankenMap.get(myChoice) + ",対戦相手の手は" + jyankenMap.get(random));
        String result = "";
		// 自分と対戦相手のじゃんけんの手を比較する
        if(myChoice.equals("r")) {
            if(random.equals("r"))
                result  = "あいこです";
            else if(random.equals("s"))
                result = "自分の勝ちです";
            else if(random.equals("p"))
                result = "自分の負けです";
            }
        else if(myChoice.equals("s")) {
            if(random.equals("r"))
                result = "自分の負けです";
            else if(random.equals("s"))
                result = "あいこです";
            else if(random.equals("p"))
                result = "自分の勝ちです";
            }
        else if(myChoice.equals("p")) {
            if(random.equals("r"))
                result = "自分の勝ちです";
            else if(random.equals("s"))
                result = "自分の負けです";
            else if(random.equals("p"))
                result = "あいこです";
        }
        // じゃんけんの結果を出力する
        System.out.println(result);

    }
}
