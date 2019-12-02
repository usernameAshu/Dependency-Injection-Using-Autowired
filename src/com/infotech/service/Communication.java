package com.infotech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infotech.messge.Message;

@Component
public class Communication {

	@Autowired
	private Message message;

	/*
	 * public Communication(Message message) { this.message = message; }
	 */
	
	public void communicate(){
		message.sendMessage();
	}
}
