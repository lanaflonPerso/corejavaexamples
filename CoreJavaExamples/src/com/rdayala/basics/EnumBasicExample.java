package com.rdayala.basics;

public class EnumBasicExample {
	
	Day day;
	
	// An enum type is a special data type that enables 
	// for a variable to be a set of predefined constants. 
	
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
	EnumBasicExample(Day day) {
		this.day = day;
	}
	
	public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: 
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
	}

	public static void main(String[] args) {
		EnumBasicExample firstDay = new EnumBasicExample(Day.MONDAY);
        firstDay.tellItLikeItIs();
        
        EnumBasicExample thirdDay = new EnumBasicExample(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        
        EnumBasicExample fifthDay = new EnumBasicExample(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        
        EnumBasicExample sixthDay = new EnumBasicExample(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        
        Day today = Day.SUNDAY;
        EnumBasicExample seventhDay = new EnumBasicExample(today);
        seventhDay.tellItLikeItIs();

	}

}
