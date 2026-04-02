package com.mycompany.sistemaimovel;
public class Velho extends Imovel {
private double desconto;

public Velho(String endereco, double preco, double desconto) {
super(endereco, preco);
this.desconto = desconto;
}

public double getDesconto() {
return desconto;
}

public void setDesconto(double desconto) {
this.desconto = desconto;
}

public double getPrecoVenda() {
return getPreco() - desconto;
}

@Override
public void exibeDados() {
super.exibeDados();
System.out.println("Desconto (Imóvel Antigo): R$ " + desconto);
System.out.println("Preço Final de Venda: R$ " + getPrecoVenda());
}
}
