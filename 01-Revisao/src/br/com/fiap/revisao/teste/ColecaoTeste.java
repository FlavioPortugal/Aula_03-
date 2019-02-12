package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColecaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		lista.add("Olá mundo");
		lista.add("Hello World");
		lista.add("Hollo Welt");
		
		//Recuperar posição específica
		System.out.println(lista.get(2));
		System.out.println("   ");

		for (String item : lista) {
			System.out.println(item);
		}
		System.out.println("   ");
		//Não insere valores duplicados
		Set<String> set = new HashSet<>();
		//Adcionar valores no set
		set.add("Lasanha");
		set.add("Pizza");
		set.add("Lasanha");
		
		//Exibir os elementos do set
		
		for (String item2 : set) {
			System.out.println(item2);
		}
		
		//MAP<Chave,Valor>
		System.out.println("MAP");
		Map<String,String> mapa = new HashMap<>();
		
		mapa.put("Brasil", "Brasilia");
		mapa.put("Argentina", "Buenos Aires");
		mapa.put("Italia", "Roma");
		
		
		
		
	}

}
