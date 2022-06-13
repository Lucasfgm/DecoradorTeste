/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.decoratorteste;

/**
 * Implementa a interface de Sorvete.
 * @author lucas
 */
public abstract class SorveteDecorator implements Sorvete {

    public final Sorvete sorveteDecorador;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorveteDecorador = sorvete;
    }

    @Override
    public double InformarPreco() {
        return sorveteDecorador.InformarPreco();
    }

    @Override
    public String InformarIngrediente() {
        return sorveteDecorador.InformarIngrediente();
    }

    public Sorvete getSorvete() {
        return sorveteDecorador;
    }
}
