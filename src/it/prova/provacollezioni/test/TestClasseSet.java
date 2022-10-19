package it.prova.provacollezioni.test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import it.prova.provacollezioni.model.ClasseSet;

public class TestClasseSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setTest=new HashSet();
		setTest.add("coppaDIPallavolo");
		setTest.add("coppaDiNuoto");
		
		Map<String,Integer> mapTest = new TreeMap<>();
		mapTest.put("chiave1",3232);
		mapTest.put("chiave2", 4242);
		
		ClasseSet proviamoTest= new ClasseSet(setTest, mapTest);
		String coppaTest="coppaNuoto";
		System.out.println(" "+proviamoTest.eliminoIlCorrispondente(coppaTest)); 
		for (String str:proviamoTest.getTestSet()) {
			System.out.println(str);
		}
		Integer numeroTel=4242;
		System.out.println(" "+proviamoTest.prendoIlCorrispondente(numeroTel));
	}

}
