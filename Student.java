package com.general;

public class Student {

	private int id;
	private String name;
	private String lastName;
	private String divsion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDivsion() {
		return divsion;
	}

	public void setDivsion(String divsion) {
		this.divsion = divsion;
	}

	public int hashCode() {
		return this.id + this.name.hashCode();
	}

	public boolean equals(Student obj) {
		return (this.id == obj.id && this.name.equals(obj.name));
	}

}
