package com.jdc.recap.nested;

import com.jdc.recap.nested.Outer.*;

public class NestedApp {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		InnnerStatic.doStaticInner();
		
		InnnerStatic innerStatic = new InnnerStatic();
		
		innerStatic.outer = outer;
		innerStatic.doInstInner();
		
		Outer.InnerInstance innerInst = outer.new InnerInstance();
		InnerInstance.doStaticInnerInst();
		innerInst.doInstInnerInst();
		
	}

}




