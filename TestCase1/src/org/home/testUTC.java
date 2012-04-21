package org.home;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

import org.junit.Test;

public class testUTC {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testUTC() {
		TimeZone defatime =TimeZone.getDefault();
		System.out.println(Arrays.toString(defatime.getAvailableIDs()));//GMT+08:00
        System.out.println(defatime.getID());//GMT+08:00
        String prompt4=defatime.getID();
        
        //Calendar cal2  = Calendar.getInstance(defatime);    
        System.out.println("Ä¬ÈÏÊ±ÇøID"+prompt4);//UTC
        //defatime.setDefault(new TimeZone("America/Scoresbysund"));
	}
}
