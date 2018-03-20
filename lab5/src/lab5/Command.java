package lab5;

import java.util.ArrayList;

public class Command {

	  private int idUser;

	  private String status;

	  private ArrayList<String> pastStatus;

	  private int id;

	    
	  public String getStatus() {
		  return status;
	  }

	  public void changeStatus(String status) {
		  this.status=status;
		  pastStatus.add(status);
	  }

	  public Command(int idUser, int id) {
		  this.idUser=idUser;
		  this.id=id;
		  pastStatus=new ArrayList<String>();
		  changeStatus("Preluata");
	  }

	}