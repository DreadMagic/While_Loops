package com.company;

public class Main {
    public int multByTwo(int n){
        int count = 0;
        int num = 1;
        while (num<n){ num*=2; count++;}
        return count;
    }
    public void countTo(int n){
        int count = 0;
        while (count<=n){count++;}
        System.out.println(count);
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.multByTwo(64));
        System.out.println(m.multByTwo(8));
    }
}
