import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String[] args) {
        // 0 = rock // 1 = paper // 2 = scissor
        Random i = new Random();
        Scanner j = new Scanner(System.in);
        System.out.println("Enter your choice:- ");
        System.out.println("// 0 = rock // 1 = paper // 2 = scissor");
        int u = j.nextInt();
        int c = i.nextInt(3);
//        String [] try = {"Rock","Paper","Scissor"};// This give error because try is keyword

        String [] try1 = {"Rock","Paper","Scissor"};

        for(int k = 0;k < 3;k++){
            if(k == u) // 1 == 1
            {
                System.out.println("User :- "+ try1[k]);
            }
            if(k == c) // 1 == 1
            {
                System.out.println("Computer :- "+ try1[k]);
            }
        }

        System.out.print("\n\n Result:- ");
        if(u == c){
            System.out.println("Draw");
        }
        else if(u == 0 && c == 2 || u == 2 && c == 1 || u == 1 && c == 0){
            System.out.println("User win");
        }
        else{
            System.out.println("Computer win");
        }
    }
}
