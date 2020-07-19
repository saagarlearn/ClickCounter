package io.springboot.example.springbootcounter.counter;

import org.springframework.stereotype.Service;


@Service
public class CounterService {
	
	private int i;
	
	public CounterService() {
		i = 0;
	}
	public int incrementCount()
	{
		return i++;
	}

}
