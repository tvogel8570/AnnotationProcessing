package com.example.annotationprocessing.example;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "sponsor", uniqueConstraints = {
        @UniqueConstraint(name = "sponsor_business_key", columnNames = {"sponsor_name"})})
public class Sponsor implements Serializable {
    @Serial
    private static final long serialVersionUID = -183298308166390437L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sponsor_seq")
    @SequenceGenerator(name = "sponsor_seq", sequenceName = "sponsor_user_id_seq", allocationSize = 1, initialValue = 100)
    @Column(name = "id", nullable = false)
    private Long id;

    @Version
    @Column(name = "version")
    private Integer version;

    @Column(name = "sponsor_type", nullable = false)
    @NotBlank
    @Length(max = 15)
    private String sponsorType;

    @Column(name = "sponsor_name", nullable = false)
    @NotBlank
    @Length(max = 50)
    private String sponsorName;

    @Column(name = "sailing_venue", nullable = false)
    @NotBlank
    @Length(max = 50)
    private String sailingVenue;

    @Column(name = "street_address")
    @Length(max = 25)
    private String streetAddress;

    @Column(name = "state")
    @Length(max = 2)
    private String state;

    @Column(name = "postal_code")
    @Length(max = 9)
    private String postalCode;

    @Column(name = "email_address")
    @Email
    private String emailAddress;

    @Column(name = "web_page", nullable = false)
    @NotBlank
    private String webPage;

    @Column(name = "primary_phone")
    @Length(max = 25)
    private String primaryPhone;

    @Column(name = "primary_contact")
    @Length(max = 25)
    private String primaryContact;

    @Override
    public final boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy
                ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass()
                : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy
                ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass()
                : this.getClass();
        if (thisEffectiveClass != oEffectiveClass)
            return false;
        Sponsor sponsor = (Sponsor) o;
        return getId() != null && Objects.equals(getId(), sponsor.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy
                ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode()
                : getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "version = " + version + ", " +
                "sponsorType = " + sponsorType + ", " +
                "sponsorName = " + sponsorName + ", " +
                "sailingVenue = " + sailingVenue + ", " +
                "streetAddress = " + streetAddress + ", " +

                "state = " + state + ", " +
                "postalCode = " + postalCode + ", " +
                "emailAddress = " + emailAddress + ", " +
                "webPage = " + webPage + ", " +
                "primaryPhone = " + primaryPhone + ", " +
                "primaryContact = " + primaryContact + ")";
    }

    public static final class SponsorBuilder {
        private Long id;
        private Integer version;
        private @NotBlank
        @Length(max = 15) String sponsorType;
        private @NotBlank
        @Length(max = 50) String sponsorName;
        private @NotBlank
        @Length(max = 50) String sailingVenue;
        private @Length(max = 25) String streetAddress;
        private @Length(max = 2) String state;
        private @Length(max = 9) String postalCode;
        private @Email String emailAddress;
        private @NotBlank String webPage;
        private @Length(max = 25) String primaryPhone;
        private @Length(max = 25) String primaryContact;

        private SponsorBuilder() {
        }

        public static SponsorBuilder aSponsor() {
            return new SponsorBuilder();
        }

        public SponsorBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public SponsorBuilder withVersion(Integer version) {
            this.version = version;
            return this;
        }

        public SponsorBuilder withSponsorType(String sponsorType) {
            this.sponsorType = sponsorType;
            return this;
        }

        public SponsorBuilder withSponsorName(String sponsorName) {
            this.sponsorName = sponsorName;
            return this;
        }

        public SponsorBuilder withSailingVenue(String sailingVenue) {
            this.sailingVenue = sailingVenue;
            return this;
        }

        public SponsorBuilder withStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public SponsorBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public SponsorBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public SponsorBuilder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public SponsorBuilder withWebPage(String webPage) {
            this.webPage = webPage;
            return this;
        }

        public SponsorBuilder withPrimaryPhone(String primaryPhone) {
            this.primaryPhone = primaryPhone;
            return this;
        }

        public SponsorBuilder withPrimaryContact(String primaryContact) {
            this.primaryContact = primaryContact;
            return this;
        }

        public Sponsor build() {
            Sponsor sponsor = new Sponsor();
            sponsor.setId(id);
            sponsor.setVersion(version);
            sponsor.setSponsorType(sponsorType);
            sponsor.setSponsorName(sponsorName);
            sponsor.setSailingVenue(sailingVenue);
            sponsor.setStreetAddress(streetAddress);
            sponsor.setState(state);
            sponsor.setPostalCode(postalCode);
            sponsor.setEmailAddress(emailAddress);
            sponsor.setWebPage(webPage);
            sponsor.setPrimaryPhone(primaryPhone);
            sponsor.setPrimaryContact(primaryContact);
            return sponsor;
        }
    }
}
