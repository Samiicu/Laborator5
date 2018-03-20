package lab5;

public class shopFact {
int noShops=0;

public Shop createShop(int id,String nume){
	if(noShops==0)
		return new Shop(id,nume);
	else
		return null;
}
	
}
