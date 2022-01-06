package com.rsoft.netsuit.soap.repo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.soap.obj.countries.Country;
import com.soap.obj.countries.Currency;
 
@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
	Country usa = new Country();
	usa.setCapital("Washingaton DC");
	usa.setCurrency(Currency.USD);
	usa.setName("United States of America");
	usa.setPopulation(123456789);
	countries.putIfAbsent("US", usa);
	
	Country uk = new Country();
	uk.setCapital("London");
	uk.setCurrency(Currency.GBP);
	uk.setName("United Kingdom");
	uk.setPopulation(555555);
	countries.putIfAbsent("UK", uk);
    }

    public Country findCountry(String name) {
	return countries.get(name);
    }
}