package com.tenchael.jmetertest;

/**
 * Created by tengzhizhang on 2018/3/20.
 */
public class Numbers {

	/**
	 * 求两个数的最大公约数
	 *
	 * @param a
	 * @param b
	 * @return 最大公约数
	 */
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return Numbers.gcd(b, a % b);
	}
}
