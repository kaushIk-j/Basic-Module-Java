package com.coreconcepts.demo.junit;

public class Product
{
static double getDiscountedPrice(double pprice) throws ZeroProductPriceException
{
//If pprice is 0 then ZeroProductPriceException is raised
// if pprice is in range of 100-1000 then 0.2%
//if 1001-2000 then 0.5%
//if 2001-3500 then 0.7%
//If above 3500 then 10%
	
	if (pprice == 0)
		throw new ZeroProductPriceException("price is not equal to 0");

	return 0;
}
}

//Custom Exception - ZeroProductPriceException

//Parameterized Testing