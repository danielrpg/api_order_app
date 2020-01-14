package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "carrier_zip_codes")
public class CarrierZipCode extends AuditModel {

    @EmbeddedId
    private CarrierZipCodeId primaryKey = new CarrierZipCodeId();

    @Size(max = 250)
    @Column(name = "contact_name")
    private String contactName;

    @Size(max = 250)
    @Column(name = "carrier_direction")
    private String carrierDirection;

    @Size(max = 250)
    @Column(name = "carrier_telephone")
    private String carrierTelephone;

    @ManyToOne
    @MapsId("carrierId")
    private Carrier carrier;

    @ManyToOne
    @MapsId("zipcodeId")
    private ZipCode zipCode;

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCarrierDirection() {
        return carrierDirection;
    }

    public void setCarrierDirection(String carrierDirection) {
        this.carrierDirection = carrierDirection;
    }

    public String getCarrierTelephone() {
        return carrierTelephone;
    }

    public void setCarrierTelephone(String carrierTelephone) {
        this.carrierTelephone = carrierTelephone;
    }

    @Transient
    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @Transient
    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }
}
