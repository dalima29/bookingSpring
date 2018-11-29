package it.ariadne.bookingspring.entity;

public interface Risorsa {
	public int getLimite();
	public void setLimite(int limite);
	public String getTipo();
	public void setTipo(String tipo);
	public String getNome();
	public void setNome(String nome);
	public Long getId();
	public void setId(Long id);
}
