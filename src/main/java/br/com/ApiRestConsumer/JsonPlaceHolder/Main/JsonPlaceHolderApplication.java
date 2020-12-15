package br.com.ApiRestConsumer.JsonPlaceHolder.Main;

import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Controller.PostsController;
import br.com.ApiRestConsumer.JsonPlaceHolder.Main.Service.PostsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackageClasses = {PostsService.class, PostsController.class})
@EnableJpaRepositories("br.com.ApiRestConsumer.JsonPlaceHolder.Main.Repository")
@ComponentScan("br.com.ApiRestConsumer.JsonPlaceHolder.Main")
@EntityScan("br.com.ApiRestConsumer.JsonPlaceHolder.Main.Model")
public class JsonPlaceHolderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonPlaceHolderApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			ResponseEntity<Posts> posts = restTemplate.getForEntity(
//					"https://jsonplaceholder.typicode.com/posts", Posts.class);
//			System.out.println(posts.toString());
//		};
//
//	}
}
