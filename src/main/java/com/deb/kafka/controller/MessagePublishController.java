package com.deb.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deb.kafka.consumer.MessageConsumer;
import com.deb.kafka.dto.MessageDTO;
import com.deb.kafka.message.service.MessageService;

@RestController
public class MessagePublishController {

	@Autowired
	private MessageService messageService;
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("Working", HttpStatus.OK);
	}
	
	
	@PostMapping("/message/publish")
	public ResponseEntity publishMessage(@RequestBody MessageDTO messageDTO){
		try {
			messageService.publishToKafka(messageDTO);
			return new ResponseEntity("Published",HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
