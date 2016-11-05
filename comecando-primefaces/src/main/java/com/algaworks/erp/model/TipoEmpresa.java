/*
 * @(#)TipoEmpresa.java
 *
 * Copyright 2014-2014, Ricardo Rodrigues.
 * @ricardojosers
 * 
 * Todos os direitos reservados.
 */
 
package com.algaworks.erp.model;


public enum TipoEmpresa {
    
    MEI("Microempreendedor Individual"),
    EIRELI("Empresa Individual de Responsabilidade Limitada"),
    LTDA("Sociedade Limitada"),
    SA("Sociedade Anônima");
    
    private String descricao;
    
    TipoEmpresa(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
