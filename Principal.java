package Supermercado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String[] args) throws IOException {
		
		new AreaMemoria();
		
		new Cliente().start();
		
		for(int i = 0; i < AreaMemoria.getQtdCaixas(); i++) {
		new Caixa(i).start();
		}
		
		while(true) {
			for(int i = 0; i < AreaMemoria.getQtdCaixas(); i++) {
				System.out.print(AreaMemoria.getCaixa(i).contar() + "\t");
			}
			System.out.println();
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
