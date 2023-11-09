package com.jdc.lambda.test;

import org.junit.jupiter.api.Test;

import com.jdc.lambda.mr.LambdaUtil;
import com.jdc.lambda.mr.Twice;

class MethodReferenceTest extends SuperTwice {

	@Test
	void test() {
		
		Twice twice = n -> System.out.println(n * 3);
		twice.makeTwice(20);
		
		twice = LambdaUtil::doStatic;
		twice.makeTwice(40);
		
		twice = new LambdaUtil()::doInstance;
		twice.makeTwice(30);
		
		twice = this::twiceInCurrent;
		twice.makeTwice(4);
		
		twice = super::twiceInCurrent;
		twice.makeTwice(5);
		
	}
	
	public void twiceInCurrent(int num) {
		System.out.println("Twice in current: " + (num * 2));
	}

}