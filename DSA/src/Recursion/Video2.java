package Recursion;

public class Video2 {
    public static void main(String[] args) {
//        NtoOne(5);
//        OnetoN(5);
//        System.out.println(factorial(5));
//        System.out.println(sum(5 ));
//        System.out.println(sumOfDigits(12,0));
//        System.out.println(sumOfDigits(122));
//        System.out.println(productOfDigits(234));
//        System.out.println(reverse(1321));
        System.out.println(countZeros(1020,0));
        System.out.println(countZeros2(1020));
    }
    public static void NtoOne(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        NtoOne(n-1);
    }
    public static void OnetoN(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        OnetoN(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static int sumOfDigits(int n , int sum){
        if(n % 10 == n){
            sum+=n;
            return sum;
        }
        sum = sum + n %10;
      return sumOfDigits(n/10, sum);
    }
    public static int sumOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int productOfDigits(int n){
        if(n%10 == n){
            return  n;
        }
        return n%10 * productOfDigits(n/10);
    }

    public static int reverse(int n){
        if(n%10 == n ){
            return n;
        }
        int numOfDigits = (int)Math.log10(n) + 1;
        return (int)(Math.pow(10,numOfDigits-1)*(n%10)) + reverse(n/10);
    }
    public static int countZeros(int n,int zero){
        if(n%10 == 0 ){
            zero+=1;
        }
        if(n % 10 == n){
            return zero;
        }
       return countZeros(n/10,zero);
    }

    public static int countZeros2(int n){
        if(n % 10 == n){
            return n==0 ? 1 : 0;
        }
        else {
            int remainder = n % 10;
            int newNumber = n /10;
            return (remainder==0?1:0) + countZeros2(newNumber);

        }
    }



}
