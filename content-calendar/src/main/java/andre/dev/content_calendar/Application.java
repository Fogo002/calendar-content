package andre.dev.content_calendar;

import andre.dev.content_calendar.config.ContentCalendarProperties;
import andre.dev.content_calendar.model.Content;
import andre.dev.content_calendar.model.Status;
import andre.dev.content_calendar.model.Type;
import andre.dev.content_calendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
