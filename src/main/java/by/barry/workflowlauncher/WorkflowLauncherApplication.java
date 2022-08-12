package by.barry.workflowlauncher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WorkflowLauncherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowLauncherApplication.class, args);
	}

}
