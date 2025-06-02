public class TimeSpan {
    private int hours;
    private int minutes;

    //Constructs a time span with the given interval.
    // pre: hours >= 0 &&  minutes >= 0
    public TimeSpan(int hours, int minutes) {
        this.hours = 0;
        this.minutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }

        this.hours += hours;
        this.minutes += minutes;

        // converts each 60 minutes into one hour
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    public void add(TimeSpan span) {
        add(span.hours, span.minutes);
    }

    public void subtract(int hours, int minutes) {
        this.hours -= hours;
        this.minutes -= minutes;

        // Adjust if minutes are negative
        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }
        // Ensure hours stay positive (if negative hours are not allowed)
        if (this.hours < 0) {
            this.hours = 0;
            this.minutes = 0;
        }
    }

    public void subtract(TimeSpan span) {
        subtract(span.hours, span.minutes);
    }

    public void scale(int factor) {
        long total = this.hours * 60 + this.minutes;
        long minutesScaled = total * factor;
        this.hours = (int) (minutesScaled / 60);
        this.minutes = (int) (minutesScaled % 60);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // returns a String for this time span, such as "6h 15m"
    public String toString() {
        return hours + "h " + minutes + "m";
    }
}
