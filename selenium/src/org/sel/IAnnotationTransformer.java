package org.sel;

import org.testng.annotations.ITestAnnotation;

public class IAnnot implements IAnnotationTransformer {

public void transform(ITestAnnotation arg0, class arg1,constructor arg2,Method arg3)  {
	constructor  arg2,Method arg3){
	IRetryAnalyzer analyzer = arg0.getRetryAnalyzer();
	if (analyzer == null) {
		arg0.setRetryAnalyzer(RetryFailed.class);
	}
	}
			
}
