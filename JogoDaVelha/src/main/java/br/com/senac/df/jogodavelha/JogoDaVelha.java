/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author nicolly61484976
 */
public class JogoDaVelha {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Tabuleiro tabuleiro = new Tabuleiro("1-cada jogador deve escolher um simbolo;" + " 2- o jogador 1 inicia a partida;"); 
       
       Jogador jogador1 = new Jogador (1, "Nicolly",'X'); 
       Jogador jogador2 = new Jogador (2,"matheus",'O');
       
       
        
        
        do{ tabuleiro.mostrarTabuleiro();
        if(tabuleiro.getJogadorDaVez() == 1){
        System.out.println("jogador 1, escolha onde jogar: ");
        String local = entrada.nextLine();
        tabuleiro.marcarJogada(jogador1.getSimbolo(),local);
        tabuleiro.setJogadorDaVez(2);
        tabuleiro.mostrarTabuleiro();
        tabuleiro.verificarGanhador(jogador1.getSimbolo(), jogador1.getNome());
        
        }
        else{
        System.out.println("jogador 2, rscolha onde jogar: ");
        String local = entrada.nextLine();
        tabuleiro.marcarJogada(jogador2.getSimbolo(),local);
        tabuleiro.setJogadorDaVez(1);
        tabuleiro.mostrarTabuleiro();
        tabuleiro.verificarGanhador(jogador2.getSimbolo(),jogador2.getNome());
        }
        
        
        
           }while(tabuleiro.isHouveGanhadorUltimaRodada() == false);
                
}
}