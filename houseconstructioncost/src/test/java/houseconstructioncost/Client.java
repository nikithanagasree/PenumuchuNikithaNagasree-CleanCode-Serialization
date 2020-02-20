package houseconstructioncost;

import static org.junit.Assert.*;

import org.junit.Test;


public class Client {

	@Test
	public void constructionCostTest() {
		ConstructionCost house=new ConstructionCost();
		float cost=house.cost("standard material",60,false);
		assertEquals(72000,cost,0.01);
		cost=house.cost("above standard material",100,false);
		assertEquals(150000,cost,0.01);
		cost=house.cost("high standard material",45,false);
		assertEquals(81000,cost,0.01);
		cost=house.cost("high standard material",178,true);
		assertEquals(445000,cost,0.01);
	}

}
