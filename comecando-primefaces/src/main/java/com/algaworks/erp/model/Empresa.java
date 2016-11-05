/*
 * @(#)Empresa.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.erp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Long id;
    
    @NotEmpty
    @Column(name = "nome_fantasia", nullable = false, length = 80)
    private String nomeFantasia;
    
    @NotEmpty
    @Column(name = "razao_social", nullable = false, length = 120)
    private String razaoSocial;
    
    @NotEmpty
    @CNPJ
    @Column(nullable = false, length = 18)
    private String cnpj;
    
    @NotNull
    @Past
    @Temporal(TemporalType.DATE)
    @Column(name = "data_fundacao")
    private Date dataFundacao;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoEmpresa tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public TipoEmpresa getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpresa tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Empresa other = (Empresa)obj;
        if(id == null) {
            if(other.id != null) return false;
        }
        else if(!id.equals(other.id)) return false;
        return true;
    }

}
