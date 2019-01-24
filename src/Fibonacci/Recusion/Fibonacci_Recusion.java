package Fibonacci.Recusion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author: Alex Lopez
 */

public class Fibonacci_Recusion {
 
    public static void main(String[] args) 
    {
        /* Arraylist that will be filled using the recursion function 
         * To generate a fibonacci sequence. 
         */
        ArrayList <Integer> cFibSequence = new ArrayList<>();
   
        // Reference Arraylist: contains wanted fibonacci sequence. 
        ArrayList <Integer> FibSequence = new ArrayList <>();
        Collections.addAll(FibSequence, 1, 2, 2, 6, 16, 50, 154, 480, 1494, 4654,
                           14496, 45154, 140650,438112, 1364678, 4250846, 13240992, 
                           41244466,128472698, 400180576, 1246525494, -412155634, 
                           -790302560, -981147006, 1385534986);
        
//******************************************************************************       
        
        // for loop that calls Fib recursive function and generates a sequence.  
       
        for(int i = 1; i <= FibSequence.size(); i++ ){
            cFibSequence.add(Fib(i));
        }// end for loop
        
        
        /*A check to see if generated sequence matches the wanted fib sequence.
         *if it returns true, then it prints out the sequence using an iterator.
         */
        
        if (cFibSequence.equals(FibSequence)){
            Iterator found = cFibSequence.iterator();
            for ( int i = 0; i < cFibSequence.size()-1; i++){
                 System.out.print(found.next() +",");
            }
            found.forEachRemaining((n) -> System.out.print(n));
        
        }
            
    }// end of main  
    
//******************************************************************************
    
    // Recursive method that generates the fibonacci sequence
    
    public static int Fib (int n){
    // bases cases        
    if (n == 1){
        return 1;
    }// end if
    else if (n == 2 || n == 3){
        return 2;
    }// end else if 
        
    //end of base cases: now recursive calls 
    return 3 * Fib(n-1) + Fib(n-2) + -2 * Fib(n-3);    
    }
} // end of recursive method
