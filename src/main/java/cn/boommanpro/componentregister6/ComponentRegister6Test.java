package cn.boommanpro.componentregister6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @data 2019/7/23 21:43
 * @since 1.0.0
 */
public class ComponentRegister6Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration6.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        MyComponent6 bean = annotationConfigApplicationContext.getBean(MyComponent6.class);
        System.out.println(bean);
    }
}
