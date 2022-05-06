package selenium;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testngAnnotations {
	
	@BeforeSuite
		public void sample1() {
			System.out.println("Before Suite");
		}

		@AfterSuite
		public void sample2() {
			System.out.println("After Suite");
		}

		@BeforeClass
		public void sample3() {
			System.out.println("Before class");
		}

		@AfterClass
		public void sample4() {
			System.out.println("After Class");
		}

		@BeforeGroups
		public void sample5() {
			System.out.println("Before Group");
		}

		@AfterGroups
		public void sample6() {
			System.out.println("After Group");
		}

		@BeforeMethod
		public void sample7() {
			System.out.println("Before Method");
		}

		@AfterMethod
		public void sample8() {
			System.out.println("After Method");
		}

		@BeforeTest
		public void sample9() {
			System.out.println("Before Test");
		}

		@AfterTest
		public void sample10() {
			System.out.println("After Test");
		}

		@org.testng.annotations.Test
		public void test1() {
			System.out.println("Test 1");

		}

		@org.testng.annotations.Test
		public void test2() {
			System.out.println("Test 2");

		}


}
