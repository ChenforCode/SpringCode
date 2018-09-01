package liuchen;


import org.springframework.beans.factory.annotation.Required;

//开始使用注解
public class Student {
    private Integer age;
    private String name;

    /*public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }*/

    public Integer getAge() {
        System.out.println("age: " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException(){
        System.out.println("Exception raised!");
        throw new IllegalArgumentException();
    }
}
