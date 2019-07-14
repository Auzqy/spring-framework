package top.au.spring.bean;

import lombok.Data;

/**
 * @Description:
 * @Author: zqy
 * @CreateTime: 2019-07-13 20:24
 */
@Data
public class MyBean02 {

	private String name02;

	private String age02;

	public void sayHello(){
		System.out.println("MyBean02 ----> sayHello()");
	}
}
