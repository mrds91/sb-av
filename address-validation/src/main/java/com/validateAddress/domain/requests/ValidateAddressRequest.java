package com.validateAddress.domain.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.validateAddress.domain.responses.ValidateAddressResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = ValidateAddressRequest.Builder.class)
public class ValidateAddressRequest {

	@JsonProperty("addressline2")
	private final String addressline2;

	@JsonProperty("postalcode")
	private final String postalcode;

	@JsonProperty("addressline1")
	private final String addressline1;

	@JsonProperty("statecode")
	private final String statecode;

	@JsonProperty("countrycode")
	private final String countrycode;

	@JsonProperty("cityname")
	private final String cityname;

	@JsonProperty("sourcetype")
	private final String sourcetype;

	public ValidateAddressRequest(final Builder builder) {
		this.addressline1 = builder.addressline1;
		this.cityname = builder.cityname;
		this.addressline2 = builder.addressline2;
		this.statecode = builder.statecode;
		this.sourcetype = builder.sourcetype;
		this.postalcode = builder.postalcode;
		this.countrycode = builder.countrycode;
	}

	public String getcityname() {
		return cityname;
	}

	public String getaddressline2() {
		return addressline2;
	}

	public String getpostalcode() {
		return postalcode;
	}

	public String getcountrycode() {
		return countrycode;
	}

	public String getaddressline1() {
		return addressline1;
	}

	public String getsourcetype() {
		return sourcetype;
	}

	public String getstatecode() {
		return statecode;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Builder {

		@JsonProperty("addressline2")
		private String addressline2;

		@JsonProperty("cityname")
		private String cityname;

		@JsonProperty("addressline1")
		private String addressline1;

		@JsonProperty("statecode")
		private String statecode;

		@JsonProperty("postalcode")
		private String postalcode;

		@JsonProperty("sourcetype")
		private String sourcetype;

		@JsonProperty("countrycode")
		private String countrycode;

		public Builder withAddressLine2(final String addressline2) {
			this.addressline2 = addressline2;
			return this;
		}

		public Builder withAddressLine1(final String addressline1) {
			this.addressline1 = addressline1;
			return this;
		}

		public Builder withPostalCode(final String postalcode) {
			this.postalcode = postalcode;
			return this;
		}

		public Builder withCityName(final String cityname) {
			this.cityname = cityname;
			return this;
		}

		public Builder withCountryCode(final String countrycode) {
			this.countrycode = countrycode;
			return this;
		}

		public Builder withSourceType(final String sourcetype) {
			this.sourcetype = sourcetype;
			return this;
		}

		public Builder withStateCode(final String statecode) {
			this.statecode = statecode;
			return this;
		}

		public ValidateAddressRequest build() {
			return new ValidateAddressRequest(this);
		}
	}
}
