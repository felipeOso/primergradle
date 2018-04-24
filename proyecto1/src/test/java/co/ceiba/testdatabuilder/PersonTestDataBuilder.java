package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder() {
	//	super();
		this.name = "Felipe Osorio";
		this.lastName = "Software House";
	}

	public PersonTestDataBuilder withName(String name) {
		this.name =name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person build() {
		return new Person(this.name, this.lastName);
	}
	
	
}
