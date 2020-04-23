public class FizzBuzz {
    public static void main(String[] args) {
        /*
            Iterate from 1-100 using for loop
            check if a number is divisible 3 and 5 if true display “FizzBuzz”.
            else if a number is  divisible 3 if true display “Fizz”
            else if a number is  divisible 3 if true display “Buzz”
            else display the number.
         */

        for (int i = 1; i <= 100 ; i++)
        {
            if((i % 3 == 0) && (i % 5 ==0)){ // check if a number is multiple of both 3 and 5
                System.out.println("FizzBuzz");
            }
            else if(i % 3 ==0){ // check if a number is multiple of  3
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){ // check if a number is multiple of  5
                System.out.println("Buzz");
            }
            else{
                System.out.println(i); // these numbers are not multiple of both 3 and 5.
            }

        }
    }
}
