package cn.boommanpro.componentregister3;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/7/11 18:37
 * @created by boommanpro
 */
public class MyConfigurationCondition3 implements ConfigurationCondition {
    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return null;
    }

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
