
public class Main {
	public static void main(String[] args) {
		System.out.println(isValidPlayerName("AIUEO123"));
		System.out.println(isValidPlayerName("Aiueo123"));
		// ピリオドを使うことでピリオドに文字を適当に代入した際に同じか調べることができる
		System.out.println("Java".matches("J.va"));
		// アスタリスクは直前の文字の0回以上の繰り返しを意味する
		System.out.println("ABBBBB".matches("AB*"));
		System.out.println("Jaaaaava".matches("Ja*va"));

		// 波括弧は、直前の文字の指定回数の繰り返しを表す(下の場合であればa~zの文字列を3回繰り返すということになる)
		// 角括弧は、角括弧内に書かれた文字列のどれか1文字が当てはまるかを調べる(下の場合であればa~zのどれかが当てはまればtrue)
		System.out.println("url".matches("[a-z]{3}"));

		System.out.println("URL".matches("UR[LIN]"));

		String s = "abc,def:ghi";
		// splitメソッドを用いることで文字列の分割を行うこともできる
		// 下の場合であれば、カンマかコロンの場所で分割することを表している
		String[] words = s.split("[,:]");
		for(String w: words) {
			System.out.print(w +"->");
		}
		// replaceAllメソッドを用いることで、文字列中でパターンに一致した箇所を全て別の文字列に置き換えることができる
		// 下の場合であればbehをXに置き換えることをあらわす
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}

	public static boolean isValidPlayerName(String name) {
		// matchesメソッドを用いることで文字列が引数で渡しているパターンを満たしているかを照合する処理をしてくれる
		// またこの処理を、パターンマッチングという
		// 引数で渡しているのは文字列パターンと呼ばれるものである
		// これは文字列の形式的な条件を、正規表現という文法に従って記述したものである
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
