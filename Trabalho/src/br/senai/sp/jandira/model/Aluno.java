package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Aluno {
	
	private String nome;
	private LocalDate dataDeNascimento;
	private char sexo;
	private double peso;
	private double altura;
	private String nivelAtividade;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	
	public void setDataDeNascimento(LocalDate DataDeNascimento) {
		this.dataDeNascimento = DataDeNascimento;
	}
	
	public LocalDate getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura(double altura) {
		return this.altura;
	}
	
	
	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}
	
	public String getNivelAtividade () {
		return this.nivelAtividade;
	}
	
	public void getIdade() {
		return ;
	}      
	
	public double getIMC() {
		return peso/(Math.pow(this.altura, 2));
	}
	
	
}
