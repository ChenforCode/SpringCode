package liuchen;

public class ChenBiz {
    public void biz (){
        System.out.println("AspectBiz biz");
        //throw new RuntimeException();
    }

    public void biz2(){
        System.out.println("AspectBiz biz 2 !");
    }

    public void init (String bizName, int times){
        System.out.println("Aspectbiz init: " + bizName + " " + times);

    }
}
