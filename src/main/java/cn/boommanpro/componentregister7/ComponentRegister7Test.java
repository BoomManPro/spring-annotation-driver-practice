package cn.boommanpro.componentregister7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanFactory 使用示例
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/12 16:43
 * @created by BoomManPro
 */
public class ComponentRegister7Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfiguration7.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        String bean = annotationConfigApplicationContext.getBean(String.class);
        System.out.println(bean);
    }
}
