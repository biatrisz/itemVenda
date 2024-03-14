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
@Table (name = "Produto" )
public class produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "descricao", nullable = false, length = 255)
	private String descricao;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "preco", nullable = false, length = 255)
	private double preco;

	public produto (String descricao , String nome, double preco) {
		this.descricao = descricao;
		this.nome = nome;
		this.preco = preco;
		}
	
	
}
