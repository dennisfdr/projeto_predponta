package com.br.predponta.app.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rranthum
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cat_codigo")
    private Integer catCodigo;
    @Basic(optional = false)
    @Column(name = "cat_descricao")
    private String catDescricao;
    

    public Categoria() {
    }

    public Categoria(Integer catCodigo) {
        this.catCodigo = catCodigo;
    }

    public Categoria(Integer catCodigo, String catDescricao) {
        this.catCodigo = catCodigo;
        this.catDescricao = catDescricao;
    }

    public Integer getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(Integer catCodigo) {
        this.catCodigo = catCodigo;
    }

    public String getCatDescricao() {
        return catDescricao;
    }

    public void setCatDescricao(String catDescricao) {
        this.catDescricao = catDescricao;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catCodigo != null ? catCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.catCodigo == null && other.catCodigo != null) || (this.catCodigo != null && !this.catCodigo.equals(other.catCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Categoria[ catCodigo=" + catCodigo + " ]";
    }
    
}

