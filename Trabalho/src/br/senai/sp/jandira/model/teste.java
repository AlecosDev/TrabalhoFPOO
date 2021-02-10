package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class teste {

	public static void main(String[] args) {
		LocalDate nascimento = LocalDate.of(2004, 6, 13);
		System.out.println(Period.between(nascimento, LocalDate.now()));
	}
}
