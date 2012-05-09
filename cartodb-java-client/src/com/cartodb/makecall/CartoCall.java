package com.cartodb.makecall;

import com.cartodb.impl.CartoDBClient;

public class CartoCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CartoDBClient cartoDBCLient= new CartoDBClient("topol.daiict@gmail.com");
		System.out.println(cartoDBCLient.executeQuery("SELECT * FROM lightingsource Limit 1"));
		// TODO Auto-generated method stub
	}

}
