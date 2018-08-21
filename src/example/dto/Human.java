package example.dto;

public class Human {

	/**
	 * 名前
	 */
	private String name;
	/**
	 * 年齢
	 */
	private int old;

	/**
	 * デフォルトコンストラクタ
	 *
	 * @param name
	 * @param old
	 */
	public Human(String name, int old) {
		this.name = name;
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.old;
	}

	/**
	 * 年齢を比較し年齢差を返します。
	 *
	 * @param human
	 * @return 年齢差
	 */
	public int compareOld(Human human) {
		return this.old - human.getOld();
	}
}
