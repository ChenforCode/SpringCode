package liuchen;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class Nation {
    private People people;

    public Nation(People people){
        System.out.println("inside nation constructor !");
    }
}
