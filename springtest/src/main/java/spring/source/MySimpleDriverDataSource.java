package spring.source;

import org.springframework.lang.Nullable;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/12/1
 */
public class MySimpleDriverDataSource{
	private String url;
	private String username;
	private String password;
	public void setUsername(@Nullable String username) {
		this.username = username;
	}
	public String getUsername() {
		return this.username;
	}
	public void setPassword(@Nullable String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setUrl(@Nullable String url) {
		this.url = (url != null ? url.trim() : null);
	}
	public String getUrl() {
		return this.url;
	}
}
