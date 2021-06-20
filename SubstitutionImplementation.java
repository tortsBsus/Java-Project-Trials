import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
class Substitution
{
   File Code;
   File Input;
   File Output;
   HashMap<Character,Character> Co = new HashMap<>();
   Substitution(File C, File I, File O)
   {
            Input = I;
            Code = C;
            Output = O;
   }
   void Hash_it(int a, int b)
   {
      try
      {
         Scanner CReads = new Scanner(Code);
                     
         while(CReads.hasNextLine())
         {
            String A = CReads.nextLine();            
            Co.put(A.charAt(a),A.charAt(b));
         }
         CReads.close();
      }
      catch(FileNotFoundException X)
      {
         System.out.println("File doesn't exist");
         X.printStackTrace();
      }   
      finally
      {
        System.out.println("Hashed");       
      }
   }
   void Substitute(int F, int S)
   {
      //Creates HashMap
      Hash_it(F,S);
      try
      {
         Scanner IReads =  new Scanner(Input);
         FileWriter Writes = new FileWriter(Output);
         
         while(IReads.hasNextLine())
         {
            String A = IReads.nextLine();
            for(int a=0;a<A.length();a++)
            {
              Writes.append(Co.get(A.charAt(a)));
            }
          
         }
         IReads.close();
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
   
}

class SubstitutionImplementation
{
    public static void main(String args[])
   {
       
      
      Substitution A = new Substitution(new File("Code.txt"),new File("Input.txt"),new File("Output.txt"));
      Scanner S = new Scanner(System.in);
      System.out.println("Do you want to \n1.Encrypt\n2.Decrypt");
      int ch = S.nextInt();
      int a=0,b=3;
      switch(ch)
      {
         case 1:break;
         case 2:a=3;b=0;break;
         default:System.out.println("Wrong input. Encrypting by default");
         
      }      
      A.Substitute(a,b);
            
   }

}