package com.authentication.basic.auth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import javax.xml.stream.events.Characters;

import org.apache.logging.log4j.util.SortedArrayStringMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.util.ArrayUtils;

@SpringBootApplication
public class Application{
	
	private static int reverseNum(int n) {
		
		int rev=0;
		while(n>0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		return rev;
	}

	
	public static void main(String[] args)
	{    
		int n=51223;
		System.out.println(reverseNum(n));
		System.out.println("This is me pooja");
	}

}