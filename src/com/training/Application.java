package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter obj = new Converter();
		double cel = obj.farenToCelsius(32.00);
		System.out.println("Celsius value of 45F " + cel);
		
		Double faren = null;
		double cel2=0.0;
		try{
		cel2 = obj.farenToCelsius(faren);
		}catch(NullPointerException e){
			System.out.println("Faren is NULL -check");
			System.out.println(e.getMessage());
		}
		System.out.println("Celsius value of 45F := " + cel);
	}

}
