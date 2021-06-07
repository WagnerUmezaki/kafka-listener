package kafka.listener.stream.sink;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface EventSink {

    String INPUT = "event-input";

    @Input(EventSink.INPUT)
    SubscribableChannel inputChannel();
}
