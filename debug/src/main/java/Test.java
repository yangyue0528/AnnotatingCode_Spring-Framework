import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: yangy
 * @create: 2021-04-09 00:23
 * @description: --
 **/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(Person.class);
		Person appConfig = (Person)ac.getBean("person");
		System.out.println(appConfig.getName());
	}
}
