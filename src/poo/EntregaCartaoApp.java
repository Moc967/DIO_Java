package poo;
/*
* <h1> Aplicacoo criada para demonstrar o uso de programacao orientada a objetos</h1>
*/


import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //endereco.cep = "00000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        
        // dados do cliente
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("\nEndereco adicionado com sucesso!!");
        } catch (Exception e) {
            System.err.println("\nHouve erro ao adicionar o endereco: " + e.getMessage());
        }
    }
}
