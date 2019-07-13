package top.au.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.au.spring.bean.MyBean01;

/**
 * @Description: spring 的启动测试类
 * @Author: zqy
 * @CreateTime: 2019-07-13 18:04
 */
public class Test01 {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		MyBean01 myBean01 = context.getBean("myBean01", MyBean01.class);
		System.out.println(myBean01.getName01() + " ------ " + myBean01.getAge01());
		myBean01.sayHello();
	}
}
