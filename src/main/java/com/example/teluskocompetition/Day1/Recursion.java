package com.example.teluskocompetition.Day1;

public class Recursion {
    public static void main(String args[]) { //main function
        int n = 50;// size of the pascal's triangle
        printPascal(n);
    }

    private static void printPascal(int n) {// prints the pascle triangle
        if (n == 0)return;// exit condition
        printPascal(n - 1);// recursive calling
        for (int i = 0; i < n; i++) {
            System.out.print(binomial(n - 1, i) + (n == i + 1 ? "\n" : " ")); // prints the value of the pascal's triangle also takes care of the space and next line using ternary operator
        }
    }

    public static int binomial(int n, int k) {// calculates and returns the binomial
        if (k == 0 || n == k) { // exit condition
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);//returns new binomial value for n and k value
    }
}
