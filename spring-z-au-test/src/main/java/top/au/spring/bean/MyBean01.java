package top.au.spring.bean;

import lombok.Data;

/**
 * @Description:
 * @Author: zqy
 * @CreateTime: 2019-07-13 20:24
 */
@Data
public class MyBean01 {

	private String name01;

	private String age01;

	public void sayHello(){
		System.out.println("MyBean01 ----> sayHello()");
	}
}
