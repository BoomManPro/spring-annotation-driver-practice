package cn.boommanpro.componentregister10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 11:01
 * @created by BoomManPro
 */
@Configuration
public class MyConfiguration10 {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public MyComponent10 myComponent10() {
        return new MyComponent10();
    }
}
