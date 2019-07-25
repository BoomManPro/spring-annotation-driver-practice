package cn.boommanpro.componentregister9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 内部实现 BeanPostProcessor 可能
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 10:35
 * @created by BoomManPro
 */
@Configuration
@ComponentScan("cn.boommanpro.componentregister9")
public class MyConfiguration9 {

    @Bean
    public MyComponent9 myComponent9() {
        return new MyComponent9();
    }

    @Bean
    public MyBeanPostProcessor9 myBeanPostProcessor9() {
        return new MyBeanPostProcessor9();
    }
}
