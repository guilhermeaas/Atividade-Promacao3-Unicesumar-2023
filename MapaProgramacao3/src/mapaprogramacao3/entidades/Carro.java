/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprogramacao3.entidades;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Carro {
    private int id;
    private String modelo;        
    private String marca;
    private int valorPorKm;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(int valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
    
    
   public void cadastrarCarro(){
       this.id=1;
       this.modelo=JOptionPane.showInputDialog("Digite o modelo do carro:");
       this.marca=JOptionPane.showInputDialog("Digite a marca do carro:");
       this.valorPorKm=parseInt(JOptionPane.showInputDialog("Digite o valor por km"));
   } 
   public String mostrarDadosCarro(){
       String Dados="Modelo:"+this.modelo+"\nMarca:"+this.getMarca()+"\nValor por Km:"+this.getValorPorKm();
       return Dados;
   }
    
}
