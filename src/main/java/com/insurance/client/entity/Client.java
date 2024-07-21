package com.insurance.client.entity;

import com.insurance.insurance.entity.InsurancePolicy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @Column(name ="clientId")
    private int clientId;
    @Column(name ="clientName")
    private String clientName;
    @Column(name ="clientDateOfBirth")
    private String clientDateOfBirth;
    @Column(name ="clientAddress")
    private String clientAddress;
    @Column(name ="clientContactInformation")
    private long clientContactInformation;


    @ManyToOne
    @JoinColumn(name="policyId")
    private InsurancePolicy insurancePolicy;

    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getClientDateOfBirth() {
        return clientDateOfBirth;
    }
    public void setClientDateOfBirth(String clientDateOfBirth) {
        this.clientDateOfBirth = clientDateOfBirth;
    }
    public String getClientAddress() {
        return clientAddress;
    }
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
    public long getClientContactInformation() {
        return clientContactInformation;
    }
    public void setClientContactInformation(long clientContactInformation) {
        this.clientContactInformation = clientContactInformation;
    }
    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }
    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }


}