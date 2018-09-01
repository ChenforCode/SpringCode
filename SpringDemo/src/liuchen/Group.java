package liuchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Group {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Group() {
        System.out.println("inside group constructor");
    }

    public void getName(){
        System.out.println(student.getName());
    }

    public void getAge(){
        System.out.println(student.getAge());
    }
}
