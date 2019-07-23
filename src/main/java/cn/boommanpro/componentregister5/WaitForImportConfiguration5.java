package cn.boommanpro.componentregister5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/7/11 18:43
 * @created by boommanpro
 */
public class WaitForImportConfiguration5 implements ImportSelector {
    /**
     * 这个Bean不会创建 虽然IDEA 左边有标识
     *
     * 一般使用方式? {@link org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration.CacheConfigurationImportSelector}
     */
    @Bean
    public String string(){
        return "";
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
        return new String[]{WaitForImportComponent5.class.getName()};
    }
}
