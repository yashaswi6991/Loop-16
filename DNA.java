//DNA Sequencing
public class DNA
{
  public static void main(String[] args)
  {
    /* Sample DNA pattern 
     DNA should start with codon ATG, the stop codon TGA, and the length is divisible by 3 to know it is a protein
     */
     //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    System.out.println(dna.length());
    int start = dna.indexOf("ATG");
    System.out.println("Start:"+ start);
    int stop = dna.indexOf("TGA");
    System.out.println("Stop:"+ stop);
    if((start != -1) && (stop != -1) && (stop - start) % 3 == 0)
    {
      System.out.println("both the conditions are satisfied");
      String protein = dna.substring(start+2 , stop+2);
      System.out.println("protein "+ protein);
    }
    else
    {
      System.out.println("no protein");
    }
  }
}
