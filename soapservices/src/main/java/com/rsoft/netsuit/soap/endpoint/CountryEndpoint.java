package com.rsoft.netsuit.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.rsoft.netsuit.soap.repo.CountryRepository;
import com.soap.obj.countries.GetCountryRequest;
import com.soap.obj.countries.GetCountryResponse;

 

@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "urn:com:soap:obj:countries";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
	this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
	GetCountryResponse response = new GetCountryResponse();
	response.setCountry(countryRepository.findCountry(request.getName()));
	System.out.println("Received code "+ request.getName());
	return response;
    }
}