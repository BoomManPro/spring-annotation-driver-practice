package cn.boommanpro.componentregister4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:boommanpro@gmail.com">boommanpro</a>
 * @date 2019/7/11 18:41
 * @created by boommanpro
 */
@Import(value = WaitForImportConfiguration4.class)
@Configuration
public class MyConfiguration4 {
}
