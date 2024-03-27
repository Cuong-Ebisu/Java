package hcmute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import hcmute.config.CustomSiteMeshFilter;

@SpringBootApplication
public class UploadFileSpringBoot3Application {

	public static void main(String[] args) {
		SpringApplication.run(UploadFileSpringBoot3Application.class, args);
	}
	@Bean

	public FilterRegistrationBean<CustomSiteMeshFilter> siteMeshFilter() {

		FilterRegistrationBean<CustomSiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<>();

		filterRegistrationBean.setFilter(new CustomSiteMeshFilter()); // adding sitemesh filter ??

		filterRegistrationBean.addUrlPatterns("/*");

		return filterRegistrationBean;

	}
}