package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> fruitsMap = new HashMap<String,String>();
	
	public void search(String[] keyArray) {
	
		fruitsMap.put("apple", "りんご");
		fruitsMap.put("peach", "桃");
		fruitsMap.put("banana", "バナナ");
		fruitsMap.put("lemon", "レモン");
		fruitsMap.put("pear", "梨");
		fruitsMap.put("kiwi", "キウィ");
		fruitsMap.put("strawberry", "いちご");
		fruitsMap.put("grape", "ぶどう");
		fruitsMap.put("muscat", "マスカット");
		fruitsMap.put("cherry", "さくらんぼ");

		for (String key: keyArray) {
			String mean = fruitsMap.get(key);
			if (mean == null) {
				mean = "辞書に存在しません";
			}
			System.out.println(key + "は" + mean);
		}
	}
}
