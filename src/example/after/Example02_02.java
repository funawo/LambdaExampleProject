package example.after;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import example.dto.Human;

/**
 * ラムダで実行
 *
 * @author hikaru.funayama
 *
 */
public class Example02_02 {
	public static void main(String[] args) {

		List<Human> humans = new ArrayList<Human>() {
			{
				add(new Human("funayanma", 27));
				add(new Human("shimoida", 24));
				add(new Human("sohira", 29));
				add(new Human("shioya", 29));

			}
		};

		Comparator<Human> comparatorOld = (human1, human2) -> human1.getOld() - human2.getOld();
		Comparator<Human> comparatorName = (human1, human2) -> human1.getName().compareTo(human2.getName());

		humans.stream() //
				.sorted(comparatorOld.thenComparing(comparatorName)) //
				.forEach(System.out::println);

	}
}
