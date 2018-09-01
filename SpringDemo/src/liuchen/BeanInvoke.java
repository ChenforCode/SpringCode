package liuchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoke {
    @Autowired
    private List<BaseBean> list;

    @Autowired
    private Map<String, BaseBean> map;

    @Autowired
    @Qualifier("beanImplOne")
    private BaseBean baseBean;

    public void say(){

        System.out.println("list----------!");
        if (null != list && 0 != list.size()){
            for (BaseBean baseBean : list){
                System.out.println(baseBean.getClass().getName());
            }
        } else {
            System.out.println("list is null !!!");
        }

        System.out.println();
        if (null != map && 0 != map.size()){
            for (Map.Entry<String, BaseBean> entry : map.entrySet()){
                System.out.println(entry.getKey() + "   " + entry.getValue().getClass().getName());
            }
        }

        System.out.println();
        if (null != baseBean){
            System.out.println(baseBean.getClass().getName());
        }
    }
}
