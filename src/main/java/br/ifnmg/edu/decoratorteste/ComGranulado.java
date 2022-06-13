/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.decoratorteste;

/**
 * Extensão da classe sorvete decorator.
 * @author lucas
 */
public class ComGranulado extends SorveteDecorator {

    public ComGranulado(Sorvete sorvete) {
        super(sorvete);
    }

    // Adiciona as informações que ja vieram da super classe.
    @Override
    public double InformarPreco() {
        return sorveteDecorador.InformarPreco() + 1.0;
    }

    @Override
    public String InformarIngrediente() {
        return sorveteDecorador.InformarIngrediente() + ", Granulado";
    }
}
