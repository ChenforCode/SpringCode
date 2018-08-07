package liuchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        /*TextEditor textEditor = (TextEditor) context.getBean("texteditor");

        textEditor.spellCheck();


        FooC fooC = (FooC) context.getBean("fooC");*/

        /*SetterMain2 setterMain2 = (SetterMain2) context.getBean("setbean2");
        setterMain2.fun2();*/


//        TestBean1 testBean1 = (TestBean1) context.getBean("testbean1");
//        System.out.println(testBean1.toString());


        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection javaCollection = (JavaCollection) context.getBean("javacollection");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
        javaCollection.getAddressPro();
        javaCollection.getAddressSet();
    }
}
