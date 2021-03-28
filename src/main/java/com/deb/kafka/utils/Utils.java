/**
 * 
 */
package com.deb.kafka.utils;

import java.util.UUID;

import lombok.experimental.UtilityClass;

/**
 * @author debendra.dhinda
 */
@UtilityClass
public class Utils {

	public static String generateUniqueId() {
		return UUID.randomUUID().toString();
	}

}