package be.pxl.week3.opdracht1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import sun.net.www.content.text.plain;

public class Gearbox {

	private int maxGears;
	private boolean clutchIsIn;
	private int currentGear;
	private List<Gear> array = new ArrayList<>();

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		for (int i = 0; i < maxGears; i++) {
			Gear newGear = new Gear();
			newGear.gearNumber = i;
			newGear.ratio = i * 5.3;
			addGear(newGear);
		}
	}

	public void operateClutch(boolean in) {
		clutchIsIn = in;
	}

	private void addGear(Gear gear) {
		array.add(gear);
	}

	public void changeGear(int newgear) {
		if (clutchIsIn == true) {
			if (newgear < maxGears) {
				System.out.println("Gear : " + newgear + " Selected.");
				currentGear = newgear;
			}
		} else {
			System.out.println("GRRAAAHHGG");
			System.out.println("Gear : 0 Selected." );
			currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if (clutchIsIn == true) {
			System.out.println("GRRAAAHGG");
			return 0;
		}else {
			return array.get(currentGear).driveSpeed(revs);
		}
	}

	public class Gear {
		private int gearNumber;
		private double ratio;

		public double driveSpeed(int revs) {
			double param;
			param = revs * ratio;

			return param;
		}
	}
}
