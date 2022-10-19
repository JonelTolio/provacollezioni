package it.prova.provacollezioni.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ClasseSet {
	private Set<String> testSet = new HashSet<>();
	private Map<String, Integer> map = new TreeMap<String, Integer>();

	public ClasseSet(Set<String> testSet, Map<String, Integer> map) {
		super();
		this.testSet = testSet;
		this.map = map;
	}

	public Set<String> getTestSet() {
		return testSet;
	}

	public void setTestSet(Set<String> testSet) {
		this.testSet = testSet;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public boolean eliminoIlCorrispondente(String inputDaConfrontare) {
		for (String st : this.testSet) {
			if (st.equals(inputDaConfrontare)) {
				return true;
			}
		}
		return false;
	}

	public Integer prendoIlCorrispondente( Integer inputConfrontare) {
		for (String key : this.map.keySet()) {
			if (this.map.get(key).equals(inputConfrontare)) {
				return this.map.get(key);
			}
		}
		return 0;
	}
}
