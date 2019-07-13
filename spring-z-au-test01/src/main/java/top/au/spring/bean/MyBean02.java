package top.au.spring.bean;

/**
 * @Description: 测试 bean
 * @Author: zqy
 * @CreateTime: 2019-07-13 17:47
 */
public class MyBean02 {

	private String name02;

	private String age02;

	public String getName02() {
		return name02;
	}

	public void setName02(String name02) {
		this.name02 = name02;
	}

	public String getAge02() {
		return age02;
	}

	public void setAge02(String age02) {
		this.age02 = age02;
	}

	@Override
	public String toString() {
		return "MyBean02{" +
				"name02='" + name02 + '\'' +
				", age02='" + age02 + '\'' +
				'}';
	}

	public void sayHello(){
		System.out.println("MyBean02 ----> sayHello!");
	}
}
