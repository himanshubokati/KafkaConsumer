package com.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerDemo {
	
	@KafkaListener(topics = "kafkaTopic",groupId = "groupId")
	void listener(String data) {
		
		System.out.println("Consumed :: "+data);
	}

}
