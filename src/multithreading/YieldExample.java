package multithreading;

public class YieldExample
{
   public static void main(String[] args)
   {
      Thread producer = new Producer();
      Thread consumer = new Consumer();
       
      consumer.setPriority(Thread.MIN_PRIORITY); //Min Priority
      producer.setPriority(Thread.MAX_PRIORITY); //Max Priority
       
      producer.start();
      consumer.start();
   }
}
