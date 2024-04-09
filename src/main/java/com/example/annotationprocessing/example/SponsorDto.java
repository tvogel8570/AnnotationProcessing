package com.example.annotationprocessing.example;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

public record SponsorDto(
        Long id,
        @NotBlank @Length(max = 15) String sponsorType,
        @NotBlank @Length(max = 25) String sponsorName,
        @NotBlank @Length(max = 50) String sailingVenue,
        @Length(max = 25) String streetAddress,
        @Length(max = 30) String city,
        @Length(max = 2) String state,
        @Length(max = 9) String postalCode,
        @Email String emailAddress,
        @NotBlank String webPage,
        @Length(max = 15) String primaryPhone,
        @Length(max = 25) String primaryContact)
        implements Serializable {
    public static final class SponsorDtoBuilder {
        private Long id;
        private @NotBlank
        @Length(max = 15) String sponsorType;
        private @NotBlank
        @Length(max = 25) String sponsorName;
        private @NotBlank
        @Length(max = 50) String sailingVenue;
        private @Length(max = 25) String streetAddress;
        private @Length(max = 30) String city;
        private @Length(max = 2) String state;
        private @Length(max = 9) String postalCode;
        private @Email String emailAddress;
        private @NotBlank String webPage;
        private @Length(max = 15) String primaryPhone;
        private @Length(max = 25) String primaryContact;

        private SponsorDtoBuilder() {
        }

        public static SponsorDtoBuilder aSponsorDto() {
            return new SponsorDtoBuilder();
        }

        public SponsorDtoBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public SponsorDtoBuilder withSponsorType(String sponsorType) {
            this.sponsorType = sponsorType;
            return this;
        }

        public SponsorDtoBuilder withSponsorName(String sponsorName) {
            this.sponsorName = sponsorName;
            return this;
        }

        public SponsorDtoBuilder withSailingVenue(String sailingVenue) {
            this.sailingVenue = sailingVenue;
            return this;
        }

        public SponsorDtoBuilder withStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public SponsorDtoBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public SponsorDtoBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public SponsorDtoBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public SponsorDtoBuilder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public SponsorDtoBuilder withWebPage(String webPage) {
            this.webPage = webPage;
            return this;
        }

        public SponsorDtoBuilder withPrimaryPhone(String primaryPhone) {
            this.primaryPhone = primaryPhone;
            return this;
        }

        public SponsorDtoBuilder withPrimaryContact(String primaryContact) {
            this.primaryContact = primaryContact;
            return this;
        }

        public SponsorDto build() {
            return new SponsorDto(id, sponsorType, sponsorName, sailingVenue, streetAddress, city, state, postalCode, emailAddress,
                    webPage, primaryPhone, primaryContact);
        }
    }
}