package com.apiteste.apiteste.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apiteste.apiteste.domain.Pedido;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pedido> findById() throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
		
		Pedido p1 = new Pedido(1000, 12, df.parse("03/07/2019"), "L");
		Pedido p2 = new Pedido(1001, 12, df.parse("03/07/2019"), "F");
		Pedido p3 = new Pedido(1002, 12, df.parse("03/07/2019"), "F");
		
		List<Pedido> lista = new ArrayList();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		return lista;
	}

}
