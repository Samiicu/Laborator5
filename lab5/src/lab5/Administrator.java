package lab5;

public class Administrator {

	  private int id;

	    public Shop myShop;
	    public Administrator(int id, Shop shop){
	    	this.id=id;
	    	this.myShop=shop;
	    }

	  public void updateCommand(int indexCommand, String status) {
		  myShop.changeStatus(indexCommand, status);
		  
	  }

	}