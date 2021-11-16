package electronicEquip;
/*
Design and implement a set of classes that define various types of electronics equipment 
(computers, cell phones, pagers, digital cameras, etc.). 
Include data values that describe various attributes of the electronics, 
such as the weight, cost, power usage, and the names of the manufacturers. 
Include methods that are named appropriately for each class and that print an appropriate message. 
Create a main driver class to instantiate and exercise several of the classes.
 */
public class ElectronicEquipment 
{
private double cost = 0;
private double powerUsage = 0;
private String manufacturer;
	public ElectronicEquipment(double c, double pu, String m)
	{
		cost = c;
		powerUsage = pu;
		manufacturer = m;
	}
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\n" + "Power usage: " + powerUsage+ "Wh\n" +
				 "Cost: $" + cost + "\n";
	}
}
