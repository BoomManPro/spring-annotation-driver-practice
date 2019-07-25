package cn.boommanpro.extendtheory1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 17:04
 * @created by BoomManPro
 */
@Configuration
@ComponentScan("cn.boommanpro.extendtheory1")
public class ExtendConfig1 {
    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public MyTheory1Component myTheory1Component() {
        return new MyTheory1Component();
    }
}
