package cn.boommanpro.extendtheory1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 11:04
 * @created by BoomManPro
 */
@Data
public class MyTheory1Component implements InitializingBean, DisposableBean {

    private String name;

    public MyTheory1Component() {
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
