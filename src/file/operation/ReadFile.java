package file.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        FileReader fr = null;
        String path = "/Users/mahin/OneDrive/Desktop/Java Text.txt";

        try {
            fr = new FileReader(path); //if we use two line
        }catch (Exception ex){
            System.out.println("The selected file not locatable");
        }try {
            br = new BufferedReader(fr);

            String st = "";
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        }catch (Exception ex){
            //System.out.println("the file was not readable");
        }

        finally {
            if (br != null){
               try {
                   br.close();
               }catch (Exception ex){
                   System.out.println("Unable to close buffered reader instance");
               }
            }
            if (fr != null){
                try {
                    fr.close();
                }catch (Exception ex){
                    System.out.println("Unable to close file reader instance");
                }

            }
        }


    }
}
