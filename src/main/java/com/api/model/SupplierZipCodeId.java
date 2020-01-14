package com.api.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SupplierZipCodeId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long supplierId;
    private Long zipcodeId;

    public SupplierZipCodeId() {
    }

    public SupplierZipCodeId(Long supplierId, Long zipcodeId) {
        super();
        this.supplierId = supplierId;
        this.zipcodeId = zipcodeId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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
                + ((supplierId == null) ? 0 : supplierId.hashCode());
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
        SupplierZipCodeId other = (SupplierZipCodeId) obj;
        return Objects.equals(getSupplierId(), other.getSupplierId()) && Objects.equals(getZipcodeId(), other.getZipcodeId());
    }
}
