package dependencyinversion;

interface Keyboard   
{   
//functionality  
}  

public class WindowsMachine {
	public final keyboard;  
	public final monitor;  
	public WindowsMachine()  
	{  
	monitor = new monitor();  //instance of monitor class  
	keyboard = new keyboard(); //instance of keyboard class  
	}  
}

//private final Keyboard keyboard;  
//private final Monitor monitor;  
//public WindowsMachine(Keyboard keyboard, Monitor monitor)   
//{  
//this.keyboard = keyboard;  
//this.monitor = monitor;  
//}  