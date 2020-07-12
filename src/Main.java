import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		// 現在日時を持つDateインスタンスの生成
		// Dateクラスも基準日時からの経過ミリ秒で計算している
		Date d = new Date();
		System.out.println(d);
		// currentTimeMillisメソッドを呼べばlong型で受け取ることができる
		// 基準日時から経過したミリ秒をlong型の変数に代入する
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		// 経過した時間の差を出すことで処理時間の計測を表すことができる
		System.out.println("処理はにかかった時間は・・・"+ (end - start) +"ミリ秒でした");

		Calendar c = Calendar.getInstance();
		// 年、月、日、時、分、秒の6つのint値を代入する
		c.set(2019, 8, 22 , 1, 23, 45);
		// 月の値を9に変更
		c.set(Calendar.MONTH, 9);
		// 6つのint値を使ってDateインスタンスを生成
		Date d1 = c.getTime();
		System.out.println(d1);

		// Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		// 生成したインスタンスから年を取り出す
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は"+ y +"年です");

		// y=年 M=月 d=日 H=時 m=分 s=秒を表している
		// 他にも K=時(0~11) a/p=午前/午後 E=曜日 などがある
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 文字列からDateインスタンスを生成
		Date d2 = f.parse("2020/09/22 01:23:45");
		System.out.println(d2);
		// Dateインスタンスから文字列を生成
		Date now2 = new Date();
		String s = f.format(now2);
		System.out.println("現在は"+ s +"です");
	}
}
