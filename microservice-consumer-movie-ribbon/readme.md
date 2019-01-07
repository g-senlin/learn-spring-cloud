## 可以通过代码和属性配置两种方式配置 Ribbon 负载均衡策略
注意：属性配置的优先级高于代码配置。

### Ribbon配置自定义【全局配置】
```java
@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class RibbonClientDefaultConfigurationTestsConfig {
}
@Configuration
class DefaultRibbonConfig {
  @Bean
  public IRule ribbonRule() {
    return new RandomRule();
  }
}
```
### 属性配置方式【推荐】
```
ribbon:
  NFLoadBalancerRuleClassName: com.netflix.loadbalancer.RandomRule
```

Ribbon Eager加载
默认情况下Ribbon是懒加载的——首次请求Ribbon相关类才会初始化，这会导致首次请求过慢的问题，你可以配置饥饿加载，让Ribbon在应用启动时就初始化。
```
ribbon:
  eager-load:
    enabled: true
    # 多个用,分隔
    clients: microservice-provider-user


```
