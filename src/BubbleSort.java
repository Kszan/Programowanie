public class BubbleSort {
    public static void main(String[] args) {
        int myArray[] = {5, 4, 2, 9, 2, 4, 7};

        System.out.println("myArray before sort: ");
        for (int aMyArray : myArray) {
            System.out.print(aMyArray + ", ");
        }
        bubbleSort(myArray);
        System.out.println("\nmyArray after sort: ");
        for (int aMyArray : myArray) {
            System.out.print(aMyArray + ", ");
        }
        System.out.println("\n");
        time();

    }

    static void bubbleSort(int[] myArray) {
        int a = myArray.length;
        for (int i = 0; i < a; i++) {
            for (int j = 1; j < (a - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    int result = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = result;
                }
            }
        }
    }

    public static void time() {
        long czasRozpoczecia = System.currentTimeMillis();

        for (int i = 0; i < 1000_000; i++) {
        }
        long czasZakonczenia = System.currentTimeMillis();
        long czasTrwania = czasZakonczenia - czasRozpoczecia;

        System.out.println("Czas trwania: " + czasTrwania + " miliseconds");
    }
}
