package lab5;

public class Main {

	public static void main(String[] args) {
		shopFact fact=new shopFact();
		Shop shop = fact.createShop(3,"Elefant");
		Administrator admin =new Administrator(78,shop);
		User user1=new User(1, "Costel" , "costel@yahoo.com" , "0756453789" , "Iasi 17" , shop);
		
		user1.orderCommand();
		user1.getStatus(0);
		admin.updateCommand(0,"merge");
		user1.getStatus(0);
		admin.updateCommand(0,"livrat");
		user1.getStatus(0);
		
		
		

	}

}
