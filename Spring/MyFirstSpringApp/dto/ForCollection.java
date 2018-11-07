package org.jsp.setterpackage.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForCollection
{
	private Set<Integer> set;
	
	private List<String> list;
	
	private Map<Integer, Character> map;
	
	
	
	public ForCollection()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<Integer, Character> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Character> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ForCollection [set=" + set + ", list=" + list + ", map=" + map + "]";
	}
}
