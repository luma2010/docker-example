package ch.heigvd.dai.ios.text;

import ch.heigvd.dai.ios.Readable;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * A class that reads text files. This implementation reads the file byte per byte. It manages the
 * file reader properly with a try-catch-finally block.
 */
public class TextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream is = new FileInputStream(filename);
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)){
      int a;
      while((a = reader.read()) != 1){
        System.out.print(a);
      }


    }catch (IOException e){
      System.out.print("Exeption: " + e);
    }
  }
}
