package getset;

import java.util.Scanner;

public class GettersSetters {

	public static void main(String[] args) {
		String time;
		futebol torcida = new futebol();
		Scanner texto = new Scanner(System.in);
		
		System.out.println("qual seu time: ");
		time = texto.nextLine();
		
		torcida.setNomeTime(time);
		torcida.mostraTime();

	}

}
