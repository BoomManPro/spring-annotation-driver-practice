package cn.boommanpro.componentregister6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @data 2019/7/23 21:44
 * @since 1.0.0
 */
@Configuration
@PropertySource(value = {"classpath:componentregister6.properties"})
public class MyConfiguration6 {
    @Bean
    public MyComponent6 myComponent6() {
        return new MyComponent6();
    }
}
