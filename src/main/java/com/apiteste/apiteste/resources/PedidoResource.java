package com.apiteste.apiteste.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apiteste.apiteste.domain.Pedido;
import com.apiteste.apiteste.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(value = "/{numped}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer numped) throws ParseException {
		Pedido pedido = pedidoService.findById(numped);
		return ResponseEntity.ok().body(pedido);
	}

}
