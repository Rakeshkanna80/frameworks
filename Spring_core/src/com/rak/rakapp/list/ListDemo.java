package com.rak.rakapp.list;

import java.util.List;

public class ListDemo {
	private List<String> list;

	public void setList(List<String> list) {
		System.out.println("invoked \t" + list);
		this.list = list;
	}

}
