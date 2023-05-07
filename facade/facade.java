package Projeto_Padrao.facade;

import subA.crm.CrmService;
import subB.cep.CepApi;

public class Facade {

	public void Cliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperaCidade(cep);
		String estado = CepApi.getInstancia().recuperaEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}