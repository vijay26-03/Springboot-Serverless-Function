package com.example.serverlessfunction.function;

import com.example.serverlessfunction.model.Subscriber;
import com.example.serverlessfunction.service.SubscriberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class SubscriberFunction {
    private static final Logger LOG = LoggerFactory.getLogger(Subscriber.class);
    private final SubscriberService subscriberService;

    public SubscriberFunction(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @Bean
    public Supplier<List<Subscriber>> findAll(){
        LOG.info("Subscribers.findAll() was called");
        return () -> subscriberService.findAll();
    }

    @Bean
    public Consumer<String> create(){
        LOG.info("Subscribers.create() was called");
        return (email) -> subscriberService.create(email);
    }
}
