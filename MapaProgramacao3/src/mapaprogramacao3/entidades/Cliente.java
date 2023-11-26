/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprogramacao3.entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    
 
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void cadastrarUsuario(){
        this.nome=JOptionPane.showInputDialog("Digite o nome do cliente");
        this.cpf=JOptionPane.showInputDialog("Digite o cpf do cliente");
        this.telefone=JOptionPane.showInputDialog("Digite o telefone do cliente");
    }
   public String mostrarDadosUsuario(){
       String Dados="Nome:"+this.getNome()+"\nCpf:"+this.getCpf()+"\nTelefone:"+this.getTelefone();
       
       return Dados;
   }
}
