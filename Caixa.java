package Supermercado;

public class Caixa extends Thread{
	// Propriedades da classe
	private int numeroDoCaixa = 0;
	
	// Método construtor da classe
	public Caixa(int numeroDoCaixa) {
		this.numeroDoCaixa = numeroDoCaixa;
	}
	
	// Método de execucação paralela da classe
	public void run() {
		while(true) {
			if(AreaMemoria.getCaixa(numeroDoCaixa).contar() > 0) {
			AreaMemoria.getCaixa(numeroDoCaixa).atender();
			} else {
				int indiceDoMaior = 0;
				int qtdCliente = AreaMemoria.getCaixa(indiceDoMaior).contar();
				for (int i = 1; i < AreaMemoria.getQtdCaixas(); i++) {
					if(AreaMemoria.getCaixa(i).contar() > qtdCliente) {
					indiceDoMaior = i;
					qtdCliente = AreaMemoria.getCaixa(i).contar();
				}
			}
			AreaMemoria.getCaixa(indiceDoMaior).atender();
			}
			try { sleep((int)(150*Math.random())); } catch (InterruptedException e) {}

		}
	}
}
