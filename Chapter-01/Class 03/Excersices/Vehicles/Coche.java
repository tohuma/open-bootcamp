package Vehicles;

public class Coche 
{
	int num_doords = 0;
	
	public void addDoor()
	{
		this.num_doords++;
	}
	
	public int totalDoors()
	{
		return this.num_doords;
	}
	
	public static void main(String[] args)
	{
		Coche miCoche = new Coche();
		
		System.out.println("Total doors: " + miCoche.totalDoors());
		miCoche.addDoor();
		miCoche.addDoor();
		System.out.println("Total doors: " + miCoche.totalDoors());
		
	}
}
