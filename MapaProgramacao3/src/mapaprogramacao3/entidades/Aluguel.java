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
public  class Aluguel  {
    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int KmInicial;
    private int kMFinal;
    private double valorTotalAluguel;

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public int getKmInicial() {
        return KmInicial;
    }

    public void setKmInicial(int KmInicial) {
        this.KmInicial = KmInicial;
    }

    public int getkMFinal() {
        return kMFinal;
    }

    public void setkMFinal(int kMFinal) {
        this.kMFinal = kMFinal;
    }

    public double getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(double valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    
    Cliente c= new Cliente();
    Carro car = new Carro();
    public void  iniciarLocacao(){
       
        c.cadastrarUsuario();
        car.cadastrarCarro();
        this.setKmInicial(Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem inicial:")));
    }
    public void fecharlocacao(){
     
        this.setkMFinal(Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem final:")));
        this.setQtdDias(Integer.parseInt(JOptionPane.showInputDialog("por quantos dias ficou alugado?")));
      this.setValorTotalAluguel((this.getkMFinal()-this.getKmInicial())*this.car.getValorPorKm());
      
      if(this.getQtdDias()>20){
          this.setValorTotalAluguel(this.getValorTotalAluguel()*0.8);
      }else if(this.getQtdDias()>10){
      this.setValorTotalAluguel(this.getValorTotalAluguel()*0.9);
}
     
    }
    public String mostrarResumoAluguel(){
         String resumo="RESUMO ALUGUEL:\nCliente\n"+c.mostrarDadosUsuario()+"\n"
                 + "Carro\n"+car.mostrarDadosCarro()+"\nDias alugado:"+this.getQtdDias()+"\nKM inicial:"+this.getKmInicial()+"\nKm Final"+this.getkMFinal()+"\nValor Total R$:"+this.getValorTotalAluguel();
       JOptionPane.showMessageDialog(null,resumo);
       
       return resumo;
    }
}