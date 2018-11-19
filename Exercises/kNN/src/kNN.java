import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kNN {

    static int x,y,k;
    static int dist;
    static Object[][] data;
    static int rows;
    public static void main(String[] args) throws Exception {

        //load csv document
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/a.csv"));
        List<String> lines = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        //find out how many attribute in loaded line
        int attribute = 0;
        for (int i = 0; i < lines.get(0).length(); i++){
            if (lines.get(0).charAt(i) == ';'){
                attribute++;
            }
        }
        //write header into table
        String[] header = new String[attribute+1];
        int counter = 0;
        String myString = "";
        for (int i = 0; i < lines.get(0).length(); i++){
            if ((lines.get(0).charAt(i) != ';')) {
                myString = myString + lines.get(0).charAt(i);
            }else {
                header[counter] = myString;
                counter++;
                myString = "";
            }
            if (i == lines.get(0).length()-1){
                header[counter] = myString;
            }
        }

        data = new Object[lines.size()-1][header.length];
        for (int i = 0; i < lines.size() - 1; i++){
            counter = 0;
            myString = "";
            for (int j = 0; j < lines.get(i+1).length(); j++){
                if ((lines.get(i+1).charAt(j) != ';')) {
                    myString = myString + lines.get(i+1).charAt(j);
                }else {
                    data[i][counter] = myString;
                    counter++;
                    myString = "";
                }
                if (j == lines.get(i+1).length() - 1){
                    data[i][counter] = myString;
                }
            }
        }
        rows = lines.size()-1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextInt();

        System.out.println("Enter y: ");
        y = scanner.nextInt();

        System.out.println("Enter k: (k <=" + data.length + ")");
        k = scanner.nextInt();

        double[] distance = new double[data.length];
        double[] distance1 = new double[data.length];
        for (int i = 0; i < data.length; i++){
            double X = Double.parseDouble((String) data[i][1]);
            double Y = Double.parseDouble((String) data[i][2]);
            distance[i] = Math.sqrt(Math.pow(X-x,2) + Math.pow(Y-y,2));
            distance1[i] = Math.sqrt(Math.pow(X-x,2) + Math.pow(Y-y,2));
        }

        double[] distanceSorted = new double[k];
        Arrays.sort(distance);
        for (int i = 0; i < k; i++){
            distanceSorted[i] = distance[i];
        }

        int counterBad = 0;
        int counterGood = 0;
        for (int i = 0; i < k; i++){
            for (int j = 0; j < data.length; j++){
                if (distanceSorted[i] == distance1[j]){
                    if (data[j][3].equals("Bad")){
                        counterBad++;
                    }
                    if (data[j][3].equals("Good")){
                        counterGood++;
                    }
                }
            }
        }
        if (counterBad < counterGood){
            System.out.println("Entered data are belonging to \"Good\" class");
        }else if (counterBad > counterGood){
            System.out.println("Entered data are belonging to \"Bad\" class");
        }else {
            System.out.println("We can not decided, where are our data belonging");
        }

        dist = (int) (distance[k-1]*50);

        JFrame frame = new JFrame("uz");
        frame.setSize(1000,700);
        frame.setVisible(true);
        Draw draw = new Draw();
        frame.add(draw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}