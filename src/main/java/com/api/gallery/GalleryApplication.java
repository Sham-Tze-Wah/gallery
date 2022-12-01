package com.api.gallery;

import com.api.gallery.model.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //consists of EnableAutoConfiguration, Configuration, ComponentScan
public class GalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);
		//ConfigurableApplicationContext appContext = SpringApplication.run(GalleryApplication.class, args);
		//Art artComponent = appContext.getBean(Art.class);
		//System.out.println(artComponent.display());
	}

}
