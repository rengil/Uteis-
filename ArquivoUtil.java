package home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

public class ArquivoUtil
{
	
	
	public static void main(String [] args) throws IOException{

		FileReader reader = new FileReader("C:\\Users\\Renan\\Desktop\\dados.txt");
		BufferedReader  bufferLinhas = new BufferedReader(reader);
		Integer pegaTamanho = Integer.parseInt(bufferLinhas.readLine().trim());
		String linhaAtual = bufferLinhas.readLine();
	
		Integer contador = 0;
		String retorno = "";
		while(contador < pegaTamanho){
			retorno = retorno + retornaSomaLinha(linhaAtual) + " ";			
			linhaAtual = bufferLinhas.readLine();
			contador++;
		}
		
		bufferLinhas.close();
		System.out.println(retorno);

	}
	
	private static Integer retornaSomaLinha(String linha){
		String[] numerosLinha = linha.split(" ");
		List<String> listaNumeros = Arrays.asList(numerosLinha);
		Iterator<String> i = listaNumeros.iterator();
		Integer linhaSomada = 0;
		while(i.hasNext()){
			linhaSomada = linhaSomada + Integer.parseInt(i.next());
		}
		
		return linhaSomada;	
	}
	
}


