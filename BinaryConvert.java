import java.util.Scanner;  // Import the Scanner class


public class BinaryConvert {
	
	public static void main(String[] args){
		
		String answer = null; //this will store the answer
		Scanner S = new Scanner(System.in);
		Scanner R = new Scanner(System.in);
		
		do{ 
			System.out.println("Enter Number to be converted to binary");
		 
			int Number = S.nextInt();  // Read user input
	       
			System.out.println(Number + "===> " + toBinary(Number));
		   
			System.out.println("Do you want to continue?"); //asks them if they want to continue
		   
			answer = R.nextLine(); //input will reference your scanner variable and puts answer into the variable we made
			
		} while(answer.equals("yes"));
	
	}
		
	public static String toBinary(int base10Num){
		
        boolean isNeg = base10Num < 0;
        base10Num = Math.abs(base10Num);        
        String result = "";
        
        while(base10Num > 1){
            result = (base10Num % 2) + result;
            base10Num /= 2;
        }
        //assert base10Num == 0 || base10Num == 1 : "value is not <= 1: " + base10Num;
        
        result = base10Num + result;
        
        if( isNeg )
            result = "-" + result;
        return result;
    }
        
}
    
