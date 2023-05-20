package com.example.teluskocompetition.Day1;

public class memoization {
    public static void main(String args[]) {// main function
        int n =50;// size of the pascal's triangle can be changed
        int dp[][] = new int[n+1][n+1]; // array to store for memoization
        printPascal(n,dp);
    }

    private static void printPascal(int n, int[][] dp) { // prints the pascle triangle
        if (n == 0) return; // exit condition
        printPascal(n - 1,dp); // recursive calling
        for (int i = 0; i < n; i++) {
            System.out.print(binomial(n - 1, i,dp) + (n == i + 1 ? "\n" : " ")); // prints the value of the pascal's triangle also takes care of the space and next line using ternary operator
        }
    }

    public static int binomial(int n, int k, int[][] dp) { // calculates and returns the binomial 
        if (k == 0 || n == k) { //exit condition 
            return 1;
        }
        if(dp[n][k]!=0)return dp[n][k];// checks if the binomial have been calculated / stored before if yes then return it without doing further calculation
        return dp[n][k]=binomial(n - 1, k - 1,dp) + binomial(n - 1, k,dp); //returns and store new binomial value for unique n and k value
    }
    
}
