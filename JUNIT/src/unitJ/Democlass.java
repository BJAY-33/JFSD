package unitJ;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.*;
public class Democlass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Result rs=JUnitCore.runClasses(JunitClass.class);
    for(Failure failure:rs.getFailures())
    {
      System.out.println("result is : "+rs.wasSuccessful());
    }
  }

}