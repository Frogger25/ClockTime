
/**
* Name: Gavin Hanzel (hanzel)
* Course: CSCI 241 - Computer Science I
* Section: 001 <-- choose your section
* Assignment: 9
*
* Project/Class Description:
* Holds properties of a clock object that will store data relating to time
*
* Known bugs:
* none
*/
public class ClockTime
{
    //instance variables for hours, minutes, and seconds
    private int hour;
    private int minute;
    private int second;
    
    //default constructor that sets instance variables to 0
    public ClockTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    //constructor that takes parameters and sets them to hours/minutes/seconds
    public ClockTime(int hours, int minutes, int seconds){
        //checks if negative and assigns a 0 to value if it is
        if(seconds < 0)
            seconds = 0;
        if(minutes < 0)
            minutes = 0;
        if(hours < 0)
            hours = 0;
        //if seconds are greater than 60, it adds the value to minutes
        minutes += seconds / 60;
        seconds = seconds % 60;
        //if minutes are greater than 60, it adds the value to hours
        hours += minutes / 60;
        minutes = minutes % 60;
        //if hours are over 24, it makes it 23 or less
        hours = hours % 24;
        //sets instance variables to parameter values
        hour = hours;
        minute = minutes;
        second = seconds;
    }
    
    //return hour value
    public int getHour(){
        return hour;
    }
    
    //return minute value
    public int getMinute(){
        return minute;
    }
    
    //return second value
    public int getSecond(){
        return second;
    }
    
    //update hour amount
    public void setHour(int hours){
        if(hours < 0)
            hours = 0;
        hours = hours % 24;
        hour = hours;
    }
    
    //update minute amount
    public void setMinute(int minutes){
        if(minutes < 0)
            minutes = 0;
        minutes = minutes % 60;
        minute = minutes;
    }
    
    //update second amount
    public void setSecond(int seconds){
        if(seconds < 0)
            seconds = 0;
        seconds = seconds % 60;
        second = seconds;
    }
    
    //returns the clock's time value as a string in 24-hour time
    public String toString(){
        String leadHour = "";
        String leadMinute = "";
        String leadSecond = "";
        //checks if a leading 0 is required for the output
        if(hour < 10)
            leadHour = "0";
        if(minute < 10)
            leadMinute = "0";
        if(second < 10)
            leadSecond = "0";
        String result = leadHour + hour + ":" + leadMinute + minute + ":" + leadSecond + second;
        return result;
    }
    
    //returns the clock's time value as a string in 12-hour time
    public String toString12(){
        String time;
        //checks if it's currently AM or PM
        if(hour / 12 == 0)
            time = "A.M.";
        else
            time = "P.M.";
        //sets hour to be in 12-hour format
        int displayHour = hour % 12;
        String leadHour = "";
        String leadMinute = "";
        String leadSecond = "";
        //checks if a leading 0 is required for the output
        if(displayHour < 10)
            leadHour = "0";
        if(minute < 10)
            leadMinute = "0";
        if(second < 10)
            leadSecond = "0";
        String result = leadHour + displayHour + ":" + leadMinute + minute + ":" + leadSecond + 
            second + " " + time;
        return result;
    }
    
    //intakes an int time that represents seconds and advances the time by that much
    public void advance(int seconds){
        second += seconds;
        //if seconds are over 60, it will add to minutes and reset seconds to be under 60
        minute += second / 60;
        second = second % 60;
        //if minutes are over 60, it adds to hours and reduces hours below 60
        hour += minute / 60;
        minute = minute % 60;
        //if hours are over 24, it will set it to it's remainder
        hour = hour % 24;
    }
    
    //checks if a clock's time is equal to another clock's time
    public boolean equals(ClockTime clock){
        boolean hourCheck = (hour == clock.getHour());
        boolean minuteCheck = (minute == clock.getMinute());
        boolean secondCheck = (second == clock.getSecond());
        return (hourCheck && minuteCheck && secondCheck);
    }
}
