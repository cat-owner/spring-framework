package pattern.chain.of.responsibility.example02;

import java.util.Scanner;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/9
 */
public class Test {
	public static void main(String[] args) {
		ATMDispenseChain chain = new ATMDispenseChain();
		while (true){
			int amount =0;
			System.out.println("请输入你要提取的金额");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			chain.c1.dispense(new Currency(amount));
		}
	}
}
