package net.biezynski.GeneratorCytatow.glowny;

import java.util.ArrayList;
import java.util.List;

import net.biezynski.GeneratorCytatow.GUI.GraficznyInterfejs;


public class glowna{

	
	public static void main(String[] args) {
		
		
		List<String> ListaCytatow = new ArrayList<String>();
		ListaCytatow.add("Losowy Cytat nr 1");
		ListaCytatow.add("Losowy Cytat nr 2");
		ListaCytatow.add("Losowy Cytat nr 3");
		ListaCytatow.add("Losowy Cytat nr 4");
		ListaCytatow.add("Losowy Cytat nr 5");
		ListaCytatow.add("Losowy Cytat nr 6");
		ListaCytatow.add("Losowy Cytat nr 7");
		ListaCytatow.add("Losowy Cytat nr 8");
		
	//	System.out.println(ListaCytatow.size());
		
	int Losowaliczba = (int) (Math.random()* ListaCytatow.size() );
		
		System.out.println(ListaCytatow.get(Losowaliczba));
		
		
		
		new GraficznyInterfejs().setVisible(true);
		
	}

}
