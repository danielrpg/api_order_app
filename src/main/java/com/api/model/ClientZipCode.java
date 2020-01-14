package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "client_zip_codes")
public class ClientZipCode extends AuditModel {

    @EmbeddedId
    private ClientZipCodeId primaryKey = new ClientZipCodeId();

    @NotNull
    @Size(max = 500)
    @Column(name = "client_direction")
    private String clientDirection;

    @NotNull
    @Size(max = 200)
    @Column(name = "client_telephone")
    private String clientTelephone;

    @ManyToOne
    @MapsId("clientId")
    private Client client;

    @ManyToOne
    @MapsId("zipcodeId")
    private ZipCode zipCode;

    public ClientZipCode(@NotNull @Size(max = 500) String clientDirection, @NotNull @Size(max = 200) String clientTelephone, Client client, ZipCode zipCode) {
        this.clientDirection = clientDirection;
        this.clientTelephone = clientTelephone;
        this.client = client;
        this.zipCode = zipCode;
    }

    public String getClientDirection() {
        return clientDirection;
    }

    public void setClientDirection(String clientDirection) {
        this.clientDirection = clientDirection;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    @Transient
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Transient
    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }
}
