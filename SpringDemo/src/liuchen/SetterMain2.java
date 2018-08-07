package liuchen;

public class SetterMain2 {

    private SetterMain1 setterMain1;

    public SetterMain1 getSetterMain1() {
        return setterMain1;
    }

    public void setSetterMain1(SetterMain1 setterMain1) {
        System.out.println("inside setMain1");
        this.setterMain1 = setterMain1;
    }

    public void fun2(){
        setterMain1.fun1();
    }
}
