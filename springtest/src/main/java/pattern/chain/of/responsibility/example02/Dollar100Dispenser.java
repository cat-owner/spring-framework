package pattern.chain.of.responsibility.example02;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/9
 */
public class Dollar100Dispenser implements DispenseChain{

	private DispenseChain chain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount()>100){
			int num=cur.getAmount()/100;
			int remainder=cur.getAmount()%100;
			System.out.println("Dispensing " +num+" 100$ note");
			if(remainder!=0){
				this.chain.dispense(new Currency(remainder));
			}
		}else{
			this.chain.dispense(cur);
		}

	}
}
