public class diagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5){
            System.out.println("Invalid Value");
        }
        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
