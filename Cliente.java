package Supermercado;

public class Cliente extends Thread {
	// Método de execucao paralela da classe
	public void run() {
		while(true) {
			int indiceDoMenor = 0;
			int qtdClientes = AreaMemoria.getCaixa(indiceDoMenor).contar();
		for(int i = 1; i < AreaMemoria.getQtdCaixas(); i++) {
			if(AreaMemoria.getCaixa(i).contar() < qtdClientes) {
				indiceDoMenor = i;
				qtdClientes = AreaMemoria.getCaixa(i).contar();
			}
		}
		int numeroDoCliente = ((int)(1000 * (Math.random())));
		AreaMemoria.getCaixa(indiceDoMenor).entrar(numeroDoCliente); 
		try { sleep(100); } catch (Exception e) {};
	}
	}

}
