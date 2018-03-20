package lab5;

import java.util.ArrayList;
import java.util.Vector;

public class User {

	  private String name;

	  private int id;

	  private String email;

	  private String mobile;

	  private String address;

	  private Shop shop;

	  private ArrayList<Command> commands;

	public User(int id, String name,String email,String mobile,String address, Shop shop) {
		  this.id=id;
		  this.name=name;
		  this.email=email;
		  this.mobile=mobile;
		  this.address=address;
		  this.shop=shop;
		  commands=new ArrayList<Command>();
	  }

	  public void orderCommand() {
		  commands.add(shop.giveCommand(id));
	  }

	  public String getStatus(int index) {
		  return commands.get(index).getStatus();
	  }

	}