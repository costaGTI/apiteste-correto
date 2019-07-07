package com.apiteste.apiteste.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiteste.apiteste.repositories.PedidoRepository;

import com.apiteste.apiteste.domain.Pedido;
@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	public Pedido findById(Integer numped) {
		Optional<Pedido> pedido = pedidoRepository.findById(numped);
		return pedido.orElse(null);
	}
	

}
