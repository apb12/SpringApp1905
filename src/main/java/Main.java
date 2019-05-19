import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/context.xml");
        BMW b=context.getBean(BMW.class);
        b.drive();
        b.stop();
    }
}
