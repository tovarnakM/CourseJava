public class megaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes >= 0){
            int megaBytes = kiloBytes / 1024;
            int newKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + newKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
