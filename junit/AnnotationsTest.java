package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {

	@Test
	public void test1() {
		System.out.println("Test case 1 : inside test case");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2 : inside test case");
	}
	
	@Before
	public void before() {
		System.out.println("inside before");
	}
	
	@After
	public void after() {
		System.out.println("inside after");
	}
	
	@Ignore
	public void ignore() {
		System.out.println("inside ignore");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("inside before");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("inside after");
	}

}
