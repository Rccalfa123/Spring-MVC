package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleRenderer implements MessageRenderer {

	private MessageProvider provider;
	
	@Override
	public void render() {
		System.out.println(provider.getMessage()+" On Console");
		
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		
		this.provider = messageProvider;
	}

}
