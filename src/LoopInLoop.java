public class LoopInLoop {
    public static void main(String agrs[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i +1; j++) {
                if (j == i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || j == 5 || i == 5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==i || j==(5-i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
