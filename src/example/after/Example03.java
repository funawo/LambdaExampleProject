package example.after;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * ラムダ式で実行
 *
 * @author hikaru.funayama
 *
 */
public class Example03 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>() {
			{
				add("funayanma");
				add("shioya");
				add("ikeda");
				add("sohira");
			}
		};

		Predicate<String> startWithS = letter -> letter.startsWith("s");
		names.stream() //
				.filter(startWithS) //
				.forEach(System.out::println);
	}
}
