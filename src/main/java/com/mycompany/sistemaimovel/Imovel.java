package com.mycompany.sistemaimovel;
public class Imovel {
private String endereco;
private double preco;

public Imovel(String endereco, double preco) {
this.endereco = endereco;
this.preco = preco;
}

public String getEndereco() {
return endereco;
}

public void setEndereco(String endereco) {
this.endereco = endereco;
}

public double getPreco() {
return preco;
}

public void setPreco(double preco) {
this.preco = preco;
}

public void exibeDados() {
System.out.println("Endereço: " + endereco);
System.out.println("Preço Base: R$ " + preco);
}
}
