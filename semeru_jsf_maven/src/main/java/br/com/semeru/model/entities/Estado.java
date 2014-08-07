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
@Table(name="estado")
public class Estado implements Serializable{
    
    //SERIALIZABLE
    private static final long serialVersionUID = 1L;
    
    //ATRIBUTOS
    @Id
    @GeneratedValue
    @Column(name="IdEstado", nullable=false)
    private Integer idEstado;
    
    @Column(name="Nome", nullable=false, length=40)
    private String nome;
    
    //RELACIONAMENTO COM A ENTIDADE ENDERECO
    @OneToMany(mappedBy = "estado", fetch=FetchType.LAZY)
    @ForeignKey(name="EstadoEndereco")
    private List<Endereco> enderecos;
    
    //CONSTRUTOR
    public Estado() {
    
    }
    
    //GETTERS AND SETTERS
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //EQUALS AND HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.idEstado != null ? this.idEstado.hashCode() : 0);
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
        final Estado other = (Estado) obj;
        if (this.idEstado != other.idEstado && (this.idEstado == null || !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }
    
}
