package me.sumithpuri.github.vientiane.generic.vehicle.client;

import me.sumithpuri.github.vientiane.generic.vehicle.RentBikeMgrImpl;
import me.sumithpuri.github.vientiane.generic.vehicle.RentCarMgrImpl;
import me.sumithpuri.github.vientiane.generic.vehicle.RentVehicleMgr;
import me.sumithpuri.github.vientiane.vehicle.domain.Bike;
import me.sumithpuri.github.vientiane.vehicle.domain.Car;

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
public class RentGenericVehicleClient {

	public void rentBike() {
		
		// You need Only One Interface to Handle All Rentals
		RentVehicleMgr<Bike> rentVehicleMgr;
		
		rentVehicleMgr = new RentBikeMgrImpl();
		
		Bike bike = new Bike(104,"TWO",true,150);		
		rentVehicleMgr.rentOut(bike);
		
		/*
		 * Client Cannot do this Anymore!
		 * 
		 * Vehicle vehicle = new Car(104,"FOUR",true,"PETROL");
		 * rentVehicleMgr.rentOut(vehicle);
		 * 
		 * Even if there are no instanceof Checks, All is Well!
		 * Client is Absolutely Clear on how to Invoke!
		 * 
		 */
	}
	
	public void rentCar() {
		
		// You need Only One Interface to Handle All Rentals
		RentVehicleMgr<Car> rentVehicleMgr;
		
		rentVehicleMgr = new RentCarMgrImpl();
		
		Car car = new Car(104,"FOUR",true,"PETROL");		
		rentVehicleMgr.rentOut(car);
		
		/*
		 * Client Cannot do this Anymore!
		 * 
		 * Vehicle vehicle = new Bike(104,"TWO",true,150);
		 * rentVehicleMgr.rentOut(vehicle);
		 * 
		 * Even if there are no instanceof Checks, All is Well!
		 * Client is Absolutely Clear on how to Invoke!
		 * 
		 */
	}
}
