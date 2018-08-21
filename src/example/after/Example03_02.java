package example.after;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * ラムダ式で実行<br>
 * クロージャを使う
 *
 * @author hikaru.funayama
 *
 */
public class Example03_02 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>() {
			{
				add("funayanma");
				add("shioya");
				add("ikeda");
				add("sohira");
			}
		};

		names.stream() //
				.filter(startWith("s")) //
				.forEach(System.out::println);
	}

	/**
	 * 引数で始まる文字列を検索します。
	 *
	 * @param letter
	 *            クロージャ
	 * @return
	 */
	public static Predicate<String> startWith(String letter) {
		return name -> name.startsWith(letter);
	}
}
