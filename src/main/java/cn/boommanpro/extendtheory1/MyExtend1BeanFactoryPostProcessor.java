package cn.boommanpro.extendtheory1;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/25 17:05
 * @created by BoomManPro
 */
@Component
public class MyExtend1BeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * 调用时机 BeanFactor标准初始化之后 所有的Bean
     *
     * 修改Bean元信息 会涉及到优先级问题
     */

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("execute MyExtend1BeanFactoryPostProcessor postProcessBeanFactory");
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("count:"+beanDefinitionCount);
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        BeanDefinition myTheory1Component = beanFactory.getBeanDefinition("myTheory1Component");
        MutablePropertyValues propertyValues = myTheory1Component.getPropertyValues();
        propertyValues.addPropertyValue("name", "123");
        System.out.println("<-------------------------->");
    }
}
