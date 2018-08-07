package liuchen;

public class TestBean1 {
    private String name;
    private String sex;
    private int age;
    private innerC innerC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public liuchen.innerC getInnerC() {
        return innerC;
    }

    public void setInnerC(liuchen.innerC innerC) {
        this.innerC = innerC;
    }

    @Override
    public String toString() {
        return "TestBean1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
