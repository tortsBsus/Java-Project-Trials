class Substitution
{
   
}

class SubstitutionImplementation
{
    public static void main(String args[])
   {
      try
      {
         File Input = new File("Input.txt");
         Scanner Reads =  new Scanner(Input);
         FileWriter Writes = new FileWriter("Output.txt");
         
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

}