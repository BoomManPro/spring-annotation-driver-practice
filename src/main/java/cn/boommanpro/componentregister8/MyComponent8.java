package cn.boommanpro.componentregister8;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author <a href="mailto:boommanpro@gmail.com">BoomManPro</a>
 * @data 2019/7/23 21:44
 * @since 1.0.0
 */
@Data
public class MyComponent8 {
    @Value("${person.name}")
    private String name;
}
