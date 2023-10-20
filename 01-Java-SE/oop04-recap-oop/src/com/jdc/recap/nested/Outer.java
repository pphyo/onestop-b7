package com.jdc.recap.nested;

public class Outer {

	private String outInstVar = "Hello Outer Instance";
	public static final String outStaticVar = "Hello Outer Static";

	public String getOutInstVar() {
		return outInstVar;
	}

	public void setOutInstVar(String outInstVar) {
		this.outInstVar = outInstVar;
	}
	
	class InnerInstance {
		
		public static void doStaticInnerInst() {
			System.out.println("doStaticInnerInst()");
		}
		
		public void doInstInnerInst() {
			System.out.println("doInstInnerInst()");
		}
	}

	static class InnnerStatic {
		
		Outer outer;

		public static void doStaticInner() {
			System.out.println("Do static form %s".formatted(Outer.outStaticVar));
		}

		public void doInstInner() {
			System.out.println("Do instance from %s".formatted(outer.outInstVar));
		}
	}

}
