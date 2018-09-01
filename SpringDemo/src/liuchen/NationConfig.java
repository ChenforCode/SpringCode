package liuchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//这个注解说明这个类是用来生成bean的
//@Configuration
public class NationConfig {


    //这个注解说明这个方法可以返回一个bean
    //@Bean
    public Nation nation(){
        return new Nation(people());
    }

    //@Bean
    public People people(){
        return new People();
    }
}
