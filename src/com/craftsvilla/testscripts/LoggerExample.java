package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;

public class LoggerExample extends BaseTest
{
	@Test
	public void loggerDebug()
	{
		log.debug("this is a debug message");
	}

}

