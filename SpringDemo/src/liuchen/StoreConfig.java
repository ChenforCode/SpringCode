package liuchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration

//因为如果用了Configuration之后，创建ctx的时候就不需要xml文件了，但是需要引入properties文件
//所以在xml文件中引入properties文件，然后在这个地方引入xml文件
//@ImportResource("Ann-cog.xml")
public class StoreConfig {

//    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destory")
//    //Scope注解是定义bean的定义域，一个是singleton,另外一个是prototype
//    @Scope(value = "singleton")
//    public Store getStringStore(){
//        return new StringStore();
//    }

//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager(){
//
//        return new MyDriverManager(url, username, password);
//    }


    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }

//    @Bean(name = "testStore")
//    public Store test(){
//        System.out.println(s1.getClass().getName());
//        System.out.println(s2.getClass().getName());
//        return new StringStore();
//    }
    @Bean(name = "innerc")
    public innerC innerc(){

        System.out.println("s1: " + s1.getClass().getName());
        System.out.println("s2: " + s2.getClass().getName());
        return new innerC();
    }

}
