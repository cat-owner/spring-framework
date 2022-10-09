package pattern.chain.of.responsibility.example01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: wangyuancun
 * @description: demo test
 * @date: 2022/10/8
 */
public class ChainOfResponsibilityTest {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Service service;
	private static void init(){
		service = new Service();
		service.register("email@example.com","admin_password");
		service.register("user@example.com","user_password");
		Middleware middleware = Middleware.link(new UserIsExistMiddleware(service), new RoleCheckMiddleware());
		service.setMiddleware(middleware);
	}
	public static void main(String [] args) throws IOException{
		init();
		boolean success;
		do{
			System.out.println("Enter email");
			String email = reader.readLine();
			System.out.println("Input password: ");
			String password=reader.readLine();
			success=service.logIn(email,password);

		}while (!success);
	}

}
