/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jordy
 */
@Entity
@Table(name = "QUOTE_REQUEST_DETAILS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuoteRequestDetails.findAll", query = "SELECT q FROM QuoteRequestDetails q"),
    @NamedQuery(name = "QuoteRequestDetails.findById", query = "SELECT q FROM QuoteRequestDetails q WHERE q.id = :id")})
public class QuoteRequestDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "SERVICE_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Service serviceId;
    @JoinColumn(name = "REQUEST_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private QuoteRequest requestId;

    public QuoteRequestDetails() {
    }

    public QuoteRequestDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }

    public QuoteRequest getRequestId() {
        return requestId;
    }

    public void setRequestId(QuoteRequest requestId) {
        this.requestId = requestId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteRequestDetails)) {
            return false;
        }
        QuoteRequestDetails other = (QuoteRequestDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.africomgroup.entities.QuoteRequestDetails[ id=" + id + " ]";
    }
    
}
