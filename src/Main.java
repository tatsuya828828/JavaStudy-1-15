import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;

public class Main {
	public static void main(String[] args) throws Exception {
		// JapaneseDateクラスを用いれば和暦の情報を取り扱うこともできる
		System.out.println(JapaneseDate.now());
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		System.out.println(l1);
		System.out.println(l2);
	}
}
