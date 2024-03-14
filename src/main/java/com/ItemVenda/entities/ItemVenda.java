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
@Table (name = "ItemVenda" )
public class ItemVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "quantidade", nullable = false, length = 100)
	private int quantidade;
	
	@Column(name = "produto_id", nullable = false, length = 100)
	private int produto_id;
	
	@Column(name = "venda_id", nullable = false, length = 100)
	private int venda_id;
	
	@Column(name = "valor_unitario", nullable = false, length = 100)
	private double valor_unitario;
	
	public ItemVenda (int quantidade, int produto_id, int venda_id, double valor_unitario) {
		this.quantidade = quantidade;
		this.produto_id = produto_id;
		this.venda_id = venda_id;
		this.valor_unitario = valor_unitario;
		}
}
