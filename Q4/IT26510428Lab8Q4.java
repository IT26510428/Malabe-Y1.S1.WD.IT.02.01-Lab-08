import java.util.Scanner;
public class IT26510428Lab8Q4{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int studentsArray[]=new int[8];
		int studentCount=0;
		int studentNum=0;
		//Input 8 numbers
		while(studentCount<studentsArray.length){
			System.out.print("Enter Student ID for Student "+(studentCount+1)+" :");
			studentNum=input.nextInt();
			if(studentNum>0){
				studentsArray[studentCount]=studentNum;
				studentCount++;
			}
			else{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}
		}
		//Searching student ID
		System.out.print("\nEnter a student ID to search: ");
		int searchID=input.nextInt();
		int count=0;
		for(int i=0;i<studentsArray.length;i++){
			if(studentsArray[i]==searchID){
			count=1;
			break;
			}
		}
		if(count==1){
			System.out.println("Student is Available");
		}
		else{
			System.out.println("Student is Not Available");
		}
	}
}
		
		
		