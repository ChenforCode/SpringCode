package liuchen;

import org.aspectj.lang.ProceedingJoinPoint;

public class ChenAspect {
    public void before(){
        System.out.println("ChenAspect before!");
    }

    public void afterReturning(){
        System.out.println("ChenAspect afterReturning!");
    }

    public void afterThrowing (){
        System.out.println("ChenAspect afterThrowing !");
    }

    public void after(){
        System.out.println("ChenAspect after !");
    }

    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;
        try {
            System.out.println("ChenAspect around 1");
            obj = pjp.proceed();
            System.out.println("ChenAspect around 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times){
        System.out.println(bizName + "  " + times);

        Object obj = null;
        try {
            System.out.println("ChenAspect aroundInit 1");
            obj = pjp.proceed();
            System.out.println("ChenAspect aroundInit 2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }
}
