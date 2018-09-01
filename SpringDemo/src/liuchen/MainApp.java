package liuchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /*TextEditor textEditor = (TextEditor) context.getBean("texteditor");

        textEditor.spellCheck();


        FooC fooC = (FooC) context.getBean("fooC");*/

        /*SetterMain2 setterMain2 = (SetterMain2) context.getBean("setbean2");
        setterMain2.fun2();*/


//        TestBean1 testBean1 = (TestBean1) context.getBean("testbean1");
//        System.out.println(testBean1.toString());


        //注入集合
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        JavaCollection javaCollection = (JavaCollection) context.getBean("javacollection");
//        javaCollection.getAddressList();
//        javaCollection.getAddressMap();
//        javaCollection.getAddressPro();
//        javaCollection.getAddressSet();


//        ApplicationContext context = new ClassPathXmlApplicationContext("BeanAnn.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println("Age: " + student.getAge());
//        System.out.println("Name: " + student.getName());


//        Qualifier for student and group
          /*ApplicationContext context = new ClassPathXmlApplicationContext("BeanAnn.xml");
          Group group = (Group) context.getBean("group");*/

//          ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//          HelloWorld helloWorld = context.getBean(HelloWorld.class);
//          helloWorld.setMessage1("hello world!");
//          helloWorld.getMessage1();

//        ApplicationContext ctx = new AnnotationConfigApplicationContext(NationConfig.class);
//        Nation nation = ctx.getBean(Nation.class);

//        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("EventConfig.xml");
//        ctx.start();
//
//        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
//        helloWorld.getMessage1();
//
//        ctx.stop();

//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Cus.xml");
//        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
//        customEventPublisher.publish();
//        ApplicationContext context = new ClassPathXmlApplicationContext("AOP-config.xml");
//        Student student = (Student) context.getBean("student");
//
//        student.getName();
//        student.getAge();
//        student.printThrowException();
//        ApplicationContext context = new ClassPathXmlApplicationContext("Aware-config.xml");
//        System.out.println(context.getBean("beanName").hashCode());

        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring0-cg.xml");
        AutoWiringService autoWiringService = (AutoWiringService) context.getBean("autoWiringService");
        autoWiringService.say();
    }
}
