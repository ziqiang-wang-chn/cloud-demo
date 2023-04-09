package com.example.nacosconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@ConfigurationProperties(prefix = "ohbug")
public class User {
    private String name;
    private String site;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", site='" + site + '\'' +
                '}';
    }

}