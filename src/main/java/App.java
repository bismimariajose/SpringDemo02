import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	Car obj = context.getBean(Car.class);
	obj.spec();
	context.close();
	}

}
