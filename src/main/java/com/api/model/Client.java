package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @NotNull
    @Size(max = 200)
    @Column()
    private String clientName;

    @Size(max = 250)
    @Column(unique = true)
    private String clientLastName;

    @Size(max = 250)
    @Column()
    private String clientCellphone;

    @Size(max = 500)
    @Column()
    private String direction;

    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL
    )
    private Set<ClientZipCode> clientZipCodes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientCellphone() {
        return clientCellphone;
    }

    public void setClientCellphone(String clientCellphone) {
        this.clientCellphone = clientCellphone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<ClientZipCode> getClientZipCodes() {
        return clientZipCodes;
    }

    public void setClientZipCodes(Set<ClientZipCode> clientZipCodes) {
        this.clientZipCodes = clientZipCodes;
    }
}
