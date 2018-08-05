package liuchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        /*
        这个地方bean的作用域是singleton，即整个IOC容器中只会存在着一个bean，大家共享

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        helloWorld.setMessage("aaaaa");

        helloWorld.getMessage();

        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloworld");
        helloWorld1.getMessage();*/

        /*
        * 作用域为prototype 即每次getBean都会生成一个新的bean对象
        *
        * */


        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        helloWorld.getMessage1();
        helloWorld.getMessage2();

        HelloChina helloChina = (HelloChina) context.getBean("hellochina");
        helloChina.getMessage1();
        helloChina.getMessage2();
        helloChina.getMessage3();

    }

}
