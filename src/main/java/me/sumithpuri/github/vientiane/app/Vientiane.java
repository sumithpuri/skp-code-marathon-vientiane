package me.sumithpuri.github.vientiane.app;

import me.sumithpuri.github.vientiane.generic.vehicle.client.RentGenericVehicleClient;
import me.sumithpuri.github.vientiane.nongeneric.vehicle.client.RentNonGenericVehicleClient;

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
public class Vientiane {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Vientiane");
		System.out.println("Project Description   Sample Code for API Design using Java Generics ");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/rtdBv2");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println();
		
		System.out.println("Running Sample Code to Demonstrate API Design Using Java Generics");
		System.out.println("Invocation using Non Generics - Refer Code to Understand Differences"); 
		RentNonGenericVehicleClient nonGenericSample = new RentNonGenericVehicleClient();
		nonGenericSample.rentBike();
		nonGenericSample.rentCar();
		
		System.out.println();
		System.out.println("Invocation using Generics - Refer Code to Understand Differences");
		RentGenericVehicleClient genericSample = new RentGenericVehicleClient();
		genericSample.rentBike();
		genericSample.rentCar();
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Refer Codebase to Understand API Design Using Generics and its Advantages");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
	}
}
