
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        String yazi = "OutputStream öğreniyorum.\nPatika Dev";

        try {
            File dosya = new File("src/io/deneme.txt");
            FileOutputStream output = new FileOutputStream(dosya);
            byte[]yazibyte = yazi.getBytes();
            output.write(yazibyte);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





     /*
     try {
            FileInputStream input = new FileInputStream("src/io/deneme.txt");
            int i = input.read();
            while (i != -1) {
                System.out.print((char)i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





     */









      /*
      File dizin = new File("src/io");
        String[] liste = dizin.list();

        for (String str: liste) {
            System.out.println(str);
        }
      */







        //File dosya = new File("src/io/deneme2.txt");
        //System.out.println(dosya.delete());
        //File dizin = new File("src/io/patika");
        //System.out.println(dizin.mkdir());


        /*
            try {
            if (dosya.createNewFile()) {
                System.out.println(dosya.getName() + " Dosyası başarılı bir şekilde oluşturuldu.");
            }else {
                System.out.println(dosya.getName() + " Dosyası zaten mevcuttur.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

         */

}
}