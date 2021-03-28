/**
 * 
 */
package com.deb.kafka.consumer;

import java.util.Objects;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.context.annotation.Lazy;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.deb.kafka.dto.MessageDTO;

import lombok.extern.log4j.Log4j2;

/**
 *
 **/
@Log4j2
@Service
@Lazy(false)
public class MessageConsumer<T> extends KafkaBaseConsumer<T> {

	@KafkaListener(topics = { "${kafka.topic.message}" }, idIsGroup = false, 
			id = "notification-consumer")
	public void receive(ConsumerRecords<String, String> records) {

		if (records != null && !records.isEmpty()) {

			log.debug("NotificationConsumer:: Received " + records.count() + " record(s) to process");

			try {

				for (ConsumerRecord<String, String> record : records) {

					T data = getDto(record);

					if (Objects.nonNull(data)) {

						// TODO Your Actual business logic start here
						//for PDF
						if(data instanceof MessageDTO) {
							log.info("T is MessageDTO: " + (data instanceof MessageDTO));							
							log.info(data);							
						}
					} else {
						log.warn("NotificationConsumer:: DTO is null after parsing Kafka record");
					}
				}
			} catch (Exception e) {
				log.error("NotificationConsumer:: Error while Processing Kafka Dto : ", e);
			}

		}

	}
}