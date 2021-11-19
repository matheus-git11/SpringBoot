package com.example.demo.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	private String senha;
	private String numero;
	private String pagamento;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ClIENTE_ID", referencedColumnName = "id")
	private Set<Animal> animais = new HashSet<>();
	
	
	public Cliente(Integer id, String nome, String endereco, String cpf, String email, String senha, String numero,String pagamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.numero = numero;
		this.pagamento = pagamento;
	}


	public String getPagamento() {
		return pagamento;
	}


	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}


	public Cliente() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Set<Animal> getAnimais() {
		return animais;
	}


	public void setAnimais(Set<Animal> animais) {
		this.animais = animais;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
