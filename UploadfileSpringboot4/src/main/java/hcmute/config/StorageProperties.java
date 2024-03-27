package hcmute.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "storage")
public class StorageProperties {
	private String location;
	
}
	