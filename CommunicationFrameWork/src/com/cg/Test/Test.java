package com.cg.Test;

import com.cg.factory.Messagefactory;
import com.cg.renderer.MessageRenderer;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

   MessageRenderer render =  Messagefactory.getMessageRenderer();

          render.render();
	}

}
