package cn.boommanpro.componentregister1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 组件注册 {@link Configuration}  xml文件
 * 组件注册 {@link Bean} 类比之前 <Bean id=""></Bean>
 *
 * Configuration 类比 之前的
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/10 14:58
 * @created by BoomManPro
 */
@Configuration
public class MyConfiguration1 {
    @Bean
    public String myString(){
        return "";
    }
}
