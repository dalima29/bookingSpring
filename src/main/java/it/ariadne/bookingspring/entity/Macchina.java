package it.ariadne.bookingspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Macchina")

public class Macchina implements Risorsa {
	
	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;
	@Column(name = "Limite", nullable = false)
	private int limite;//numero posti macchina
	@Column(name = "Nome", length=64, nullable = false)
	private String nome;
	@Column(name = "Tipo", length=64, nullable = false)
	private String tipo;
	
	public Macchina () {
	}
	@Override
    public Long getId() {
        return id;
    }
	@Override
    public void setId(Long id) {
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

