package com.v50.comunica;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.appengine.repackaged.com.google.gson.Gson;
import com.google.appengine.repackaged.com.google.gson.GsonBuilder;
import com.v50.logic.Logic;
import com.v50.model.Servico;

@Path("/disp-serv")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.APPLICATION_JSON)
public class ListaServicosDisponiveis {

	@GET
	@Path("lista")
	public String getList() {
		ArrayList<Servico> servicos = Logic.buscaServicos();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJsonTree(servicos).toString();
	}
}
