package pattern.chain.of.responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/10/8
 */
public class Service {
	private Map<String,String> users =new HashMap<>();
	private Middleware middleware;
	public void setMiddleware(Middleware middleware){
		this.middleware =middleware ;
	}
	public boolean logIn(String email,String password){
		if(middleware.check(email,password)){
			System.out.println("Authorization have been successful;");
			return true;
		}
		return false;
	}
	public void register(String email,String password){
		users.put(email,password);
	}
	public boolean hasEmail(String email){
		return users.containsKey(email);
	}
	public boolean isValiadPassword(String email,String password){
		return users.get(email).equals(password);
	}

}
