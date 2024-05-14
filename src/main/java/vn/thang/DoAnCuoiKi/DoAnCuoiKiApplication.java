package vn.thang.DoAnCuoiKi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Service.StorageService;

//@SpringBootApplication(
//		scanBasePackages= {
//				"Controller",
//				"Controller.Admin",
//				"Model",
//				"Repository",
//				"Service",
//				"vn.thang.DoAnCuoiKi",
//		}
//)
@SpringBootApplication
@ComponentScan(basePackages = {				
					"Controller.Admin",
					"Controller.User",
					"Model",
					"Repository",
					"Service",
					"vn.thang.DoAnCuoiKi"
				}
)
@ComponentScan({"com.delivery.request"})
@EntityScan("Model")
@EnableJpaRepositories("Repository")
public class DoAnCuoiKiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DoAnCuoiKiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}
}
