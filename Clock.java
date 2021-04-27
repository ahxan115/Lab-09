
package question1;


public class Clock {
    //declaring hours, minutes and seconds variables
    String hours, minutes, seconds;
    //constructor to initialize the variables
    public Clock(String hours, String minutes, String seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    //display method to display the time in 24 hour Format
    public void display(){
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }
}
