/*
    
    IT IS ONE PLAYER GAME WITH CPU
    YOU HAVE TO ENTER THREE INTEGERS :
    ENTER 0 FOR STONE
    ENTER 1 FOR PAPER
    ENTER 2 FOR SCISSOR
    I MADE THIS GAME IN 2 HOURS........
    THIS CODE IS NOT COPIED FROM ANYWHERE.....
    PLEASE DON'T COPY.
                                 -Awaneesh Srivastava
                                 
                                

*/

import java.util.Random;
import java.util.Scanner;
public class Game
{
    public static void main(String[] args) {
        int upperbound=3, cp=0,pp=0;
        int game[]=new int[5];
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int cpu[]=new int[5];
        
        System.out.println("Enter 0 for Stone\nEnter 1 for paper\nEnter 2 for Scissor");
        for(int i=1; i<4; i++){
        System.out.println("Round :"+i );
        game[i]=sc.nextInt();
        System.out.println("You : "+game[i]);
        cpu[i]=rand.nextInt(upperbound);
        System.out.println("CPU : "+cpu[i]);
        
        
        
        if(game[i]==0 && cpu[i]==1){
            cp++;
            System.out.println("\ncpu won this round.");
        }
        else if(game[i]==0 && cpu[i]==2){
        pp++;
            System.out.println("\nYou won this round.");
        }
        else if(game[i]==1 && cpu[i]==2){
            cp++;
            System.out.println("\ncpu won this round.");
        }
        else if(game[i]==1 && cpu[i]==0){
            pp++;
            System.out.println("\nYou won this round.");
            }
        else if(game[i]==2 && cpu[i]==0){
            cp++;
            System.out.println("\ncpu won this round.");
        }
        else if(game[i]==2 && cpu[i]==1){
            pp++;
            System.out.println("\nYou won this round.");
        }
        else if(game[i]==cpu[i]){
            System.out.println("\nTie in this round.");
        }
        else{
            System.out.println("\nWrong input.");
        }
        }
        if(cp<pp){
            System.out.println("\nYou are winner of the game..!!!!!!");
        }
        else if(cp==pp){
            System.out.println("\nThe game is tie....!!!");
        }
        else{
            System.out.println("\nCPU won this game...!!\nBad luck..!!");
        }
        
        
    }
}