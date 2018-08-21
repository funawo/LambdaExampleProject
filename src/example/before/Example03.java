package example.before;

import java.util.ArrayList;
import java.util.List;

/**
 * 従来のやり方
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

		for (String name : names) {
			if (name.startsWith("s")) {
				System.out.println(name);
			}
		}
	}
}
