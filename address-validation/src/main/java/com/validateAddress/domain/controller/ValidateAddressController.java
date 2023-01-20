package com.validateAddress.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.validateAddress.domain.requests.ValidateAddressRequest;
import com.validateAddress.domain.responses.Addresses;
import com.validateAddress.domain.responses.ValidateAddressResponse;
import com.validateAddress.domain.responses.VerificationStatus;

@RestController
public class ValidateAddressController {

	@PostMapping(path = "/common/v1/addresses", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ValidateAddressResponse postValidateAddress(@RequestHeader final HttpHeaders httpHeaders,
			@RequestBody final ValidateAddressRequest requestBody) throws Exception {
		return dovalidateAddress(requestBody);
	}

	private ValidateAddressResponse dovalidateAddress(ValidateAddressRequest requestBody) throws Exception {
		System.out.println(requestBody.getaddressline1() + "**********");
		System.out.println(requestBody.getcityname() + "**********");
		System.out.println(requestBody.getpostalcode() + "**********");
		System.out.println(requestBody.getstatecode() + "**********");
		try {
			if (requestBody.getaddressline1().trim().equalsIgnoreCase("12524 Sunrise Valley Dr")
					&& requestBody.getcityname().trim().equalsIgnoreCase("Reston")
					&& requestBody.getpostalcode().trim().equalsIgnoreCase("20191")
					&& requestBody.getstatecode().trim().equalsIgnoreCase("VA")) {
				// Valid address
				List<Addresses> addresses = new ArrayList<>();
				
				List<String> usage = new ArrayList<>();
				usage.add("PPU");
				usage.add("MAILING");
				usage.add("BILLING");
				usage.add("E_911");
				usage.add("USER");
				
				addresses.add(new Addresses.Builder().withAddressId("adr_b307d22e-0c89-43b0-a342-30c34c94b072")
						.withAddressLine1(requestBody.getaddressline1())
						.withPostalCode(requestBody.getpostalcode())
						.withPostalCodeExtension("3438")
						.withUncertaintyIndicator("F")
						.withCityName(requestBody.getcityname())
						.withStateCode(requestBody.getstatecode())
						.withCountrycode("US")
						.withUsageContext(usage)
						.withVerificationStatus(new VerificationStatus.Builder().withStatusCode("Exact Match Found")
								.withStatusMessage("EXACT_MATCH").build())
						.build());

				return new ValidateAddressResponse.Builder().withAddresses(addresses).build();
			} else {
				// invalid address
				throw new Exception("Invalid Address");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
}
