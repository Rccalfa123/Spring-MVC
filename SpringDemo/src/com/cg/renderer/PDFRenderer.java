package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class PDFRenderer implements MessageRenderer {

	private MessageProvider provider;
	
	@Override
	public void render() {
	   System.out.println(provider.getMessage() + " On PDF :-( ");
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.provider = messageProvider;
		
	}

}
