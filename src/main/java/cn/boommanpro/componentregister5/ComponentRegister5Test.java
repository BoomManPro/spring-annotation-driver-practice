package cn.boommanpro.componentregister5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/7/11 18:45
 * @created by boommanpro
 */
public class ComponentRegister5Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration5.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
