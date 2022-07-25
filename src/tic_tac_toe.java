import java.util.*;
public class tic_tac_toe {

    public void ttt_game(){
        System.out.println("Welcome in Tic Tac Toe Game");
        char[] arr = new char[10];
        arr[0] = ' ';
        for(int i=1; i<10; i++){
            arr[i] = ' ';
        }
    }
    public void user_input(){

        Scanner sc = new Scanner(System.in);
        char user = sc.next().charAt(0);
        char computer;
        if (user == 'X'){
            System.out.println("User choose X");
            System.out.println("Computer have O");
            computer = 'O';
        }else {
            System.out.println("User choose O");
            System.out.println("Computer have X");
            computer = 'X';
        }
    }
    public void board(){
        System.out.print("   |   |\n-----------\n   |   |\n-----------\n   |   |");
    }
}
