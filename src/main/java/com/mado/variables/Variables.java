/*
Data types
Boolean - 1 bit - primitive - true or false
byte - 1 byte - primitive - -128 to 127
short - 2 bytes - primitive - -32,768 to 32,767
int - 4 bytes - primitive - -2 billion to 2 billion
long - 8 bytes - primitive - -9 quintillion to 9 quintillion

float - 4 bytes - primitive - fractional number up to 6-7 digits
double - 8 bytes - primitive - fractional number up to 15 digits

char - 2 bytes - primitive - single character/letter/ASCII value
String - varies - reference - a sequence of characters
*/

package com.mado.variables;

public class Variables {

    public static void main(String[] args) {
        int x = 123; //Initialization - //Declaration
        //x = 123; //Assignment
        long y = 12345678910L;
        byte z = 127;
        
        float a = 3.14F;
        double b = 3.14;
        boolean c = false;
        
        char symbol = '@';
        String name = "MagyoDev";
        
        System.out.println("My number is: " + x);
        System.out.println("My number is: " + y);
        System.out.println("My number is: " + z + "\n");
        
        System.out.println("My number is: " + a);
        System.out.println("My number is: " + b);
        System.out.println(c + "\n");
        
        System.out.println(symbol);
        System.out.println("Hello " + name + "\n");
        
        
        String w = "Water";
        String f = "Fire";
        String temp;
        
        temp = w;
        w=f; //Fire
        f=temp; //Water
        
        System.out.println("x: " + w);
        System.out.println("y: " + f);
        
    }
}
