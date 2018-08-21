package example.after;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ラムダ式で実行<br>
 * staticで汚染したくない。
 *
 * @author hikaru.funayama
 *
 */
public class Example03_03 {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>() {
			{
				add("funayanma");
				add("shioya");
				add("ikeda");
				add("sohira");
			}
		};

		Function<String, Predicate<String>> startWith = letter -> name -> name.startsWith(letter);

		names.stream() //
				.filter(startWith.apply("s")) //
				.forEach(System.out::println);

		names.stream() //
				.filter(startWith.apply("i")) //
				.forEach(System.out::println);
	}

}
