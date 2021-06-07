package kafka.listener.config;

import kafka.listener.stream.sink.EventSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(EventSink.class)
public class StreamingConfig {
}