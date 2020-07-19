package io.springboot.example.springbootcounter.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
	
	@Autowired
	private CounterService counterService ; //= new CounterService();
	//private int i = 0;
	@RequestMapping("/clickcounter")
	public int clickCounter()
	{
		return counterService.incrementCount();
	}

}
