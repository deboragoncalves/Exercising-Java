package com.motoboy.tarefa02;

// Classe que cont�m os dados do Motoboy: nome e nota. 
// Todos os atributos como public para que possa captar o que o usu�rio leu.
// 2 construtores: Vazio e receber o que o usu�rio digitou ou com os 2 atributos.
// M�todo ToString() para deixar o main enxuto.

public class Dados {
	public int nota;
	public String nome;
	
	public Dados() {}
	
	public Dados(String name, int note) {
		this.nome = name;
		this.nota = note;
	}
	
	@Override
	public String toString() {
		return "Nome do Motoboy: " + this.nome +
				"\nNota do Motoboy: " + this.nota;
	}
}
