package cn.boommanpro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:boommanpro@mininglamp.com">BoomManPro</a>
 * @date 2019/7/10 14:54
 * @created by BoomManPro
 */
public class SpringAnnotationDriverPractice {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.refresh();
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
