package liuchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

    //@Autowired
    private JsrDao jsrDao;


//    @Resource
//    public void setJsrDao(JsrDao jsrDao) {
//        this.jsrDao = jsrDao;
//    }

    @Autowired
    public void setJsrDao(JsrDao jsrDao) {
        this.jsrDao = jsrDao;
    }

    public void save(){
        jsrDao.save();
    }
}
