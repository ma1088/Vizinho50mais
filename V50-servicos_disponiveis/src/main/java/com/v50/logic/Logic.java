package com.v50.logic;

import java.util.ArrayList;

import com.v50.model.Servico;

public final class Logic {
	public static ArrayList<Servico> buscaServicos(){
		ArrayList<Servico> servicos = new ArrayList<Servico>();
		servicos.add(new Servico(1, "Cuidador de Plantas e Pets", "Regar plantas, podar. Alimentar e passear com pets."));
		servicos.add(new Servico(2, "Acompanhante externo", "Atividades externas ao lar. Levar a lugares como escola, mercado, shopping, médico."));
		servicos.add(new Servico(3, "Aulas particulares", "Reforço escolar, música, informática."));
		return servicos;
	}
}
