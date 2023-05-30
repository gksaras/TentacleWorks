package com.enums;

public enum SeasonMethods {


	WINTER {
		public String getHours() {
				return "10am-3pm";
		}
	},
	SPRING {
		public String getHours( ) {
			return "9am-3pm";
		}
	},
	SUMMER {
		public String getHours( ) {
		
			return "9am-7pm";
		}
	},
	FALL {
	public String getHours( ) {
		return "9am-2pm";
		}
	}, 
	SPRING1, SUMMER2;
	

//	public abstract String getHours();
	
	public  String getHours() {
		return "9am - 5pm";
	}
	
	public static void main(String[] args) {
		
		var s = SeasonMethods.FALL;	
		
		switch(s) {
		
		case SUMMER:
			System.out.println(s.getHours());
			break;
			
		case FALL:
			System.out.println(s.getHours());
			break;
			
		default:
			System.out.println("pass correct reference");
			break;
		}		
	}
}
