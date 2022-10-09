package pattern.chain.of.responsibility.example02;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/9
 */
public class Dollar20Dispenser implements DispenseChain{
	private DispenseChain chain;
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 20){
			int num = cur.getAmount()/20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing "+num+" 20$ note");
			if(remainder !=0){
				System.out.println(remainder + "not handle");
			}
		}else{
			System.out.println(cur.getAmount() + " not handle");
		}
	}
}
