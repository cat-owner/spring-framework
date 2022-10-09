package pattern.chain.of.responsibility;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/8
 */
public class UserIsExistMiddleware extends Middleware {
	private Service service;
	public UserIsExistMiddleware(Service service){
		this.service=service;
	}
	@Override
	public boolean check(String email, String password) {
		if(!service.hasEmail(email)){
			System.out.println("This email is not registered");
			return false;
		}
		if(!service.isValiadPassword(email,password)){
			System.out.println("wrong password");
			return false;
		}
		return checkNext(email, password);
	}

}
