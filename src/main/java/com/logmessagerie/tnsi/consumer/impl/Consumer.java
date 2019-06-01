package com.logmessagerie.tnsi.consumer.impl;

import com.logmessagerie.tnsi.consumer.IConsumer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements IConsumer {



    @Override
    @RabbitListener(queues ="${tnsi.rabbitmq.queue}" )
    public void consumeMesssage(String message) {
        System.out.println("message recu "+ message);
    }
}
