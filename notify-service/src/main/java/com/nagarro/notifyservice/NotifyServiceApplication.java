package com.nagarro.notifyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.nagarro.notifyservice.entity.Order;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableBinding(Sink.class)
@EnableEurekaClient
public class NotifyServiceApplication {
	
	private Logger logger = LoggerFactory.getLogger(NotifyServiceApplication.class);

    @StreamListener("input")
    public void consumeMessage(Order order) {
        logger.info("Consumed payload : " + order);
    }


	public static void main(String[] args) {
		SpringApplication.run(NotifyServiceApplication.class, args);
	}

}
