package pack;
import java.util.Scanner;

public class WeekDays1 {
	   /*day method for calling the method*/
	    public void day(int daynumber){
	        switch(daynumber){
	            case 1: monday();//1t will call monday method which will print Monday
	            break;
	            case 2: tuesday();//1t will call tuesday method which will print Tuesday
	            break;
	            case 3: wednesday();//1t will call wednesday method which will print Wednesday
	            break;
	            case 4: thursday();//1t will call thursday method which will print Thursday
	            break;
	            case 5: friday();//1t will call Friday method which will print Friday
	            break;
	            case 6: saturday();//1t will call saturday method which will print Saturday
	            break;
	            case 7: sunday();//1t will call sunday method which will print Sunday
	            break;
	            default: System.out.println("Incorrect Input");//Print Incorrect input if given
	        }
	    }
	    /*
	     * Methods For printing the week days
	     */
	    public void monday(){
	        System.out.println("Monday");
	    }

	    public void tuesday(){
	        System.out.println("Tuesday");
	    }

	    public void wednesday(){
	        System.out.println("Wednesday");
	    }

	    public void thursday(){
	        System.out.println("Thursday");
	    }

	    public void friday(){
	        System.out.println("Friday");
	    }

	    public void saturday(){
	        System.out.println("Saturday");
	    }

	    public void sunday(){
	        System.out.println("Sunday");
	    }

	    public static void main(String[] args){
	    	/*Let us take a integer variable for week days*/
	    	int daynumber;  
	    	/*Now take the value of daynumber from the user*/
	    	Scanner scan=new Scanner(System.in);
	 	    System.out.println("Enter any week day number (1-7) Starting from Monday:");
	        daynumber=scan.nextInt();
	    	WeekDays1 week=new WeekDays1();//Object Creation
	        week.day(daynumber);//invoke the method having switch statement with passing daynumber
	    }
	} 

