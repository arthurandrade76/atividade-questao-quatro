package com.mycompany.sistemaimovel;
public class Novo extends Imovel {
private double adicional;

public Novo(String endereco, double preco, double adicional) {
super(endereco, preco);
this.adicional = adicional;
}

public double getAdicional() {
return adicional;
}

public void setAdicional(double adicional) {
this.adicional = adicional;
}

public double getPrecoVenda() {
return getPreco() + adicional;
}

@Override
public void exibeDados() {
super.exibeDados();
System.out.println("Adicional (Imóvel Novo): R$ " + adicional);
System.out.println("Preço Final de Venda: R$ " + getPrecoVenda());
    }
}