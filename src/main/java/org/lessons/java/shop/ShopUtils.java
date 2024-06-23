package org.lessons.java.shop;

//Generate random ProductID with ShopUtils
public class ShopUtils {

	private static int minNumber = 0;
	private static int maxNumber = 5000; //Max Code
	
	//Method to generate random productID between minNumber and maxNumber
    public static int genRandCode() {
        return minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
    }

}
