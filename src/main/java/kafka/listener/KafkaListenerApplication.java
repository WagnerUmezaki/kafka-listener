package kafka.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaListenerApplication {
    public static void main(final String[] args) {
        SpringApplication.run(KafkaListenerApplication.class, args);
    }
}
