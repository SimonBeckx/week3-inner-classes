package be.pxl.week3.opdracht1;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
	
	private int maxGears;
	private boolean clutchIsIn;
	private List<Gear> array = new ArrayList<>();
	
	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
	}
	
	public void operateClutch(boolean in) {
		clutchIsIn = in;
	}
	
	public void addGear(Gear gear) {
		array.add(gear);
	}
	
	public class Gear {
		private int gearNumber;
		private double ratio;
		
		public double driveSpeed(int revs) {
			double param;
			param = revs*ratio;
			
			return param;
		}
	}
	
	
}
	
