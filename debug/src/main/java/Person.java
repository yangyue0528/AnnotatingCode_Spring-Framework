import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: yangy
 * @create: 2021-04-09 00:22
 * @description: --
 **/
@Component
public class Person {

	private String name = "张三";

	private int age = 23;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{name:" + name + ", age:" + age + "}";
	}
}
