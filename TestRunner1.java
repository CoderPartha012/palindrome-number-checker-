
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {

	 public static void main(String[] args)
	 {
		 Result result = JUnitCore.runClasses(TestSuiteExample.class);
		 for(Failure faliure : result.getFailures())
		 {
			 System.out.println(faliure.toString());
		 }
		 System.out.println("Result=="+result.wasSuccessful());
	 }
}
