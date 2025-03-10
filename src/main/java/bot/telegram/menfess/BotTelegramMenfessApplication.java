package bot.telegram.menfess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BotTelegramMenfessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BotTelegramMenfessApplication.class, args);
	}

}
