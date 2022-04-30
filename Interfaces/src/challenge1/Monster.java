package challenge1;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

	private String name;
	private int hitPoint;
	private int strength;
	
	
	
	public Monster(String name, int hitPoint, int strength) {
		this.name = name;
		this.hitPoint = hitPoint;
		this.strength = strength;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHitPoint() {
		return hitPoint;
	}



	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}



	public int getStrength() {
		return strength;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}


	
	

	@Override
	public String toString() {
		return "Monster [name=" + name + ", hitPoint=" + hitPoint + ", strength=" + strength + "]";
	}



	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		
		values.add(0, this.name);
		values.add(1, ""+this.hitPoint);
		values.add(2, ""+this.strength);
		
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size()>0) {
			this.name = savedValues.get(0);
			this.hitPoint = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
		
	}
	
}
