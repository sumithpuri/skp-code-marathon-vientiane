package me.sumithpuri.github.vientiane.generic.vehicle;

import me.sumithpuri.github.vientiane.vehicle.domain.Bike;

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
public class RentBikeMgrImpl implements RentVehicleMgr<Bike> {

	// Can use Bike as Parameter Here, As well as Allow 
	// Clients to have a Generalized Interface

	public void rentOut(Bike bike) {
		// Renting Out Related DB Operations
		System.out.println("Renting Out Bike - Some DB Operations");
	}
	
	public void checkIn(Bike bike) {
		// Vehicle Check In Related DB Operations
		System.out.println("Return Bike to Shed - Some DB Operations");
	}
	
	public void diagnose(Bike bike) {
		// Self Diagnose functionality of a Vehicle
		// Print Diagnosis
		System.out.println("Bike Diagnostics  - Some System/DB Operations");
	}
	
	public void repair(Bike bike) {
		// Perform Pre-Defined Repair
		// Print Repair Details
		System.out.println("Auto/Manual Bike Repair - Some System/DB Operations");
	}
}
