package hackerrank;

import java.util.Scanner;

/**
 Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
 
 We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .
 
 Your task is to find their comparison scores by comparing  with ,  with , and  with .
 
 If , then Alice is awarded  point.
 If , then Bob is awarded  point.
 If , then neither person receives a point.
 Given  and , can you compare the two challenges and print their respective comparison points?
 
 Input Format
 
 The first line contains  space-separated integers, , , and , describing the respective values in triplet .
 The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 
 Constraints
 
 Output Format
 
 Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.
 
 Sample Input
 
 5 6 7
 3 6 10
 Sample Output
 
 1 1
 ----------------------------------------------
 https://www.hackerrank.com/challenges/compare-the-triplets?h_r=next-challenge&h_v=zen
 */
public class CompareTheTriplets {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int[] aNumbers = new int[]{a0, a1, a2};
        int[] bNumbers = new int[]{b0, b1, b2};
        
        int aliceScore = 0;
        int bobScore = 0;
    
        for (int i = 0; i < aNumbers.length; i++) {
            if (aNumbers[i] > bNumbers[i]) {
                aliceScore++;
            } else if (aNumbers[i] < bNumbers[i]) {
                bobScore++;
            }
        }
        
        System.out.print(aliceScore + " " + bobScore);
    }
    
}
