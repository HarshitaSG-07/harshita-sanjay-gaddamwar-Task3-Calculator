package com.mavdemo.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public void test()
	{
		App op=new App();
		int result = op.add(3,4);
	    assertEquals(7,result);
	    
	    result=op.sub(4, 3);
	    assertEquals(1,result);
	    
	    result=op.mul(4, 3);
	    assertEquals(12,result);
	    
	    result=op.div(10, 5);
	    assertEquals(2,result);
	}
	
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
