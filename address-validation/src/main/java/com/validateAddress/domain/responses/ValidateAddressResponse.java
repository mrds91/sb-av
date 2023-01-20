package com.validateAddress.domain.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = ValidateAddressResponse.Builder.class)
public class ValidateAddressResponse {

	@JsonProperty("addresses")
	private final List<Addresses> addresses;

	public ValidateAddressResponse(final Builder builder) {
	    this.addresses = builder.addresses;
	  }

	public List<Addresses> getAddresses() {
		return addresses;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Builder {
		@JsonProperty("addresses")
		private List<Addresses> addresses;

		public Builder withAddresses(final List<Addresses> addresses) {
			this.addresses = addresses;
			return this;
		}

		public ValidateAddressResponse build() {
			return new ValidateAddressResponse(this);
		}
	}

}
