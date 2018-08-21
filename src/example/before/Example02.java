package example.before;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import example.dto.Human;

/**
 * 従来のやり方
 *
 * @author hikaru.funayama
 *
 */
public class Example02 {
	public static void main(String[] args) {

		List<Human> humans = new ArrayList<Human>() {
			{
				add(new Human("funayanma", 27));
				add(new Human("shimoida", 24));
				add(new Human("shioya", 30));
				add(new Human("sohira", 29));
			}
		};

		humans.stream().sorted(new Comparator<Human>() {
			public int compare(Human o1, Human o2) {
				return o1.getOld() - o2.getOld();
			}
		}).forEach(System.out::println);

		// // または下記のようなコーディング
		// Collections.sort(humans, new Comparator<Human>() {
		// public int compare(Human o1, Human o2) {
		// return o1.getOld() - o2.getOld();
		// }
		// });
		// for (Human human : humans) {
		// System.out.println(human);
		// }

	}
}
