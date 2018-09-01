package liuchen;

public class StringStore implements Store<String> {
    public void init(){
        System.out.println("init bean!");
    }

    public void destory(){
        System.out.println("destory bean!");
    }
}
