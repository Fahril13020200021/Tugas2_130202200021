import java.io.IOException;
import java.io.InputStreamReader;

//Nama   : Fahril 
//Nim    : 13020200021
//Tanggal: 22 Maret 2022
//Kelas  : A1

public class IO {
   public static void main(String args[]) throws IOException
   {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         
         System.out.println("Masukan karakter, 'q' untuk berhenti.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
 
}






