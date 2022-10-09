package pattern.chain.of.responsibility;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/8
 */
public class RoleCheckMiddleware extends Middleware{
	@Override
	public boolean check(String email, String password) {
		if(email.equals("email@example.com")){
			System.out.println("hello,admin");
			return true;
		}
		System.out.println("hello,user");
		return checkNext(email,password);
	}
}
