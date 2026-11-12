import java.util.Scanner;
public class IT26510428Lab8Q3{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int numberArray[]=new int[6];
		int numberCount=0;
		int userInput=0;
		while(numberCount<6){
			System.out.print("Enter a Positive number: ("+(numberCount+1)+"/6): ");
			userInput=input.nextInt();
		
		if(userInput>0){
			numberArray[numberCount]=userInput;
			numberCount++;
		}
		else{
			System.out.println("Error: Please Enter ONLY a Positive Numbers");
		}
		}
		int maxNumber=numberArray[0];
		for(int count=0;count<numberArray.length;count++){
			if(numberArray[count]>maxNumber){
				maxNumber=numberArray[count];
			}
		}
		System.out.println("\nArray Contents: ");
		for(int count=0;count<numberArray.length;count++){
			System.out.print(numberArray[count]+" ");
		}
		System.out.println("\nThe Maximum Number Entered: "+maxNumber);
	}
}
			
		