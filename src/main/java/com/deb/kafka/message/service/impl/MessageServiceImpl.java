package com.deb.kafka.message.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.deb.kafka.dto.MessageDTO;
import com.deb.kafka.message.service.MessageService;
import com.deb.kafka.producer.KafkaPublisher;

import lombok.extern.log4j.Log4j2;

/**
 * 
 * @author debendra.dhinda
 * */


@Log4j2
@Service
public class MessageServiceImpl implements MessageService<MessageDTO> {

	@Autowired
	private KafkaPublisher kafkaPublisher;

	@Value("${kafka.publish.topic.message}")
	private String kafkaPublishTopicName;

	
	@Override
	public void publishToKafka(MessageDTO messageDTO) {
		log.info("Publishing message to kafka topic " + kafkaPublishTopicName );

		kafkaPublisher.publish(kafkaPublishTopicName, MessageDTO.class.getName(), messageDTO);

	}

}
