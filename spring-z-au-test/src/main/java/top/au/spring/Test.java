package top.au.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.au.spring.bean.MyBean01;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean01 myBean01 = context.getBean("myBean01", MyBean01.class);
		System.out.println(myBean01.getName01() + "---" + myBean01.getAge01());
//		myBean01.toString(); // todo 不知道为什么这样调用为什么没有任何结果输出，而上面的择有
		myBean01.sayHello();


	}
}
