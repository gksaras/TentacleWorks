package com.collections;

import java.util.ArrayList;
import java.util.List;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}


//A bounded parameter type is a generic type that specifies a bound for the generic 
//A wild card generic type is an unknown generic type represented with a question mark(?). 


//Unbounded wild cards - represents any data type. 
//Upper-bounded wild cards - Generic type can't just use a subclass.
//Lower-bounded wild cards - telling java that list will be a list of some objects that are a superclass of String.

public class GenericWildcards {

	public static void main(String[] args) {
		
		List<?> list1 = new ArrayList<A>();
		
		List<? extends A> list2 = new ArrayList<A>();
		
		List<? super A> list3 = new ArrayList<A>();
		
		//List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        
		List<? super B> list5 = new ArrayList<A>();
       
		//List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
    
		
	}
}
