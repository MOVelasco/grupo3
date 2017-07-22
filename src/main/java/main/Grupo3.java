package main;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class Grupo3 {

	public static void main(String[] args) {
		SpringApplication.run(Grupo3.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver(){
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
}
