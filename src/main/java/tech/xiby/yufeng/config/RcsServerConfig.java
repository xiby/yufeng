package tech.xiby.yufeng.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * rcsserver configuration
 *
 * @author xiby
 * @date 2020/12/30
 */
@Primary
@Configuration
@ConfigurationProperties(prefix = "rcsserver")
@EnableConfigurationProperties(RcsServerConfig.class)
public class RcsServerConfig {
    private String ip;
    private int port;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
