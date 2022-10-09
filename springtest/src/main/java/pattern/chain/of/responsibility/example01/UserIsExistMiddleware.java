package pattern.chain.of.responsibility.example01;

import pattern.chain.of.responsibility.example01.Middleware;
import pattern.chain.of.responsibility.example01.Service;

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
