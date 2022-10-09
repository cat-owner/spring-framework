package pattern.chain.of.responsibility.example02;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/9
 */
public class Currency {
	private int amount;

	public Currency(int amt){
		this.amount=amt;
	}

	public int getAmount(){
		return this.amount;
	}
}
