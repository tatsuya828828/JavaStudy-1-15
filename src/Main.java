
public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		// equalsIgnoreCaseは大文字、小文字を区別せずに判別したときに等しいか調べるメソッド
		}else if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		// lengthは、文字の長さを調べるメソッド
		System.out.println("s1の文字の長さは"+ s1.length() +"文字です。");
		// isEmptyは、空文字かを調べるメソッド
		if(s4.isEmpty()) {
			System.out.println("s4は空文字です");
		}

		// 文字列の検索
		String s5 = "Java and JavaScript";
		// containsは、引数の文字列が含まれるか調べるメソッド
		if(s5.contains("Java")) {
			System.out.println("s5の文字列には、Javaが含まれています");
		// endWithは、引数の文字列で終わっているかを調べるメソッド
		// 逆に始まりを調べる場合は、startWithを使う
		} else if(s5.endsWith("Java")) {
			System.out.println("s5の文字列の末尾は、Javaです");
		}
		// indexOfは、引数の文字列が最初に登場する位置を調べるメソッド
		// 先頭に登場していると0の値が返ってくる
		System.out.println("s5の文字列の中でJavaが最初に登場するのは"+ s5.indexOf("Java") +"文字目です");
		// lastIndexOfは、引数の文字列が最後に登場する位置を調べるメソッド
		System.out.println("s5の文字列の中でJavaが最後に登場するのは"+ s5.lastIndexOf("Java") +"文字目です");

		// 文字列を切り出す
		String s6 = "123456789";
		// substringは、指定一から始まる文字列を任意の長さだけ切り出すメソッド
		// 先頭位置の引数は0となるため、表示したい文字-1を引数に入れる
		// 引数が1つだけの場合は、それ以降の文字が全て表示される
		System.out.println("文字列s6の4文字目以降は"+ s6.substring(3)); // この場合は4文字目
		// 2つの指定位置の間の文字列が返されるため、この場合は位置指定8の文字は含まれない
		System.out.println("文字列s6の4~8文字目は"+ s6.substring(3, 8)); // この場合は4~8文字目が表示される

		// 文字列の変換
		String s7 = "A";
		// toLowerCaseは、大文字を小文字に変換するメソッド
		// 逆に小文字を大文字にしたい場合は、toUpperCaseメソッドを使う
		System.out.println(s7.toLowerCase());

		String s8 = " aiueo ";
		// trimは、前後の空白を除去するメソッド(全角スペースは消すことができない)
		System.out.println(s8.trim());
		// replaceは、文字列を置き換えることができるメソッド
		System.out.println(s8.replace(s8, s1));

	}
}
