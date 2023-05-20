package com.example.teluskocompetition.Day1;

public class Iterative {
    public static void main (String args[]){// main function 
        int n = 50;// size of the pascal's triangle can be changed
        iterativePrint(n);
    }
    public static void iterativePrint(int n) {// prints the pascal triangle iteratively
            for (int j = 0; j < (n + 1); j++) { // iterative 
                for (int i = 0; i < (j); i++) {
                    System.out.print(binomial(j - 1, i) + (j == i + 1 ? "\n" : " "));// prints the value of the pascal's triangle also takes care of the space and next line using ternary operator
                }
            }
        }

    public static int binomial(int n, int k) {// calculates and returns the binomial
        if (k == 0 || n == k) { // exit condition
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);// returns new binomial value for n and k value
        }
}
