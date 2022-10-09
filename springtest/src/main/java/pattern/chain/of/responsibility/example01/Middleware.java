package pattern.chain.of.responsibility.example01;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/8
 */
public abstract class Middleware {
	private Middleware next;
	public static Middleware link(Middleware first,Middleware ... chain){
		Middleware head =first;
		for(Middleware nextInChain: chain){
			head.next=nextInChain;
			head =nextInChain;
		}
		return first ;
	}
	public  abstract boolean check(String email,String password);
	protected boolean checkNext(String email,String password){
		if(next ==null){
			return true;
		}
		return next.check(email,password);
	}
}
