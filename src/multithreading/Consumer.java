package multithreading;

class Consumer extends Thread
{
   public void run()
   {
      for (int i = 1; i <=9; i+=2)
      {
         System.out.println("Odd Number " + i);
         Thread.yield();
      }
   }
}