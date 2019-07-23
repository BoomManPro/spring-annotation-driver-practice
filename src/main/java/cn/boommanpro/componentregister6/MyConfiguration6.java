package cn.boommanpro.componentregister6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @date 2019/7/12 14:14
 * @created by BoomManPro
 */
@Import(value = WaitForImportComponent6.class)
@Configuration
public class MyConfiguration6 {
}
