import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat = (Cat) applicationContext.getBean("cat");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");

        boolean helloWorld = bean == bean1;
        boolean cat = beanCat == beanCat1;

        System.out.println(helloWorld);
        System.out.println(cat);

        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(beanCat.getName());
        System.out.println(beanCat1.getName());
    }
}