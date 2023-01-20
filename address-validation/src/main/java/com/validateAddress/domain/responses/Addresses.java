package com.validateAddress.domain.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Addresses.Builder.class)
public class Addresses {

	@JsonProperty("addressid")
	private final String addressId;

	@JsonProperty("addressline1")
	private final String addressLine1;

	@JsonProperty("addressline2")
	private final String addressLine2;

	@JsonProperty("addressline3")
	private final String addressLine3;

	@JsonProperty("addressline4")
	private final String addressLine4;

	@JsonProperty("cityname")
	private final String cityName;

	@JsonProperty("statecode")
	private final String stateCode;

	@JsonProperty("postalcode")
	private final String postalCode;

	@JsonProperty("postalcodeextension")
	private final String postalCodeExtension;

	@JsonProperty("uncertaintyindicator")
	private final String uncertaintyIndicator;

	@JsonProperty("countyname")
	private final String countyName;

	@JsonProperty("countrycode")
	private final String countryCode;

	@JsonProperty("usagecontext")
	private final List<String> usageContext;

	@JsonProperty("verificationstatus")
	private final VerificationStatus verificationStatus;

	public Addresses(final Builder builder) {
		this.addressId = builder.addressid;
		this.addressLine1 = builder.addressline1;
		this.addressLine2 = builder.addressline2;
		this.addressLine3 = builder.addressline3;
		this.addressLine4 = builder.addressline4;
		this.cityName = builder.cityname;
		this.stateCode = builder.statecode;
		this.postalCode = builder.postalcode;
		this.postalCodeExtension = builder.postalcodeextension;
		this.uncertaintyIndicator = builder.uncertaintyindicator;
		this.countyName = builder.countyname;
		this.countryCode = builder.countrycode;
		this.usageContext = builder.usageContext;
		this.verificationStatus = builder.verificationstatus;
	}

	public String getAddressId() {
		return addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getPostalCodeExtension() {
		return postalCodeExtension;
	}

	public String getUncertaintyIndicator() {
		return uncertaintyIndicator;
	}

	public String getCountyName() {
		return countyName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public List<String> getUsageContext() {
		return usageContext;
	}

	public VerificationStatus getVerificationStatus() {
		return verificationStatus;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Builder {
		@JsonProperty("addressid")
		private String addressid;
		@JsonProperty("addressline1")
		private String addressline1;
		@JsonProperty("addressline2")
		private String addressline2;
		@JsonProperty("addressline3")
		private String addressline3;
		@JsonProperty("addressline4")
		private String addressline4;
		@JsonProperty("cityname")
		private String cityname;
		@JsonProperty("statecode")
		private String statecode;
		@JsonProperty("postalcode")
		private String postalcode;
		@JsonProperty("postalcodeextension")
		private String postalcodeextension;
		@JsonProperty("uncertaintyindicator")
		private String uncertaintyindicator;
		@JsonProperty("countyname")
		private String countyname;
		@JsonProperty("countrycode")
		private String countrycode;
		@JsonProperty("usagecontext")
		private List<String> usageContext;
		@JsonProperty("verificationstatus")
		private VerificationStatus verificationstatus;

		public Builder withAddressId(final String addressId) {
			this.addressid = addressId;
			return this;
		}

		public Builder withAddressLine1(final String addressLine1) {
			this.addressline1 = addressLine1;
			return this;
		}

		public Builder withAddressLine2(final String addressLine2) {
			this.addressline2 = addressLine2;
			return this;
		}

		public Builder withAddressLine3(final String addressLine3) {
			this.addressline3 = addressLine3;
			return this;
		}

		public Builder withAddressLine4(final String addressLine4) {
			this.addressline4 = addressLine4;
			return this;
		}

		public Builder withCityName(final String cityName) {
			this.cityname = cityName;
			return this;
		}

		public Builder withStateCode(final String stateCode) {
			this.statecode = stateCode;
			return this;
		}

		public Builder withPostalCode(final String postalCode) {
			this.postalcode = postalCode;
			return this;
		}

		public Builder withPostalCodeExtension(final String postalCodeExtension) {
			this.postalcodeextension = postalCodeExtension;
			return this;
		}

		public Builder withUncertaintyIndicator(final String uncertaintyIndicator) {
			this.uncertaintyindicator = uncertaintyIndicator;
			return this;
		}

		public Builder withCountyname(final String countyname) {
			this.countyname = countyname;
			return this;
		}

		public Builder withCountrycode(final String countrycode) {
			this.countrycode = countrycode;
			return this;
		}

		public Builder withUsageContext(final List<String> usageContext) {
			this.usageContext = usageContext;
			return this;
		}

		public Builder withVerificationStatus(final VerificationStatus verificationStatus) {
			this.verificationstatus = verificationStatus;
			return this;
		}

		public Addresses build() {
			return new Addresses(this);
		}
	}

}
