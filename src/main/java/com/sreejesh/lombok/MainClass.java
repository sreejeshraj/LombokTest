package com.sreejesh.lombok;

import lombok.SneakyThrows;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("***** Entering Main *****");
		// testRuntimeException();
		// testExceptionHandled();
		// testExceptionWrappedInRuntimeException();
		testSneakyThrowsException();
		System.out.println("***** Exiting Main *****");
	}

	public static void testRuntimeException() {
		throw new RuntimeException("My custom RuntimeException!");
	}

	public static void testExceptionHandled() {
		try {
			throw new Exception("My custom Exception!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testExceptionWrappedInRuntimeException() {
		try {
			throw new Exception("My custom Exception!");
		} catch (Exception e) {
			throw new RuntimeException("My custom RuntimeExcption", e);
		}
	}
	
	@SneakyThrows
	public static void testSneakyThrowsException() {
		throw new Exception("My custom Exception!");
	}

}
