package me.sumithpuri.github.vientiane.nongeneric.vehicle;

import me.sumithpuri.github.vientiane.vehicle.domain.Vehicle;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		https://dzone.com/articles/compile-time-dynamism-using-java-generics
 * Blog Short URL		https://goo.gl/rtdBv2
 * Package Prefix 		me.sumithpuri.github.vientiane
 * Project Codename		vientiane
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class RentCarMgrImpl implements RentVehicleMgr {

	// If we don't use Vehicle as the Parameter here,  the Clients 
	// Will not be Able to use a Generalized Interface to Call Our 
	// Methods.
	
	public void rentOut(Vehicle vehicle) {
		// if (vehicle instanceof car)
			// Renting Out Related DB Operations
			System.out.println("Renting Out Car (Non Generic) - Some DB Operations");
	}	
	
	public void checkIn(Vehicle vehicle) {
		// if (vehicle instanceof car)
			// Vehicle Check In Related DB Operations
			System.out.println("Return Car to Shed (Non Generic) - Some DB Operations");
	}
	
	public void diagnose(Vehicle vehicle) {
		// if (vehicle instanceof car)
			// Self Diagnose Functionality of a Vehicle
			// Print Diagnosis
			System.out.println("Car Diagnostics (Non Generic)  - Some System/DB Operations");
	}
	
	public void repair(Vehicle vehicle) {
		// if (vehicle instanceof car)
			// Perform Pre-Defined Repair
			// Print Repair Details
			System.out.println("Auto/Manual Car Repair (Non Generic) - Some System/DB Operations");
	}
}
