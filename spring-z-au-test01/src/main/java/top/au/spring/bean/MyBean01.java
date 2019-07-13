package top.au.spring.bean;

/**
 * @Description: 测试 bean
 * @Author: zqy
 * @CreateTime: 2019-07-13 17:47
 */
public class MyBean01 {

	private String name01;

	private String age01;

	public String getName01() {
		return name01;
	}

	public void setName01(String name01) {
		this.name01 = name01;
	}

	public String getAge01() {
		return age01;
	}

	public void setAge01(String age01) {
		this.age01 = age01;
	}

	@Override
	public String toString() {
		return "MyBean01{" +
				"name01='" + name01 + '\'' +
				", age01='" + age01 + '\'' +
				'}';
	}

	public void sayHello(){
		System.out.println("MyBean01 ----> sayHello!");
	}
}
