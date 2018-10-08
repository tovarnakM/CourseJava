import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class kNN {

    //static Object[][] data;
    static Object[][] data;
    static int[][] arrayCisel;
    static int rows;
    static int columns;
    public static void main(String[] args) throws Exception {

        //load csv document
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/DATA1.csv"));
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

        data = new Object[lines.size()][header.length];
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
//        arrayCisel = new int[lines.size()-1][header.length-2];
//        for (int i = 0; i < lines.size() - 1; i++){
//            for (int j = 1; j < header.length - 1; j++){
//                arrayCisel[i][j-1] = Integer.parseInt((String) data[i][j]);
//            }
//        }
        rows = lines.size()-1;
        System.out.println(rows);

        //create the data model and the JTable
//        JTable table = new JTable(data,header);
//
//        JFrame frame = new JFrame("Zadanie");
//        frame.add(new JScrollPane(table));
//        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//        frame.setSize(1000, 200);
//        frame.setVisible(true);
        JFrame frame = new JFrame("uz");
        frame.setSize(1000,700);
        frame.setVisible(true);
        Draw draw = new Draw();
        frame.add(draw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}