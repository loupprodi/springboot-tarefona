package br.uniso.tarefona.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "tarefona.dados")
public class Dados implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "sobreNome", nullable = false)
    private String sobreNome;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @Column(name = "ra", nullable = false)
    private Integer ra;

    @Column(name = "curso", nullable = false)
    private String curso;

    @Column(name = "telefone", nullable = false)
    private Long telefone;

}
