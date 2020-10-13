package main;

import java.util.Scanner;

import modules.Equipamento;
import modules.EquipamentoSonoro;

public class TesteEquip {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int op=0;
		Equipamento e1 =new Equipamento(false);
		Equipamento e2 =new Equipamento(false);
		Equipamento e3 =new Equipamento(false);
		EquipamentoSonoro es1=new EquipamentoSonoro(false, (short) 0, false);
		EquipamentoSonoro es2=new EquipamentoSonoro(false, (short) 0, false);
		EquipamentoSonoro es3=new EquipamentoSonoro(false, (short) 0, false);
		
		System.out.println("**BEM VINDO AO PROGRAMA DE TESTE DE HERANÇA!**");
		System.out.println("Este programa já instanciou 3 equipamentos + 3 equipamentos sonoros.");
		System.out.println("Vamos agora setar alguns atributos...");
		System.out.printf("\nEquipamento 1\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) e1.liga();
		System.out.printf("\nEquipamento 2\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) e2.liga();
		System.out.printf("\nEquipamento 3\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) e3.liga();
		System.out.println("\n\nAgora os Equipamentos Sonoros, que tem mais atributos...");
		System.out.printf("\n\nEquipamento Sonoro 1\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es1.liga();
		if (es1.isLigado()==false) {
			System.out.printf("\nEscolha o VOLUME (0 a 10): ");
			es1.setVolume(sc.nextShort());
			while (es1.getVolume()<0 || es1.getVolume()>10) {
				System.out.printf("\nValor inválido! Tente novamente: ");
				es1.setVolume(sc.nextShort());
			}
		}
		System.out.printf("\n1-STEREO\nQQ OUTRO - MONO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es1.setStereo(true);
		else es1.setStereo(false);
		
		System.out.printf("\n\nEquipamento Sonoro 2\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es2.liga();
		if (es2.isLigado()==false) {
			System.out.printf("\nEscolha o VOLUME (0 a 10): ");
			es2.setVolume(sc.nextShort());
			while (es2.getVolume()<0 || es2.getVolume()>10) {
				System.out.printf("\nValor inválido! Tente novamente: ");
				es2.setVolume(sc.nextShort());
			}
		}
		System.out.printf("\n1-STEREO\nQQ OUTRO - MONO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es2.setStereo(true);
		else es2.setStereo(false);
		
		System.out.printf("\n\nEquipamento Sonoro 3\n1-LIGADO\nQQ OUTRO - DESLIGADO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es3.liga();
		if (es3.isLigado()==false) {
			System.out.printf("\nEscolha o VOLUME (0 a 10): ");
			es3.setVolume(sc.nextShort());
			while (es3.getVolume()<0 || es3.getVolume()>10) {
				System.out.printf("\nValor inválido! Tente novamente: ");
				es3.setVolume(sc.nextShort());
			}
		}
		System.out.printf("\n1-STEREO\nQQ OUTRO - MONO\nOpção: ");
		op=sc.nextInt();
		if(op==1) es3.setStereo(true);
		else es3.setStereo(false);
		
		System.out.println("**DADOS DOS EQUIPAMENTOS**");
		System.out.println("Equipamento 1"+e1.toString());
		System.out.println("Equipamento 2"+e2.toString());
		System.out.println("Equipamento 3"+e3.toString());
		System.out.println("Equipamento Sonoro 1"+es1.toString());
		System.out.println("Equipamento Sonoro 2"+es2.toString());
		System.out.println("Equipamento Sonoro 3"+es3.toString());
				
	}

}
