import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
class Substitution
{
   File Code;
   File Input;
   File Output;
   Substitution(File C, File I, File O)
   {
            Input = I;
            Code = C;
            Output = O;
   }
   File Substitute()
   {
      try
      {
         Scanner Reads =  new Scanner(Input);
         FileWriter Writes = new FileWriter(Output);
         
         while(Reads.hasNextLine())
         {
            String A = Reads.nextLine();
            
            Writes.append(Line);
            Writes.append("\n");

         }
         Reads.close();
         Writes.close();
      }
      catch(FileNotFoundException X)
      {
         System.out.println("File doesn't exist");
         X.printStackTrace();
      }   
      catch(IOException p)
      {
         
         System.out.println("FileWriter error");
         p.printStackTrace();
      }
   }
   File UnSubstitute()
   {
   
   }
   
}

class SubstitutionImplementation
{
    public static void main(String args[])
   {
      Substitution A = new Substitution(new File("Code.txt"),new File("Input.txt"),new File("Output.txt"));      
   }

}