package cn.boommanpro.componentregister7;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/15 16:30
 * @created by BoomManPro
 */
@Configuration
public class MyConfiguration7 implements SmartFactoryBean<String>  {
    @Override
    public String getObject() throws Exception {
        System.out.println("加载bean string 123");
        return "123";
    }

    @Override
    public Class<String> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isEagerInit() {
        return false;
    }
}
