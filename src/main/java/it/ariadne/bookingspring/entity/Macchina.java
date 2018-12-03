package it.ariadne.bookingspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Macchina")

public class Macchina implements RisorsaDACANCELLARE {
	
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable=false)
    private long id;
	@Column(name = "Limite", nullable = false)
	private int limite;//numero posti macchina
	@Column(name = "Nome", length=64, nullable = false)
	private String nome;
	@Column(name = "Tipo", length=64, nullable = false)
	private String tipo;
	
	public Macchina () {
	}
	
	public Macchina (String nome, int limite) {
		this.limite = limite;
		this.nome = nome;
	}
	@Override
    public long getId() {
        return id;
    }
	@Override
    public void setId(long id) {
        this.id = id;
    }
	@Override
	public int getLimite () {
		return this.limite;
	}
	@Override
	public void setLimite (int limite) {
		this.limite = limite;
	}
	@Override
	public String getTipo () {
		return "Macchina";
	}
	@Override
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

}

