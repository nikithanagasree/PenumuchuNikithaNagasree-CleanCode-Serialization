package houseconstructioncost;

public class ConstructionCost {
	public float cost(String type_of_material,float area,Boolean automated){
		if(type_of_material=="standard material")
				return 1200*area;
		else if(type_of_material=="above standard material")
				return 1500*area;
		else 
			if(type_of_material=="high standard material" && automated==false)
				return 1800*area;
			else
				return 2500*area;
	}
}
