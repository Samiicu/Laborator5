package lab5;

import java.util.ArrayList;

public class Shop {

	private ArrayList<Command> activeCommands;

	private ArrayList<Command> finishedCommands;

	private int id;
	private String name;
	private int lastId=0;

	public Shop(int id,String name){
		this.id=id;
		this.name=name;
		activeCommands=new ArrayList<Command>();
		finishedCommands=new ArrayList<Command>();
	}
	public Command giveCommand(int idUser) {
		lastId++;
		Command command= new Command(idUser,lastId);
        activeCommands.add(command);
        return command;
	}
	public void changeStatus(int index,String status){
		activeCommands.get(index).changeStatus(status);
		if(status == "livrat"){
			finishedCommands.add(activeCommands.get(index));
			activeCommands.remove(index);
		}
			
	}
	

}