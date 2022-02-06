package package1;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Test3Test {
	
	@Test
	public void file1() {
		System.out.println("This is Test1");
	}
	
	@Test
	public void file2() {
		fail("This is Test2");
	}
	
	@Test
	public void file3() {
		System.out.println("This is Test3");
	}

}
