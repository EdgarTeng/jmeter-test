package com.tenchael.jmetertest;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * Created by tengzhizhang on 2018/3/20.
 */
public class NumbersTest extends AbstractJavaSamplerClient {

	@Override
	public Arguments getDefaultParameters() {
		Arguments defaultParameters = new Arguments();
		defaultParameters.addArgument("a", "100");
		defaultParameters.addArgument("b", "250");
		return defaultParameters;
	}

	public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
		String a = javaSamplerContext.getParameter("a");
		String b = javaSamplerContext.getParameter("b");
		SampleResult result = new SampleResult();
		result.sampleStart();
		result.setSampleLabel("Test Sample");
		if (Numbers.gcd(Integer.valueOf(a), Integer.valueOf(b)) == 50) {
			result.sampleEnd();
			result.setResponseCode("200");
			result.setResponseMessage("OK");
			result.setSuccessful(true);
		} else {
			result.sampleEnd();
			result.setResponseCode("500");
			result.setResponseMessage("NOK");
			result.setSuccessful(false);
		}
		return result;
	}
}
