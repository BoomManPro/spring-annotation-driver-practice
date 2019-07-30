package cn.boommanpro.componentregister11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@link org.springframework.context.annotation.Profile}
 * Spring为我们提供可以根据当前环境,动态的激活和切换一系列组件的功能，
 * 开发环境 测试环境 生产环境
 * 数据源{A/B/C}
 *
 * VM arguments
 * -Dspring.profiles.active=test
 *
 * 又或者 @PropertySource(value = "classpath:application.yml")
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/30 21:30
 * @created by BoomManPro
 */
public class ComponentRegister11Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration11.class);
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
