package com.gyg.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郭永钢
 */
@ConfigurationProperties(prefix = "file.dir")
@Configuration
@Data
public class FileDirConfig {
	String oss;
	String disk;
}
