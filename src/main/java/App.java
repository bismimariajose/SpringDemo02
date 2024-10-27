import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	Car obj = context.getBean("swift", Car.class);
	obj.spec();
	Car obj2 = context.getBean("corola", Car.class);
	obj2.spec();
	context.close();
	}

}
