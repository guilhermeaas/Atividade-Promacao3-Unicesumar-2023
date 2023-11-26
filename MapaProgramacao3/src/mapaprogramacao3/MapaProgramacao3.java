/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaprogramacao3;


import mapaprogramacao3.entidades.Aluguel;


public class MapaProgramacao3 {

   
    public static void main(String[] args) {
        Aluguel a = new Aluguel();
        a.iniciarLocacao();
        a.fecharlocacao();
        a.mostrarResumoAluguel();
    }
    
}
