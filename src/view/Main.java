package view;

import controller.ThreadNum;

public class Main {

	public static void main(String[] args) {
		
		//Fazer uma aplica��o que rode 5 Threads e que cada uma delas imprima no console o seu n�mero. 
		
		for (int i = 0; i < 5; i++){
			Thread numThread = new ThreadNum();
			numThread.start();
		}

	}

}
