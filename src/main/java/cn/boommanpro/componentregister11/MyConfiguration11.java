package cn.boommanpro.componentregister11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/30 21:33
 * @created by BoomManPro
 */
@Configuration
public class MyConfiguration11 {
    @Profile("dev")
    @Bean
    public MyDevComponent11 myDevComponent11(){
        return new MyDevComponent11();
    }

    @Profile("test")
    @Bean
    public MyTestComponent11 myTestComponent11(){
        return new MyTestComponent11();
    }
}
