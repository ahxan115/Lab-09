/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

//ChildClock class that is the child class of Clock class
class ChildClock extends Clock{
    //ChildClock constructor that calls the Clock class constructor
    public ChildClock(String hours, String minutes, String seconds){
        super(hours, minutes, seconds);
    }
    //Overriding the display method of Clock class
    @Override
    public void display(){
        //displaying 24 hour format by calling super class display method
        System.out.println("24 Hour Format:");
        super.display();
        System.out.println("12 Hour Format:");
        //converting 24 hour format to 12 hour format and printing it
        int hour1 = (int)hours.charAt(0) - '0';
        int hour2 = (int)hours.charAt(1)- '0';
        int tothour = hour1 * 10 + hour2;
        String m;
        if(tothour < 12)
            m="AM";
        else
            m="PM";
        tothour %= 12;
        if (tothour == 0) {
            System.out.print("12");
            System.out.print(":"+minutes+":"+seconds);
        }
        else{
            System.out.print(tothour);
            System.out.print(":"+minutes+":"+seconds);
        }
        System.out.println(" "+m);
    }
    

    
}