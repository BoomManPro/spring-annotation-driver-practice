package cn.boommanpro.componentregister3;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/7/11 18:35
 * @created by boommanpro
 */
@Conditional(value = MyConfigurationCondition3.class)
@Configuration
public class MyConfiguration3 {
}
