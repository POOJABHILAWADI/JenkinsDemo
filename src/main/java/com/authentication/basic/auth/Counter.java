package com.authentication.basic.auth;

import java.io.IOException;

public class Counter {
	
	int count;
	
	public synchronized int increament()
	{
		return count++;
	}

}
