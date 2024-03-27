package hcmute.config;

import org.springframework.context.annotation.Bean;	
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class FileUploadConfig {
	@Bean
    public MultipartResolver multipartResolver() {
		
        MultipartResolver resolver = new MultipartResolver() {
			
			@Override
			public MultipartHttpServletRequest resolveMultipart(HttpServletRequest request) throws MultipartException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isMultipart(HttpServletRequest request) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void cleanupMultipart(MultipartHttpServletRequest request) {
				// TODO Auto-generated method stub
				
			}
		};
        resolver.setMaxUploadSizePerFile(10 * 1024 * 1024); // 10MB
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:uploads/");
    }
}
