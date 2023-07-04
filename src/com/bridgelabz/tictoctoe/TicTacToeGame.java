package com.bridgelabz.tictoctoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    static String[] board;
    static String turn;
    void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first character from X or O: ");
        String ch1 = sc.next();
        System.out.println("Enter the second character from X and O: ");
        String sh2 = sc.next();
    }
   static String showBoard(){
        for (int i=0; i<9;i++){
            String str = null;
            switch (i){
                case 0:
                    str = board[0] + board[1]+board[2];
                    break;
                case 1:
                    str = board[3] + board[4] + board[5];
                    break;
                case 2:
                    str = board[6] + board[7] + board[8];
                    break;
                case 3:
                    str = board[0] + board[3]+board[6];
                    break;
                case 4:
                    str = board[1] + board[4] + board[7];
                    break;
                case 5:
                    str = board[2] + board[5] + board[8];
                    break;
                case 6:
                    str = board[0] + board[4] + board[8];
                    break;
                case 7:
                    str = board[2] + board[4] +board[6];
                    break;
            }

            if (str.equals("XXX")){
                return "X";
            } else if (str.equals("OOO")) {
                return "O";
            }
        }
        for (int i=0; i<9;i++){
            if (Arrays.asList(board).contains(String.valueOf(i + 1))){
                break;
            } else if (i==8) {
                return "draw";
            }
        }
       System.out.println(turn + "turn: enter a slot number to place "+ turn + " in:");
        return null;
    }
    static void printBoard(){

    }
}
