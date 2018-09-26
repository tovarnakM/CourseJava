import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class kNN {

    public static void main(String[] args) throws Exception {

        //load csv document
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Acer/Desktop/dataset.csv"));
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

        //parameter of attributes
        Object[][] data = new Object[][] {
                { "100420", Boolean.FALSE, "Des Moines IA", "Spokane WA",
                        "02/06/2000", 450f,"sdadsdsd","sdasd",null,null,null,null,null,null,null,null,null,null},
                { "202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ",
                        "05/20/2000", 1250f,"sdadsds","sdsss","202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ","202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ",null,null},
                { "450877", Boolean.TRUE, "St. Paul MN", "Austin TX",
                        "03/20/2000", 1745f,"dsadsd","dsdasd",null,null,null,"202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ",null,"sdas"},
                { "101891", Boolean.FALSE, "Boston MA", "Albany NY",
                        "04/04/2000", 88f,"sdasd","idfdij","202174", Boolean.TRUE, "Basking Ridge NJ", "Princeton NJ","202174", Boolean.TRUE,null,null, "Basking Ridge NJ", "Princeton NJ"}
        };

        //create the data model and the JTable
        JTable table = new JTable(data,header);

        JFrame frame = new JFrame("Zadanie");
        frame.add(new JScrollPane(table));

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(1000, 200);
        frame.setVisible(true);

    }

}