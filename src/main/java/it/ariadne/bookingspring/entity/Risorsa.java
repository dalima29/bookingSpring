package it.ariadne.bookingspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Risorsa",
uniqueConstraints = { //
        @UniqueConstraint(name = "unico_nome", columnNames = "Nome") })

public class Risorsa {
	
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable=false)
    private Long id;
	@Column(name = "Limite", nullable = false)
	private int limite;//numero posti macchina
	@Column(name = "Nome", length=64, nullable = false)
	private String nome;
	@Column(name = "Tipo", length=64, nullable = false)
	private RisorsaEnum tipo;
	
	public Risorsa () {
	}
	
	public Risorsa (String nome, int limite, RisorsaEnum tipo) {
		this.limite = limite;
		this.nome = nome;
		this.tipo = tipo;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public int getLimite () {
		return this.limite;
	}

	public void setLimite (int limite) {
		this.limite = limite;
	}

	public RisorsaEnum getTipo () {
		return this.tipo;
	}
	
	public void setTipo (RisorsaEnum tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
