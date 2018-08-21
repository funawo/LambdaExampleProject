package example.after;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * ラムダ式で実行
 *
 * @author hikaru.funayama
 *
 */
public class Example01_02 {
	public static void main(String[] args) {

		List<BigDecimal> prices = Arrays.asList( //
				new BigDecimal("10") //
				, new BigDecimal("30") //
				, new BigDecimal("17") //
				, new BigDecimal("20") //
				, new BigDecimal("15") //
				, new BigDecimal("18") //
				, new BigDecimal("45") //
				, null // nullが存在するケース
				, new BigDecimal("12") //
		);

		BigDecimal total = prices.stream() //
				.filter(price -> price != null) // 先にNULLを除外しておく。
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0) //
				.map(price -> price.multiply(BigDecimal.valueOf(0.9))) //
				.reduce(BigDecimal.ZERO, BigDecimal::add); //

		// 20ドルより大きい価格をフィルタして、
		// その価格0.9をかけるマップ処理を行い、
		// それらを合計します。

		System.out.println("合計値:" + total);
	}
}
