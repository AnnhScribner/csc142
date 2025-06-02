// A Clock object represents an hour:minute time during
// the day or night, such as 10:45 AM or 6:27 PM.
public class Clock {
    private int hour;
    private int minute;
    private String amPm;

    // Constructs a new time for the given hour/minute
    public Clock(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    // returns the field values
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getAmPm() {
        return amPm;
    }

    public void advance(int min) {
        if (min > 0) {

            hour += (minute + min) / 60;
            minute = (minute + min) % 60;

            while (hour > 12) {
                hour -= 12;

                amPm = amPm.equals("AM") ? "PM" : "AM";
            }
        }
    }


    // returns String for time; for example, "6:27 PM"
    public String toString() {
        return String.format("%d:%02d %s", hour, minute, amPm);
    }

    // your method would go here

}