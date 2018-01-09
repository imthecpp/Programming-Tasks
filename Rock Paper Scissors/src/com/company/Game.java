package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dawid Kowalski on 10.11.2017.
 */
public class Game {

    Draw draw;
    Player player1;
    Player player2;
    boolean tieResult;
    int userChoice = 0;
    String gameContinue;
    int p1points, p2points = 0;


       public void startGame(){

           Scanner in = new Scanner(System.in);
           draw = new Draw();
           player1 = new Player();
           player2 = new Player();

           System.out.println("What is you choice?");

           do{
               tieResult = false;
               System.out.println("1.rock"+" "+"2.paper"+" "+"3.scissors");
               try {
                   userChoice = in.nextInt();
               }catch (InputMismatchException e) {
                   System.out.print("błąd");
               }


               switch (userChoice){
                   case 1: player1.movesList(0); break;
                   case 2: player1.movesList(1); break;
                   case 3: player1.movesList(2); break;
                   default: System.out.print("Wrong choice! ;(");
               }

               player2.movesList(draw.getRandom());

               System.out.println(player1.getChoice());
               System.out.println(player2.getChoice());

               if(player1.getChoice().equals("paper") && player2.getChoice().equals("rock")){
                   System.out.println("Player one won!");
                   p1points++;
               }else if(player1.getChoice().equals("paper") && player2.getChoice().equals("scissors")){
                   System.out.println("Player two won!");
                   p2points++;
               }else if(player1.getChoice().equals("rock") && player2.getChoice().equals("paper")){
                   System.out.println("Player two won!");
                   p2points++;
               }else if(player1.getChoice().equals("rock") && player2.getChoice().equals("scissors")){
                   System.out.println("Player one won!");
                   p1points++;
               }else if(player1.getChoice().equals("scissors") && player2.getChoice().equals("paper")){
                   System.out.println("Player one won!");
                   p1points++;
               }else if(player1.getChoice().equals("scissors") && player2.getChoice().equals("rock")){
                   System.out.println("Player two won!");
                   p2points++;
               }else if(player1.getChoice().equals(player2.getChoice())){
                   System.out.println("Remis");
                    tieResult = true;
               }


               if (!tieResult){
                   System.out.println("You want to continue?");
                   System.out.println("y = yes | n = no");
                   gameContinue = in.next();
                   if( gameContinue.equals("y") ){
                       tieResult = true;
                   }
               }

           }while(tieResult);

        System.out.println("Points");
        System.out.println("Player points "+p1points);
        System.out.println("Computer points "+p2points);
       }
}
