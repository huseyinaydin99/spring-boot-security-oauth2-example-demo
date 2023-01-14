package com.huseyinaydin.spring.cloud.security.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso //OAuth2'yi aktifleştirdik || enable hale getirdik.!
@RestController
public class SpringCloudOauth2ExampleApplication {
	
	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" hoşgeldiniz OAuth2 uygulamasına";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2ExampleApplication.class, args);
	}

}
