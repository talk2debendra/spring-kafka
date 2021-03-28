package com.deb.kafka.message.service;


/**
 * 
 * @author debendra.dhinda
 * */

public interface MessageService<T> {
	
	/**
	 * Publish the packets to the supplied Topic of type T.
	 * @param t Specific Type
	 * */
	void publishToKafka(T t);
}
