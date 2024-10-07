package ch.heigvd.dai.ios.binary;

import ch.heigvd.dai.ios.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A class that reads binary files. This implementation reads the file using a buffered input
 * stream. It manages the input stream and the buffered input stream properly with a
 * try-with-resources block.
 */
public class BufferedBinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try(InputStream is = new FileInputStream(filename);
        InputStream bis = new BufferedInputStream(is)){
      int a;
      while((a = bis.read()) != -1){
      }


    }catch (IOException e){
      System.out.print("Exeption: " + e);
    }
  }
}
