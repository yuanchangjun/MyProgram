package com.bodejidi.miniature.spice;

public class FizzBuzz{
	public String say(Integer num){
		return String.valueOf(num);
	}
	public static void main(String[] args){
		Boolean testResult = true;

		FizzBuzz fizzBuzz = new FizzBuzz();	

		String actualResult = fizzBuzz.say(1);
		if(false == "1".equals(actualResult)){
			testResult = false;
			System.out.println("EXcepted '1',but '"+actualResult+"'");
		}

	        actualResult = fizzBuzz.say(2);
		if(false == "2".equals(actualResult)){
			testResult = false;
			System.out.println("Exceped '2',but '"+actualResult+"'");
		}

		if(testResult){
			System.out.println("test success");
		}else{
			System.out.println("test fail");
		}
        }
}
  
