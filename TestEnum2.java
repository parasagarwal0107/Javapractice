package pack;

//enum deceleration outside class.
enum Days {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY,SUNDAY; 
}

public class TestEnum2 {
    Days day;//Taking a variable day using enum Days as datatype
    
    public TestEnum2(Days day) {
        this.day = day;
    }
    /*method for applying switch on enum constants*/
    public void dayslike() {
        switch (day) {
            case MONDAY:
                System.out.println("1");
                break;
            case TUESDAY:
                System.out.println("2");
                break;
            case WEDNESDAY:
                System.out.println("3");
                break;
            case THURSDAY:
                System.out.println("4");
                break;
            case FRIDAY:
                System.out.println("5");
                break;
            case SATURDAY: 
                System.out.println("6");
                break;
            case SUNDAY:
            	System.out.println("7");
            	break;            
            default:
            	System.out.println("Incorrect");
            	break;
        }
    }
    
    public static void main(String[] args) {
    	TestEnum2 d1 = new TestEnum2(Days.MONDAY);
        d1.dayslike();
        System.out.println(Days.values()[0]);//Printing the constant from enum using index value
    }
}
