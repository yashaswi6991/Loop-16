public class FizzBuzz
{
  public static void main(String[] args)
  {
   for(int i=0; i<100; i++)
   {
     System.out.println(i);
   
   if(i%3 == 0)
   {
     System.out.println("divisible by 3");

   }
   else
   {
     System.out.println("not divisible by 3");
   }
   }
  }
}