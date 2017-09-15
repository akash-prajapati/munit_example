package org.fusesource.camel.processor;

import org.apache.camel.Processor;
import org.fusesource.camel.model.Order;
import org.apache.camel.Exchange;

public class OrderProcessor  implements Processor  {

	public void process(Exchange exchange) throws Exception {  
		
			String name = ( String ) exchange.getIn().getHeader("name");
			String amount = ( String )  exchange.getIn().getHeader("amount");
			
			System.out.println("[------name=" + name + "-------]");
			System.out.println("[-----amount=" + amount + "-----]");
			
			Order order = new Order ();
			order.setName(name);
			order.setAmount(Integer.parseInt(amount));
			
			exchange.getIn().setBody( order );  
	}  
	
}
