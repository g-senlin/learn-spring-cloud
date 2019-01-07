package Ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过代码的方式配置 负载均衡策略
 *
 * 该类为Ribbon的配置类
 * 注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享。
 *
 * @author gsl
 * @date 2019/1/7 20:39.
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
