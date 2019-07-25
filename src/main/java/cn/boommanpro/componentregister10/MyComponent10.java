package cn.boommanpro.componentregister10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 11:04
 * @created by BoomManPro
 */
public class MyComponent10 implements InitializingBean, DisposableBean {

    public MyComponent10() {
        System.out.println("MyComponent10  execute construction");
    }

    public void initMethod(){
        System.out.println("MyComponent10  execute initMethod");
    }

    public void destroyMethod(){
        System.out.println("MyComponent10  execute destroyMethod");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("MyComponent10  execute postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("MyComponent10  execute PreDestroy");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyComponent10  execute interface InitializingBean -> afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyComponent10  execute interface DisposableBean -> destroy");
    }
}
