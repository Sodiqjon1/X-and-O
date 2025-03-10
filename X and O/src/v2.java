import java.util.*;

public class v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int game = 1, x, o, ch, i = 0, wol = 0;
        String[] zone = new String[9];
        String choos;

        System.out.println("You are x or o : ");
        choos = scanner.next().toLowerCase();

        if (choos.equals("x")) {
            System.out.println("1 | 2 | 3");
            System.out.println("4 | 5 | 6");
            System.out.println("7 | 8 | 9");

            while (game == 1) {
                System.out.print("Where do you put x: ");
                x = scanner.nextInt() - 1;

                if (x < 0 || x > 8 || zone[x] != null) {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }

                zone[x] = "x";
                i++;

                if (i == 9) {
                    System.out.println("Draw!");
                    break;
                }

                ch = 0;
                while (ch == 0) {
                    o = random.nextInt(9);
                    if (zone[o] == null) {
                        zone[o] = "o";
                        ch = 1;
                        System.out.println("Computer placed 'o' at: " + (o + 1));
                        i++;
                    }
                }

                if (i == 9) {
                    System.out.println("Draw!");
                    break;
                }
            }
        }

        // Checking for a winner
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
                {0, 4, 8}, {2, 4, 6} // Diagonals
        };

        for (int[] condition : winConditions) {
            if (zone[condition[0]] != null && zone[condition[0]].equals(zone[condition[1]]) && zone[condition[1]].equals(zone[condition[2]])) {
                if (zone[condition[0]].equals("x")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
                wol = 1;
                break;
            }
        }

        if (wol == 0) {
            System.out.println("Game over!");
        }
    }
}