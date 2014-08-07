package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipoendereco")
public class TipoEndereco implements Serializable{
    
    //SERIALIZABLE
    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    @Id
    @GeneratedValue
    @Column(name="IdTipoEndereco", nullable=false)
    private Integer idTipoEndereco;
    
    @Column(name="DescricaoTipoEndereco", nullable=false, length=35)
    private String descricaoTipoEndereco;
    
    //RELACIONAMENTO COM A ENTIDADE ENDERECO
    @OneToMany
    @ForeignKey(name="Endereco_TipoEndereco")
    private List<Endereco> enderecos;
    
    //CONSTRUTOR
    public TipoEndereco() {
    
    }
    
    //GETTERS AND SETTERS
    public Integer getIdTipoEndereco() {
        return idTipoEndereco;
    }

    public void setIdTipoEndereco(Integer idTipoEndereco) {
        this.idTipoEndereco = idTipoEndereco;
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
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
        int hash = 7;
        hash = 67 * hash + (this.idTipoEndereco != null ? this.idTipoEndereco.hashCode() : 0);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (this.idTipoEndereco != other.idTipoEndereco && (this.idTipoEndereco == null || !this.idTipoEndereco.equals(other.idTipoEndereco))) {
            return false;
        }
        return true;
    }
    
}
