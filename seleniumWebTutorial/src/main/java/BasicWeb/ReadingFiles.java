package BasicWeb;

import java.io.*;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {
        /*connecting streams*/
        File f = new File("C:\\FileWriting\\myTextFile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);

        //read content from file
        String line = null;
        while((line = reader.readLine())!=null) {
            System.out.println(line);

        }
        reader.close();
    }
}
