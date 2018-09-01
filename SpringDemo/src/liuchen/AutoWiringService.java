package liuchen;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWiringService {

    private AutoWiringDao autoWiringDao;

    public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
        System.out.println("执行setter方法！");
        this.autoWiringDao = autoWiringDao;
    }

    public void say(){
        this.autoWiringDao.say("this is autowiring by setter !");
    }
}
