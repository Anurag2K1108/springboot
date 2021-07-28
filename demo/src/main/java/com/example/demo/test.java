package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
public static void main(String[] args) {
    String pattern = "dd-MMM-yyyy";
	String dateInString =new SimpleDateFormat(pattern).format(new Date()); 
	   System.out.println(dateInString);  
}
}
