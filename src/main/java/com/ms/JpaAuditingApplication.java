package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.ms.config.AuditConfig;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "awareRef")
public class JpaAuditingApplication {


	@Bean
	public AuditorAware<Integer> awareRef() {
		return new AuditConfig();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JpaAuditingApplication.class, args);
	}

}
