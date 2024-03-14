package com.ItemVenda.entities;

import java.math.BigInteger;
import java.sql.Date;

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
@Table (name = "Venda" )
public class venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "data_venda", nullable = false, length = 255)
	private Date data_venda;
	
	@Column(name = "cliente_id", nullable = false, length = 255)
	private BigInteger cliente_id;
	
	public venda (Date data_venda, BigInteger cliente_id) {
		this.data_venda = data_venda;
		this.cliente_id = cliente_id;
}
}