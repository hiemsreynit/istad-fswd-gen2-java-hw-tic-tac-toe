import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // tic tac toe
        String[][] board = {
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
        int A_r, A_c, B_r, B_c;
        String welcome = """
                            Welcome to tic tac toe Game version 2.0
                            (Press any character to quite the game.)""";
        for (byte ch : welcome.getBytes()) {
            Thread.sleep(50);
            System.out.print((char) ch);
        }
        System.out.println();
        System.out.println("This game contains two players A & B");
        try {
            do {
                printBoard(board);

                System.out.println("[+] Player A (X): ");
                System.out.print("[+] Insert row number: ");
                A_r = new Scanner(System.in).nextInt();
                System.out.print("[+] Insert column number: ");
                A_c = new Scanner(System.in).nextInt();
                board[A_r - 1][A_c - 1] = "X";
                printBoard(board);
                if (checkWinner(board)) {
                    System.out.println("Player A Wins!");
                    System.out.println("+".repeat(40));
                    startNewGame(board);
                }

                System.out.println("[+] Player B: ");
                System.out.print("[+] Insert row number: ");
                B_r = new Scanner(System.in).nextInt();
                System.out.print("[+] Insert column number: ");
                B_c = new Scanner(System.in).nextInt();
                board[B_r - 1][B_c - 1] = "O";
                if (checkWinner(board)) {
                    printBoard(board);
                    System.out.println("Player B Wins!");
                    System.out.println("+".repeat(40));
                    startNewGame(board);
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkThree(String a, String b, String c) {
        return !a.equals("-") && a.equals(b) && a.equals(c);
    }

    public static boolean checkWinner(String[][] b) {
        for (int i = 0; i < 3; i++) {
            if (checkThree(b[i][0], b[i][1], b[i][2])) {
                return true;
            }
            if (checkThree(b[0][i], b[1][i], b[2][i])) {
                return true;
            }
        }
        return checkThree(b[0][0], b[1][1], b[2][2]) || // Diag 1
                checkThree(b[0][2], b[1][1], b[2][0]);
    }

    public static void printBoard(String[][] board) throws Exception {
        for (String[] row : board) {
            for (String col : row) {
                Thread.sleep(100);
                System.out.print(col + " | ");
            }
            System.out.println();
        }
    }

    public static void startNewGame(String[][] b) throws Exception {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = "-";
            }
        }
        String welcome = "Welcome to New Game!";
//        System.out.println("Press q to quite the game.");
//        if (new Scanner(System.in).nextLine().equals("q")) {
//            quiteGame(new Scanner(System.in).nextLine());
//        }
        for (byte ch : welcome.getBytes()) {
            Thread.sleep(50);
            System.out.print((char) ch);
        }
        System.out.println();
        for (String[] row : b) {
            for (String col : row) {
                Thread.sleep(100);
                System.out.print(col + " | ");
            }
            System.out.println();
        }
    }
//    public static void quiteGame(String input) {
//        input = new Scanner(System.in).nextLine();
//        if (input.equalsIgnoreCase("q")){
//            System.out.println("Thanks for playing!");
//            System.exit(0);
//        }
//    }
}
