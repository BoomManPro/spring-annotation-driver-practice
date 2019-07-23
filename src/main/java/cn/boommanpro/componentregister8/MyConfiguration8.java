package cn.boommanpro.componentregister8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @data 2019/7/23 21:44
 * @since 1.0.0
 */
@Configuration
@PropertySource(value = {"classpath:componentregister8.properties"})
public class MyConfiguration8 {
    @Bean
    public MyComponent8 myComponent8() {
        return new MyComponent8();
    }
}
