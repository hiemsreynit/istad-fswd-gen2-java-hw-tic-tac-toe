import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        // tic tac toe
        String [][] board = {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}
        };
        int r,c;
        String welcome = "Welcome to tic tac toe Game version 2.0";
        for(byte ch: welcome.getBytes()){
            Thread.sleep(50);
            System.out.print((char) ch);
        }
        System.out.println();
        for(String [] row: board){
            for(String col: row){
                Thread.sleep(100);
                System.out.print(col + " | ");
            }
            System.out.println();
        }
        System.out.println("This game contains two players A & B");
        System.out.println("[+] Player A (X): ");
        System.out.print("[+] Insert row number: ");
        r = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert column number: ");
        c = new Scanner(System.in).nextInt();
//        String a = new Scanner(System.in).nextLine();
        board[r-1][c-1] = "X";
//        System.out.print("[+] Player B: ");
//        String b = new Scanner(System.in).nextLine();
        for(String [] row: board){
            for(String col: row){
                Thread.sleep(100);
                System.out.print(col + " | ");
            }
            System.out.println();
        }
    }
}
