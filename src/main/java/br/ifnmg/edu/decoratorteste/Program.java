/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.decoratorteste;

/**
 * 
 * @author lucas
 */
public class Program {

    // Informa o preço e o Ingrediente
    public static void Print(Sorvete s) {
        System.out.println("Preco: " + s.InformarPreco() + ", Ingrediente: " + s.InformarIngrediente());
    }

    public static void main(String[] args) {

        // Sorvete sem nenhum adicional.
        Sorvete s = new SorveteSimples();
        Print(s);

        // Setamos no mesmo objeto a calda
        s = new ComCalda(s);
        Print(s);

        // Novamente é setado um sorvete simples
        s = new SorveteSimples();
        // É feita a decoração com a classe comGranulado
        s = new ComGranulado(s);
        Print(s);
    }
}
