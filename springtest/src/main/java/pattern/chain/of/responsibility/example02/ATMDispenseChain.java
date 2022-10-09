package pattern.chain.of.responsibility.example02;

/**
 * @author: wangyuancun
 * @description: 创建责任链
 * @date: 2022/10/9
 */
public class ATMDispenseChain {
	public  DispenseChain c1;

	/**
	 * 进行初始化;
	 */
	public ATMDispenseChain(){
		c1=new Dollar100Dispenser();
		Dollar50Dispenser c2 = new Dollar50Dispenser();
		Dollar20Dispenser c3 = new Dollar20Dispenser();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
}
