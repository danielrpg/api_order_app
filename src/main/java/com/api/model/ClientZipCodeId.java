package com.api.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientZipCodeId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long clientId;
    private Long zipcodeId;

    public ClientZipCodeId() {
    }

    public ClientZipCodeId(Long clientId, Long zipcodeId) {
        this.clientId = clientId;
        this.zipcodeId = zipcodeId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getZipcodeId() {
        return zipcodeId;
    }

    public void setZipcodeId(Long zipcodeId) {
        this.zipcodeId = zipcodeId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((clientId == null) ? 0 : clientId.hashCode());
        result = prime * result
                + ((zipcodeId == null) ? 0 : zipcodeId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClientZipCodeId other = (ClientZipCodeId) obj;
        return Objects.equals(getClientId(), other.getZipcodeId()) && Objects.equals(getZipcodeId(), other.getZipcodeId());
    }
}
