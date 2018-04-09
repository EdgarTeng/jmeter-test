package com.tenchael.jmetertest;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tengzhizhang on 2018/3/20.
 */
public class AppTest extends Assert {

	@Test
	public void testGcd() {
		NumbersTest test = new NumbersTest();
		Arguments arguments = test.getDefaultParameters();
		JavaSamplerContext context = new JavaSamplerContext(arguments);
		test.setupTest(context);
		SampleResult result = test.runTest(context);
		test.teardownTest(context);
		assertTrue(result.isSuccessful());

	}
}
