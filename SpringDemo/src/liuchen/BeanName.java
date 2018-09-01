package liuchen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanName implements BeanNameAware, ApplicationContextAware{
    private String beanName;

    @Override
    public void setBeanName(String s) {
        beanName = s;
        System.out.println("setBeanName:" + beanName);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean(beanName).hashCode());
    }
}
