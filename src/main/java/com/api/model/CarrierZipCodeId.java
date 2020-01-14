package com.api.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CarrierZipCodeId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long carrierId;
    private Long zipcodeId;

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
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
                + ((carrierId == null) ? 0 : carrierId.hashCode());
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
        CarrierZipCodeId other = (CarrierZipCodeId) obj;
        return Objects.equals(getCarrierId(), other.getZipcodeId()) && Objects.equals(getZipcodeId(), other.getZipcodeId());
    }
}
