/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.africomgroup.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jordy
 */
@Entity
@Table(name = "QUOTE_REQUEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuoteRequest.findAll", query = "SELECT q FROM QuoteRequest q"),
    @NamedQuery(name = "QuoteRequest.findById", query = "SELECT q FROM QuoteRequest q WHERE q.id = :id"),
    @NamedQuery(name = "QuoteRequest.findByRequestDate", query = "SELECT q FROM QuoteRequest q WHERE q.requestDate = :requestDate"),
    @NamedQuery(name = "QuoteRequest.findByStatus", query = "SELECT q FROM QuoteRequest q WHERE q.status = :status")})
public class QuoteRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "REQUEST_DATE")
    @Temporal(TemporalType.DATE)
    private Date requestDate;
    @Size(max = 200)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CUST_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer custId;
    @OneToMany(mappedBy = "requestId", fetch = FetchType.EAGER)
    private Collection<QuoteRequestDetails> quoteRequestDetailsCollection;

    public QuoteRequest() {
    }

    public QuoteRequest(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }

    @XmlTransient
    public Collection<QuoteRequestDetails> getQuoteRequestDetailsCollection() {
        return quoteRequestDetailsCollection;
    }

    public void setQuoteRequestDetailsCollection(Collection<QuoteRequestDetails> quoteRequestDetailsCollection) {
        this.quoteRequestDetailsCollection = quoteRequestDetailsCollection;
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
        if (!(object instanceof QuoteRequest)) {
            return false;
        }
        QuoteRequest other = (QuoteRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.africomgroup.entities.QuoteRequest[ id=" + id + " ]";
    }
    
}
