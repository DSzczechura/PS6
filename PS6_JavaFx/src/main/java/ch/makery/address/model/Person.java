package ch.makery.address.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;
import domain.PersonDomainModel;

public class Person extends PersonDomainModel {
	
	private StringProperty firstNameProperty;
	private StringProperty lastNameProperty;
	private StringProperty streetProperty;
	private StringProperty cityProperty;
	private IntegerProperty postalCodeProperty;
	private ObjectProperty<Date> birthdayProperty;
	
	
    public Person() {
        this.setFirstNameProperty("");
        this.setLastNameProperty("");
        this.setStreetProperty("");
        this.setCityProperty("");
        this.setPostalCodeProperty(00000);
        this.setBirthdayProperty(new Date());
    }
    
    public Person(String firstName, String lastName, String street, String city, int postalCode, Object birthday ) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setStreet(street);
        this.setCity(city);
        this.setPostalCode(postalCode);
        this.setBirthday((Date) birthday);
    }

    public StringProperty firstNameProperty() {
    	return this.firstNameProperty;
    }
    
	public final String getFirstNameProperty() {
		return this.getFirstName();
	}

	public final void setFirstNameProperty(String firstName) {
		this.firstNameProperty.set(firstName);
		this.setFirstName(firstName);
	}

    public StringProperty lastNameProperty() {
    	return this.lastNameProperty;
    }
    
	public final String getLastNameProperty() {
		return this.getLastName();
	}

	public final void setLastNameProperty(String lastName) {
		this.lastNameProperty.set(lastName);
		this.setLastName(lastName);
	}

	public StringProperty streetProperty() {
		return this.streetProperty;
	}

	public final String getStreetProperty() {
		return this.getStreet();
	}

	public final void setStreetProperty(String street) {
		this.streetProperty.set(street);
		this.setStreet(street);
	}

	public StringProperty cityProperty() {
		return this.cityProperty;
	}
	
	public final String getCityProperty() {
		return this.getCity();
	}
	
	public final void setCityProperty(String city) {
		this.cityProperty.set(city);
		this.setCity(city);
	}
	
	public IntegerProperty postalCodeProperty() {
		return this.postalCodeProperty;
	}

	public final Integer getPostalCodeProperty() {
		// return postalCodeProperty.get();
		return this.getPostalCode();
	}

	public final void setPostalCodeProperty(Integer postalCode) {
		this.postalCodeProperty.set(postalCode);
		this.setPostalCode(postalCode);
	}

	public ObjectProperty<Date> birthdayProperty() {
		return this.birthdayProperty;
	}

	public final Date getBirthdayProperty() {
		return this.getBirthday();
	}

	public void setBirthdayProperty(Date birthday) {
		this.birthdayProperty.set(birthday);
		this.setBirthday(birthday);
	}

}