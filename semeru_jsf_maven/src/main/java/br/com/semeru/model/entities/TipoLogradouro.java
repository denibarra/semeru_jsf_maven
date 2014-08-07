package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipologradouro")
public class TipoLogradouro implements Serializable {
    
    //SERIALIZABLE
    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    @Id
    @GeneratedValue
    @Column(name="IdTipoLogradouro", nullable=false)
    private Integer idTipoLogradouro;
    
    @Column(name="DescricaoTipoLogradouro", nullable=false, length=35)
    private String descricaoTipoLogradouro;
    
    //RELACIONAMENTO COM A ENTIDADE ENDERECO
    @OneToMany(mappedBy = "tipoendereco", fetch=FetchType.LAZY)
    @ForeignKey(name="Endereco_TipoEndereco")
    private List<Endereco> enderecos;
    
    //CONSTRUTOR
    public TipoLogradouro() {    
        
    }

    //GETTERS AND SETTERS
    public Integer getIdTipoLogradouro() {
        return idTipoLogradouro;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoLogradouro = idTipoLogradouro;
    }

    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    //EQUALS AND HASHCODE
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.idTipoLogradouro != null ? this.idTipoLogradouro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (this.idTipoLogradouro != other.idTipoLogradouro && (this.idTipoLogradouro == null || !this.idTipoLogradouro.equals(other.idTipoLogradouro))) {
            return false;
        }
        return true;
    }
    
}
