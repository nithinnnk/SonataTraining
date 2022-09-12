package com.sonata.MyService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import sonataServiceExample.MyServiceImpla;
import sonataServiceExample.MyServiceIntf;

class MyServiceImplStubTestTest {


	@Test
	void test() {
		MyServiceIntf my = new MyServiceStub();
		MyServiceImpla mys = new MyServiceImpla(my);
		List<String> filterMySer = mys.retriveRELATED("dummy");
		assertEquals(2, filterMySer.size());
		
	}
}


