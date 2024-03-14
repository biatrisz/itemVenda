package com.ItemVenda.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "cliente" )
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "email", nullable = false,length = 255)
	private String email;
	
	@Column(name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	public cliente (String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
}
}