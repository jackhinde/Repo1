package Searching;

public class StringReview {

    public static void main(String[] args) {
        String x = "The quick brown fox";
        //          0123456789111111111
        //                    012345678
        //index of - finds location of something, returns an int
        int loc = x.indexOf("q");
        System.out.println("q is at " + loc);
        loc = x.indexOf("o",13);
        System.out.println("After the 13th space, o is at " + loc);
        loc = x.indexOf("q",13);
        System.out.println("After the 13th space, q is at " + loc); //-1 = not found
        
        //charAt - returns a char at a goven location
        char c = x.charAt(13);
        System.out.println("The character at 13 is " + c);
        
        //length
        int len = x.length();
        System.out.println(x + " is " + len + " charcters long");
        
        //substring - returns a string that is part of the original string
        String y = x.substring(10,13); //13 is not included
        System.out.println(y);
        y = x.substring(16);
        System.out.println(y);
        
        System.out.println(x.toUpperCase()); // calling as you print the string
        x = x.toLowerCase();
        
        //compareTo -> 
        y = "jumped over the lazy dog";
        int z = x.compareTo(y);
        System.out.println("x compared to y" + z);
        z = y.compareTo(x);
        System.out.println("y compared to x" + z);
        //"t"he vs "j"umped  = 10 letters away
        //positive means first thing is further down the alphabet
        System.out.println("Bob vs Andy: " + "Bob".compareTo("Andy")); //1
        System.out.println("Bob vs Bob: " + "Bob".compareTo("Bob")); //0
        System.out.println("Tim vs Tom: " + "Tim".compareTo("Tom")); // T is tied, becomes i vs o = -6
        System.out.println("Bob vs bob: " + "Bob".compareTo("bob")); //-32
        //moral of the story -> 0 means you have a match
    }
    
}
