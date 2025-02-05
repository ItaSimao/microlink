package com.ms.email;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumers {

    @RabbitListener(queues = "${broker.queue.email.name}" )
    public void listenEmailQueue(@Payload String string) {
        System.out.println(string);
    }

}
