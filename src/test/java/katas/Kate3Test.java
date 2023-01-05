package katas;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kate3Test {
@Test
   public void test3(){


      Assertions.assertEquals(1, Kate3.div(2, 2));
      Assertions.assertEquals(2, Kate3.div(8, 4));
      Assertions.assertEquals(1, Kate3.div(9, 9));
   }
}
