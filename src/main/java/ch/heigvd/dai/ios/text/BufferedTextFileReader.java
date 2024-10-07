package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file using a buffered reader around
 * a file reader. It manages the reader and the buffered reader properly with a try-with-resources
 * block.
 */
public class BufferedTextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream is = new FileInputStream(filename);
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader bis = new BufferedReader(reader)){
      int a;
      while((a = bis.read()) != -1){

      }


    }catch (IOException e){
      System.out.print("Exeption: " + e);
    }
  }
}
