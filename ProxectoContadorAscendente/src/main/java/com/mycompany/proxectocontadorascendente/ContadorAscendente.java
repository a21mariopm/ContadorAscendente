package com.mycompany.proxectocontadorascendente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a21mariopm
 */
public class ContadorAscendente {
  
    private int valorActual;

    public ContadorAscendente(int valorActual) {
        this.valorActual = valorActual;
    }

    private
    
    /**
     * Get the value of valorActual
     *
     * @return the value of valorActual
     */
    public int getValorActual() {
        return valorActual;
    }

    /**
     * Set the value of valorActual
     *
     * @param valorActual new value of valorActual
     */
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    @Override
    public String toString() {
        return "ContadorAscendente{" + "valorActual=" + valorActual + '}';
    }
  
  }
}
