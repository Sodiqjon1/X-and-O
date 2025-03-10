import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int game=0,x,o,ch,i=0,wol=0;

        String zone[] = new String[9];

        String choos;

        System.out.println("You are x or o");
        choos = scanner.next();

        if (choos == "x"){

            System.out.println("1 | 2 | 3");
            System.out.println("4 | 5 | 6");
            System.out.println("7 | 8 | 9");

            while (game == 1){
                ch = 0;
                System.out.println("Where you put x : ");
                x = scanner.nextInt();
                zone[x] = "x";
                i++;
                while (ch == 1) {
                    o = random.nextInt(8) + 1;
                    if (zone[o] == null) {
                        zone[o] = "y";
                        ch = 1;
                        System.out.println(o);
                        i++;
                    }
                }
                if (i==9){
                    game = 1;
                }
            }

        }

//        if (choos == "o"){}

        while (wol == 1){
            for (int j = 0; j == 2 ; j++) {
                if (zone[1+j]==zone[4+j] && zone[4+j]==zone[7+j]){
                    if (zone[1+j]=="x"){
                        System.out.println("You win !");
                        wol = 1;
                        break;
                    }
                    if (zone[1+j]=="o"){
                        System.out.println("You loss !");
                        wol = 1;
                        break;
                    }
                }
            }
            for (int j = 0; j == 6 ; j+=3) {
                if (zone[1+j]==zone[2+j] && zone[2+j]==zone[3+j]){
                    if (zone[1+j]=="x"){
                        System.out.println("You win !");
                        wol = 1;
                        break;
                    }
                    if (zone[1+j]=="o"){
                        System.out.println("You loss !");
                        wol = 1;
                        break;
                    }
                }
            }
            if (zone[1]==zone[5] && zone[5]==zone[9]){
                if (zone[1]=="x"){
                    System.out.println("You win !");
                    wol = 1;
                    break;
                }
                if (zone[1]=="o"){
                    System.out.println("You loss !");
                    wol = 1;
                    break;
                }
            }
            if (zone[3]==zone[5] && zone[5]==zone[7]){
                if (zone[1]=="x"){
                    System.out.println("You win !");
                    wol = 1;
                    break;
                }
                if (zone[1]=="o"){
                    System.out.println("You loss !");
                    wol = 1;
                    break;
                }
            }
        }

    }
}