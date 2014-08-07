package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
    
    //SERIALIZABLE
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdEndereco", nullable=false)
    private Integer idEndereco;
    
    @Column(name="Bairo", length=80)
    private String bairro;
    
    @Column(name="CEP", length=9)
    private String cep;
    
    @Column(name="Numero")
    private Integer numero;
    
    @Column(name="Complemento")
    private String nomeLogradouro;
    
    
}
