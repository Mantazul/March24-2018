package enumExample;

public class Day {
    Week week;
    public Day(Week week){
        this.week = week;
    }

    public void whichDay(){
        switch(week){
            case MONDAY:
                System.out.println("Home Work start");
                break;
            case TUESDAY:
                System.out.println("Read Data structure book");
                break;
            case WEDNESDAY:
                System.out.println("continue codelab");
                break;
            case THURSDAY:
                System.out.println("continue Data structure book reading");
                break;
            case FRIDAY:
                System.out.println("Home work submit");
                break;
            case SATURDAY:
                System.out.println("Weekend class 1");
                break;
            case SUNDAY:
                System.out.println("Weekend class 2");
                break;
            default:
                System.out.println("No more days.. fix your mind");
                break;
        }
    }
}
