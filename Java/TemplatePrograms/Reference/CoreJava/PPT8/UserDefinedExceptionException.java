

/**


* Author: Vikas
* Program Description: This program is to show how user defined exception is created

*/



class NegativeAgeException extends Exception{
	
		int age;
	
	NegativeAgeException(int age){
		
		this.age=age;
	}

	public String toString(){
		
		return "negative age exception:"+ age;
	}
	
	public static void main(String[] args) throws NegativeAgeException{
	
		int age =-25;
		
		if(age<=0){
			
			throw new NegativeAgeException(age);
		
		}
		
		else{
			
			System.out.println("your age is"+age);
		}
	}
}
