package HW15;

public class DayAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Be productive at work: set goals, plan your day, and take breaks.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday! Time to think about the weekend.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! We recommend visiting a park, cinema or spending time with your family.");
                break;
            default:
                throw new IllegalArgumentException("Unknown day: " + day);
        }
    }
}