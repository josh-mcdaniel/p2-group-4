package com.revature;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;



public class HTMLUnitTesting {
	
	@Test
	public void test() throws Exception{
    try (final WebClient webClient = new WebClient()) {
        
    	webClient.getOptions().setCssEnabled(false);
    	webClient.getOptions().setJavaScriptEnabled(true);
    	//webClient.getOptions().
    	webClient.getOptions().setThrowExceptionOnScriptError(false);
    	final HtmlPage page = webClient.getPage("https://word.tips/unscramble/asdfeiopmn/");

    	//System.out.println(page.asXml());
        List<DomText> items = page.getByXPath("//span/text()");
        
        List<String> answers = new ArrayList<>();
        
        for (DomText domText : items) {
        	String text = domText.toString();
        	
        	if(text != null && text.length() > 0) {
        		System.out.println(text);
        	}
        	
        }
    	

    }
	}
	

}

