package RCDEV.sring_boot_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;


@SpringBootApplication
@EnableAdminServer
public class SringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SringBootAdminApplication.class, args);
	}

}
