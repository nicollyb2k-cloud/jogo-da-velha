/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.jogodavelha;

/**
 *
 * @author nicolly61484976
 */
public class Tabuleiro {
 private int notaJ1;
 private int notaj2;
 private String regras;
 private boolean houveGanhadorUltimaRodada;
 private int jogadorDaVez;
 private char a1 =' ',a2 = ' ',a3 = ' ',b1 = ' ',b2 = ' ',b3 = ' ',c1 = ' ',c2 = ' ',c3 = ' ';
         
         
    public int getJogadorDaVez() {
        return jogadorDaVez;
    }

    public void setJogadorDaVez(int jogadorDaVez) {
        this.jogadorDaVez = jogadorDaVez;
    }
 
    public boolean isHouveGanhadorUltimaRodada() {
        return houveGanhadorUltimaRodada;
    }

    public void setHouveGanhadorUltimaRodada(boolean houveGanhadorUltimaRodada) {
        this.houveGanhadorUltimaRodada = houveGanhadorUltimaRodada;
    }

    public int getNotaJ1() {
        return notaJ1;
    }

    public void setNotaJ1(int notaJ1) {
        this.notaJ1 = notaJ1;
    }

    public int getNotaj2() {
        return notaj2;
    }

    public void setNotaj2(int notaj2) {
        this.notaj2 = notaj2;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public Tabuleiro( String regras) {
         this.regras = regras;
        this.notaJ1 = 0;
        this.notaj2 = 0;
        this.houveGanhadorUltimaRodada = false;
        this.jogadorDaVez = 1;
    }
    
    
    public void verificarGanhador(char simbolo, String nome){ 
      if (a3 == simbolo && b2 == simbolo && c1 == simbolo) {
      this.houveGanhadorUltimaRodada = true;
      } else if (a1 == simbolo && b1 == simbolo && c1 == simbolo) {
       this.houveGanhadorUltimaRodada = true;
         } else if (a2 == simbolo && b2 == simbolo && c2 == simbolo) {
       this.houveGanhadorUltimaRodada = true;
     } else if (a3 == simbolo && b3 == simbolo && c3 == simbolo) {
       this.houveGanhadorUltimaRodada = true;
    } else if (a1 == simbolo && b2 == simbolo && c3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    } else if (c1 == simbolo && c2 == simbolo && c3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    } else if (a1 == simbolo && a2 == simbolo && a3 == simbolo) {
       this.houveGanhadorUltimaRodada = true;
    } else if (b1 == simbolo && b2 == simbolo && b3 == simbolo) {
        this.houveGanhadorUltimaRodada = true;
    }
  if (this.houveGanhadorUltimaRodada == true){
      System.out.println("parabens, ganhador(a): " + nome);
  }
}   

     
    public void organizar(){
        
    }
    public void mostrarTabuleiro(){
    System.out.printf("""
                         A        B       C
                              |       |       
                              |       |       
                   1      %c    |  %c     |   %c
                              |       |       
                       -------+-------+-------
                              |       |
                              |       |       
                   2      %c    |  %c     |   %c   
                              |       |       
                       -------+-------+-------
                              |       |
                              |       |       
                   3      %c    |  %c     |   %c  
                              |       |
                              |       |       
                       
                       """, a1,b1,c1,a2,b2,c2,a3,b3,c3);
    } 
    public void marcarJogada(char simbolo, String coordenada){
     switch(coordenada) {
         case "A1":
             this.a1 = simbolo;
             break;
             
         case "A2":
         this.a2 = simbolo;
         break;
         
         case"A3":
         this.a3 = simbolo;
         break;
         
         case "B1":
         this.b1 = simbolo;
         break;
         
         case"B2":
         this.b2 = simbolo;
         break;
         
         case"B3":
         this.b3 = simbolo;
         break;
         
         case"C1":
         this.c1 = simbolo;
         break;
         
         case"C2":
         this.c2 = simbolo;
         break;
         
         case"C3":
         this.c3 = simbolo;
         break;
         
         case "a1":
             this.a1 = simbolo;
             break;
             
         case "a2":
         this.a2 = simbolo;
         break;
         
         case"a3":
         this.a3 = simbolo;
         break;
         
         case "b1":
         this.b1 = simbolo;
         break;
         
         case"b2":
         this.b2 = simbolo;
         break;
         
         case"b3":
         this.b3 = simbolo;
         break;
         
         case"c1":
         this.c1 = simbolo;
         break;
         
         case"c2":
         this.c2 = simbolo;
         break;
         
         case"c3":
         this.c3 = simbolo;
         break;
     }
    }
   }