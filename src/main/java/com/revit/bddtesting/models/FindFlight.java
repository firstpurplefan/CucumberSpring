package com.revit.bddtesting.models;

public interface FindFlight {
	
	public void selectTripType(String type);
	
	public void selectSeatClass(String cl);

	public void passDeparting(String depFrom);

	public void passArrival(String arrTo);

	public void clickFindFlight();

}
