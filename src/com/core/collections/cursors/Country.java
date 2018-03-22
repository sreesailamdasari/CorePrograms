package com.core.collections.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.core.util.Person;

//If this.cuntryId < country.countryId:then compare method will return -1
//If this.countryId > country.countryId:then compare method will return 1
//If this.countryId==country.countryId:then compare method will return 0
public class Country implements Comparable<Country> {
	int countryId;
	String countryName;

	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	@Override
	public int compareTo(Country country) {
		// Country country = (Country) arg0;
		// return (this.countryName < country.countryName) ? -1 : (this.countryName >
		// country.countryName) ? 1 : 0;
		return Character.toString(this.countryName.charAt(0))
				.compareToIgnoreCase(Character.toString(country.countryName.charAt(0)));
	}

	static Comparator<Country> countryIdComparator = new Comparator<Country>() {
		@Override
		public int compare(Country obj1, Country obj2) {
			if (obj1.countryId < obj2.countryId)
				return -1;
			else if (obj1.countryId > obj2.countryId)
				return 1;
			else
				return 0;
		}
	};

	static Comparator<Country> countryNameComparator = new Comparator<Country>() {
		@Override
		public int compare(Country obj1, Country obj2) {
			return obj1.getCountryName().compareTo(obj2.getCountryName());
		}
	};

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

	public static void main(String[] args) {
		Country country = new Country(1, "UIndia");
		Country country1 = new Country(3, "US");
		Country country2 = new Country(2, "Aus");

		List<Country> list = new ArrayList<>();
		list.add(country);
		list.add(country1);
		list.add(country2);
		System.out.println("Before sort \n" + list);
		// Collections.sort(list); //comarable
		// Collections.sort(list, countryIdComparator); //comparator before java 7
		list.sort(Comparator.comparing(Country::getCountryName).thenComparing(Country::getCountryName)); // using lambda
		System.out.println("After sort \n" + list);

	}
}