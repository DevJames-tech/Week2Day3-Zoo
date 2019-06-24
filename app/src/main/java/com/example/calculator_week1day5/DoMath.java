package com.example.calculator_week1day5;
import java.lang.Math;
import org.mariuszgromada.math.mxparser.Expression;
import java.util.regex.*;
import java.lang.*;
public class DoMath {

public String calculateResult(String calculateResult)
{
    //char ArrayFindResult;

    Expression e = new Expression(calculateResult);
   String calculation = Double.toString( e.calculate());

    //String calculatedResult = "";

       /// if(calculateResult.contains("((")){  //contains these characters

           // calculatedResult = calculateResult.replaceAll("", "(");

        //string split char

  //  }
    //String var = "((((++1.0++++2.0 * sin(28.0)";



    return calculation;
}

    public static void main(String[] args) {
        DoMath myMath = new DoMath();
    String passMe= "((++((1+2*34)()";

       // System.out.println(myMath.noDoubles(passMe));

       // System.out.println(myMath.calculateResult(passMe));

    //System.out.println( e.calculate());
    }
/*
    public String noDoubles(String StrToCheck){

    char nextChar;
    String finalString ="";

        for (int iIndex = 1; iIndex <= StrToCheck.length()-1 ; iIndex++) {

            //nextChar = StrToCheck.charAt(iIndex);

            if(!Character.isLetterOrDigit(StrToCheck.charAt(iIndex))) {

                    finalString = StrToCheck.replace(StrToCheck.charAt(iIndex), 'Q'); //replace character with a space
                    ///System.out.println("yes");
                }
            }

        return finalString;
        }
*/
    }


