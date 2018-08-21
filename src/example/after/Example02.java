package example.after;

import java.util.ArrayList;
import java.util.List;

import example.dto.Human;

/**
 * ラムダで実行
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

		humans.stream() //
				.sorted((human1, human2) -> human1.getOld() - human2.getOld()) //
				.forEach(System.out::println);

		// 下記の記載方法もあり。
		// メソッド参照で簡略化
		humans.stream() //
				.sorted(Human::compareOld) //
				.forEach(System.out::println);

	}
}
