/**
 * - Prime number can be divided by itself and 1
 * - All primes are odd numbers except number "2"
 * 
 * - If we can find a number that divided "n" without leaving reminder then it means its not prime.
 * 
 * - Give n=50 we ideally need to check all the factorials of 50 = 25,2,10,5,1 
 * 
 * If number we are trying to test is too big then we will be spending time figuring out factors.
 * 
 * Easy way is to understand that one of the factor of 50 has to be smaller than squareRoot of 50
 * If you see above example 25*2 and 2 is smaller than squareRoot of 50.
 * so we can just divide 50 by every number between 2 and squareRoot of 50 and if any of these numbers divide it leaving no reminder then its not prime 
 * 
 */

public class PrimeNumber{

    public static void main(String[] args){
        System.out.println(isPrime(1117));
        System.out.println(isPrime(1007));
    }

    private static boolean isPrime(int i) {
        if(i%2 == 0) return false;
        for(int j=2; j< Math.sqrt(i); j++){
            if(i%j == 0) { 
                System.out.println("found factorial for " +i +" : " + j);
                return false;}
        }
                        System.out.println(i +" is prime");

        return true;
    }
}