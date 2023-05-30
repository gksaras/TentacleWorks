package com.openclosed;

public class VehicleDemo {

		public double vehicleNumber() {
			// functionality
		}
	}

	class Car extends VehicleInfo {
		public double vehicleNumber() {
			return this.getValue();
		}

		class Car extends Truck {
			public double vehicleNumber() {
				return this.getValue();
			}
		}
	}
