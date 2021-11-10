package com.company;

public class While_Loop_Classwork {
    public int addOdds(int n){
        int num = 1;
        int sum = 0;
        while (num<=n){
            sum+=num;
            num+=2;
        }
        return sum;
    }
    public int sumDigits(int n){
        int sum = 0;
        int digit;
        while (n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public int howManyYears(double startpop, double endpop){
        int year = 0;
        while (startpop < endpop){
            startpop*=1.0113;
            year++;
        }
        return year;
    }
    public void printSum(int n){
        int count = 1;
        int sum = 0;

        while (count<=n){
            sum+=count;
            if (count == n) System.out.print(count + " = ");
            else System.out.print(count + " + ");
            count ++;
        }
        System.out.println(sum);
    }
    public boolean isPerfectSquare(int n){
        int sum = 0;
        int count = 1;
        while (sum < n){
            sum+=count;
            count+=2;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        While_Loop_Classwork w =new While_Loop_Classwork();
        System.out.println(w.addOdds(11));
        System.out.println(w.addOdds(34));
        System.out.println(w.addOdds(5));
        //36
        //289
        //9
        System.out.println(w.sumDigits(1244));
        System.out.println(w.sumDigits(17684));
        System.out.println(w.sumDigits(923413));
        //11
        //26
        //22
        System.out.println(w.howManyYears(111.2,150));
        System.out.println(w.howManyYears(111.2,120));
        //27
        //7
        w.printSum(6);
        w.printSum(8);
        //1 + 2 + 3 + 4 + 5 + 6 = 21
        //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
        System.out.println(w.isPerfectSquare(144));
        System.out.println(w.isPerfectSquare(w.addOdds(16)));
        System.out.println(w.isPerfectSquare(21));
        System.out.println( w.isPerfectSquare(6));
        //true
        //true
        //false
        //false
    }
}
