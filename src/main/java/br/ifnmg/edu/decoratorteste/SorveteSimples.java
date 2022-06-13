/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.decoratorteste;

/**
 * Implemente um sorvete sem nenhuma adição a mais.
 * @author lucas
 */
public class SorveteSimples implements Sorvete {

    @Override
    public double InformarPreco() {
        return 5;
    }

    @Override
    public String InformarIngrediente() {
        return "Sorvete";
    }

}
