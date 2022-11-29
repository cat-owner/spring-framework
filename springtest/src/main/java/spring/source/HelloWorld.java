package spring.source;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/11/29
 */
public class HelloWorld {
	private String message;
	public void setMessage(String message){
		this.message=message;
	}
	public void getMessage(){
		System.out.println("Your Message: "+ message);
	}
}
