package com.openclosed;

//The application or module entities the methods, functions, variables, etc. 
//The open-closed principle states that according to new requirements the module should be open for extension but closed for modification. 
//The extension allows us to implement new functionality to the module.
class Vehicle{
	
}

class Car{
	
}

class Bike{
	
}

public class SampleVehicle {
	
	public double vehicleNumber(Vehicle vcl)   
	{  
	if (vcl instanceof Car)   
	{  
	return vcl.getNumber();  
	if (vcl instanceof Bike)   
	{  
	return vcl.getNumber();  
	}  
	}
	}
}
