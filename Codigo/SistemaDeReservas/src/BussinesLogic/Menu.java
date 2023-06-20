package BussinesLogic;

import Common.Cliente;

public class Menu {

    public Menu() {
        Cliente cliente1 = new Cliente("Karina", "Sancho", "2066603333", "8888-8888");

        System.out.println("Cliente:" + cliente1.getinformation());
    }

}