package BasicWeb;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportToHTML {
    //Stream connectivity

    public static void main(String[] args) throws IOException {
        File F = new File("C:\\FileWriting\\myTextFile.html");
        FileWriter fw = new FileWriter(F, false);
        BufferedWriter writer = new BufferedWriter(fw);

        //Writing into file first loop rows and second columns
    /*    for (int i = 0; i<4;i++){
            for(int j = 0; j<3; j++){
                int num = (int)(Math.random()*100);
                writer.write(num + ", ");
            }
            writer.newLine();
*/
        writer.write("<html> <body> <p>Text HTML Export</p></body> </html>");



        /*
        writer.newLine();
        writer.write("Second Line");
        writer.newLine();
        writer.write("Czech");
        writer.newLine();
*/
        //close the stream
        writer.close();
        System.out.println("file created!");
    }
}


