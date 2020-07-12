
public class Main {
	public static void main(String[] args) {
		// 文字列の連結
		String s = "スッキリ"+"Java";
		System.out.println(s);

		// +演算子でも文字列の結合はできるが
		// +演算子で結合すると、連結するたびに文字列情報は初期化されるため、実際の内容としては
		// 元々あった文字列を削除して、連結した文字を新たに代入するといった形になる
		// そういった理由から、多くの文字を連結する際には不向きである
		// しかし、StringBuilderであれば、全ての文字を連結し終わってから呼び出すため
		// +演算子で連結するよりも圧倒的に処理速度が速く、多くの文字を連結する際にはStringBuilderが向いている
		// しかし、数回程度の連結であれば、あまり大差はないため、可読性の高い、+演算子でも良い
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10000; i++) {
			sb.append("Java");
		}
		String s1 = sb.toString();
		System.out.println(s1);
	}
}
