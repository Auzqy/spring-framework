package top.au.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.au.spring.bean.MyBean01;

public class Test {


	public static void main(String[] args) {
		// 这句话是 spring 容器的核心，其中做了很多事情
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// 从容器中获取对象
		MyBean01 myBean01 = context.getBean("myBean01", MyBean01.class);
		System.out.println(myBean01.getName01() + "---" + myBean01.getAge01());
//		myBean01.toString(); // todo 不知道为什么这样调用为什么没有任何结果输出，而上面的择有
		myBean01.sayHello();

	}
}
