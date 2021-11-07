package test;


import java.io.IOException;
 
public class PlayGame
{
   public static void main(String[] args)
   {
      HiLo hiLo = new HiLo();
      try {
          hiLo.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
 