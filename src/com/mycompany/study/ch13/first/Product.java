package com.mycompany.study.ch13.first;

public class Product<K, M> {

	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	private K kind;
	private M model;
	
	
	
}
