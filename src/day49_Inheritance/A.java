package day49_Inheritance;

public class A {} // Parent and Super class
class B extends A{}  // B is child -->> A
class C extends A{}  // C is child -->> A
class D extends B{}  // D is child extends from B
class E extends A{}  // E is child -->> A
class F extends B{}  // F is child extends from B
class G extends B{}  // G is child extends from B
class H extends D{}  // H is child extends from D
class L extends D{}  // L is child extends from D
class M extends A{}  // M is child -->> A