package example.before;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * 従来のやり方
 *
 * @author hikaru.funayama
 *
 */
public class Example01 {
	public static void main(String[] args) {

		List<BigDecimal> prices = Arrays.asList( //
				new BigDecimal("10") //
				, new BigDecimal("30") //
				, new BigDecimal("17") //
				, new BigDecimal("20") //
				, new BigDecimal("15") //
				, new BigDecimal("18") //
				, new BigDecimal("45") //
				, new BigDecimal("12") //
		);

		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
				// 価格を1割引きして足す
				totalOfDiscountedPrices = //
						totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}

		System.out.println("合計値:" + totalOfDiscountedPrices);
	}
}
