
package main;
import java.util.*;

public class Main {
    
    //overriding countTokens of StringTokenizer class
    public static int countTokens(StringTokenizer s){
        int count=s.countTokens(), finalCount=0;
        String temp;
        boolean flag;
        double dValue;
        //iterating through each token in the string
        for(int i=0;i<count;i++){
            flag=true;
            temp=s.nextToken();
            //checking if current token is a numeric value
            try{
                dValue = Double.parseDouble(temp);
            }
            catch(NumberFormatException e){
                flag=false;
            }
            //counting the token only if it is not a numeric value
            if(!flag)
                finalCount++;
        }
        return finalCount;
    }

    
    public static void main(String[] args) {
        //creating 2 StringTokenizers, one with numeric value and the other without
        StringTokenizer s1 = new StringTokenizer("There are 2 students in this class");
        StringTokenizer s2 = new StringTokenizer("There are two students in this class");
                // Counting the tokens of s1 and printing result
        int count = countTokens(s1);
        System.out.println("Total number of Tokens in string 1: "+ count);
        // Counting the tokens of s2 and printing result
        count = countTokens(s2);
        System.out.println("Total number of Tokens in string 2: "+ count);
        }
    }
    

