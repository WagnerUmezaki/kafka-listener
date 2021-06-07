package kafka.listener.kafka;

import kafka.listener.stream.sink.EventSink;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
@AllArgsConstructor
public class EventListener {
    @StreamListener(EventSink.INPUT)
    public void processEvent(final Map<String,Object> event) {
        log.info("M=processEvent, event={}", event);
    }
}
