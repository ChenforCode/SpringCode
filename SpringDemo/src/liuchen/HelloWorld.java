package liuchen;

public class HelloWorld {
    private String Message1;
    private String Message2;

    public void getMessage1() {
        System.out.println("HelloWorld Message1:" + Message1);
    }

    public void setMessage1(String message1) {
        Message1 = message1;
    }

    public void getMessage2() {
        System.out.println("HelloWorld Message2:" + Message2);
    }

    public void setMessage2(String message2) {
        Message2 = message2;
    }

    public void init ( ){
        System.out.println("bean is init");
    }
    public void destory (){
        System.out.println("bean is destory");
    }

}
