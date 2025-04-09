package com.tnsif.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LaptopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",15,169999));
		laps.add(new Laptop("hp",55,229999));
		laps.add(new Laptop("aa",25,176859));
		
Collections.sort(laps);
for(Laptop l: laps) {
	
	System.out.println(l);
}
		
	}

}
