package cn.boommanpro.componentregister8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @data 2019/7/23 21:53
 * @since 1.0.0
 */
public class ComponentRegister8Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration8.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        MyComponent8 bean = annotationConfigApplicationContext.getBean(MyComponent8.class);
        System.out.println(bean);
    }
}
