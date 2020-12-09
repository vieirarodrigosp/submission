package br.com.vieirarodrigo.submission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SubmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubmissionApplication.class, args);
	}

}
