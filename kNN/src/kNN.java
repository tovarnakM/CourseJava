import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class kNN {

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

        Object[][] data = new Object[header.length+10][lines.size()+10];
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

        //create the data model and the JTable
        JTable table = new JTable(data,header);

        JFrame frame = new JFrame("Zadanie");
        frame.add(new JScrollPane(table));

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(1000, 200);
        frame.setVisible(true);

    }

}