package com.validateAddress.domain.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = VerificationStatus.Builder.class)
public class VerificationStatus {
	@JsonProperty("statusCode")
	private final String statusCode;

	@JsonProperty("statusMessage")
	private final String statusMessage;

	public VerificationStatus(final Builder builder) {
		this.statusCode = builder.statuscode;
		this.statusMessage = builder.statusmessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Builder {
		@JsonProperty("statuscode")
		private String statuscode;

		@JsonProperty("statusmessage")
		private String statusmessage;

		public Builder withStatusCode(final String statusCode) {
			this.statuscode = statusCode;
			return this;
		}

		public Builder withStatusMessage(final String statusMessage) {
			this.statusmessage = statusMessage;
			return this;
		}

		public VerificationStatus build() {
			return new VerificationStatus(this);
		}
	}
}
