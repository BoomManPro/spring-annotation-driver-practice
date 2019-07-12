package cn.boommanpro.componentregister6;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/12 14:14
 * @created by BoomManPro
 */

public class WaitForImportComponent6 implements ImportBeanDefinitionRegistrar {
    /**
     * 可以通过本方法给容器内添加Bean
     *
     * @param importingClassMetadata @Configuration注解类的注解信息
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(MyComponent6.class);
        registry.registerBeanDefinition("myComponent6",rootBeanDefinition );
    }
}
