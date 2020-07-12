import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(sb);
		String[] a = s.split(",");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}

		System.out.println();
		String str = concatPath("c:¥javadev", "readme.txt");
		System.out.println(str);

		// 現在日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		// 取得した日時情報をCalendarにセット
		c.setTime(now);
		// Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 取得した値に100を足してCalendarの「日」にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		// Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		// 指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));


		// TimeAPIを使った場合
		LocalDate now2 = LocalDate.now();
		LocalDate future2 = now2.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future2.format(fmt));
	}

	public static String concatPath(String folder, String file) {
		if(!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}
}
