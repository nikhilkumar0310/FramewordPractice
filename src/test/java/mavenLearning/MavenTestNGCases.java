package mavenLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class MavenTestNGCases {
  @Test
  public void testMethod() {
	  System.out.println("Inside my Test Method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside my Before Class Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside my After Class Method for Good GIT");
	  System.out.println("This COmment is just to check in the new code into Git Hub Master Repo Online");
  }

}
