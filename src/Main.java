
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
		// 文字列の整形
		// 文字列の書式整形にはformatメソッドを用いる
		// 同時に出力も行いたい場合はprintfメソッドを用いる
		// 第一引数には、雛形を指定する書式指定文字列と呼ばれるものを指定する
		// その中の%記号の部分は、プレースホルダと呼ばれ第二引数以降で指定した具体的な値が順に流し込まれる
		// プレースホルダは
		// % 修飾(省略可) 桁(省略可) 型(必須)　といった形で書く
		// 修飾: ,(3桁毎にカンマを入れる) 0(空き領域を0埋め) -(左寄せ) +(符号を強制表示)
		// 桁: 表示桁数をする、n.mのような形式で指定した場合、全体n桁、小数点以下m桁での表示となる
		// 型: d(整数) s(文字列) f(少数) b(真偽値)
		// のような書き方で指定する
		// プレースホルダは、全角文字が混ざると崩れてしまうこともあるので注意する
		// 下であれば製品番号 第二引数(左寄せの文字列) 第三引数(0埋め2桁の整数)を表す
		System.out.printf("製品番号%s-%02d", "SJV", 3);
	}

	public static boolean isValidPlayerName(String name) {
		// matchesメソッドを用いることで文字列が引数で渡しているパターンを満たしているかを照合する処理をしてくれる
		// またこの処理を、パターンマッチングという
		// 引数で渡しているのは文字列パターンと呼ばれるものである
		// これは文字列の形式的な条件を、正規表現という文法に従って記述したものである
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
