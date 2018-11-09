package me.sumithpuri.github.vientiane.nongeneric.vehicle.client;

import me.sumithpuri.github.vientiane.nongeneric.vehicle.RentBikeMgrImpl;
import me.sumithpuri.github.vientiane.nongeneric.vehicle.RentCarMgrImpl;
import me.sumithpuri.github.vientiane.nongeneric.vehicle.RentVehicleMgr;
import me.sumithpuri.github.vientiane.vehicle.domain.Bike;
import me.sumithpuri.github.vientiane.vehicle.domain.Car;
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
public class RentNonGenericVehicleClient {
	
	public void rentBike() {
		
		// You need Only One Interface to Handle All Rentals
		RentVehicleMgr rentVehicleMgr;
		
		rentVehicleMgr = new RentBikeMgrImpl();
		
		Vehicle vehicle = new Bike(104,"TWO",true,150);		
		rentVehicleMgr.rentOut(vehicle);
		
		/*
		 * Client can As Well Do This
		 * 
		 * Vehicle vehicle = new Car(104,"FOUR",true,"PETROL");
		 * rentVehicleMgr.rentOut(vehicle);
		 * 
		 * But If there are no instanceof Checks, this Bombs!
		 * 
		 */
	}
	
	public void rentCar() {

		// You need Only One Interface to Handle All Rentals
		RentVehicleMgr rentVehicleMgr;
		
		rentVehicleMgr = new RentCarMgrImpl();
		
		Vehicle vehicle = new Car(104,"FOUR",true,"PETROL");		
		rentVehicleMgr.rentOut(vehicle);
		
		/*
		 * Client can As Well Do This
		 * 
		 * Vehicle vehicle = new Bike(104,"TWO",true,150);
		 * rentVehicleMgr.rentOut(vehicle);
		 * 
		 * But If there are no instanceof Checks, this Bombs!
		 * 
		 */
	}

}
