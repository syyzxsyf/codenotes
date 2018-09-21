package cn.codenotes.springboot.cmdline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCmdLineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCmdLineApplication.class, args);
	}

	// Spring环境初始化后，调用此方法
	@Override
	public void run(String... args) throws Exception {
		for (String argValue : args) {	// 遍历参数列表中的值
			System.out.println("参数值为：" + argValue);
		}
	}
}
