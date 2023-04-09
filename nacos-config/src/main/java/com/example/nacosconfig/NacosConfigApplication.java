package com.example.nacosconfig;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.AbstractListener;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NacosConfigApplication {
    @Resource
    private NacosConfigManager nacosConfigManager;
    @Bean
    ApplicationRunner runner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                String dataId = "nacos-config-demo.properties";
                String group = "DEFAULT_GROUP";
                nacosConfigManager.getConfigService().addListener(dataId, group, new AbstractListener() {
                    @Override
                    public void receiveConfigInfo(String configInfo) {
                        System.out.println("listener ==> " + configInfo);
                    }
                });
            }
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
    }
}
