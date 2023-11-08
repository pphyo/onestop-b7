package com.jdc.generic.bound;

public class MultiBoundType<T extends A & B & C> {

}

class A {}
interface B {}
interface C {}