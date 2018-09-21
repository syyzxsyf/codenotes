package cn.codenotes.springboot.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootApplication
public class SpringBootThymeleafApplication implements CommandLineRunner {
	@Autowired
	private TemplateEngine templateEngine;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Context context = new Context();
		context.setVariable("greeting", "World");
		
		String renderedText = templateEngine.process("template", context);
		System.out.println(renderedText);
	}
}
