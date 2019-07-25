package cn.boommanpro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * annotation @Configuration example {@link cn.boommanpro.componentregister1.ComponentRegister1Test}
 * annotation @Component and @ComponentScan example {@link cn.boommanpro.componentregister2.ComponentRegister2Test}
 * annotation @Conditional example {@link cn.boommanpro.componentregister3.ComponentRegister3Test}
 * annotation @Import example {@link cn.boommanpro.componentregister4.ComponentRegister4Test}
 * interface ImportSelector example {@link cn.boommanpro.componentregister5.ComponentRegister5Test}
 * interface ImportBeanDefinitionRegistrar example {@link cn.boommanpro.componentregister6.ComponentRegister6Test}
 * interface FactoryBean example {@link cn.boommanpro.componentregister7.ComponentRegister7Test}
 *
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
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
