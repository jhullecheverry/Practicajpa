package org.exmple;

import jakarta.persistence.EntityManager;
import org.exmple.Clientes;
import utilidades.JpaUtil;
import java.util.Scanner;
public class Hibernate_Id {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduzca el id: ");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        Clientes cliente = em.find(Clientes.class, id);
        System.out.println(cliente);
        Clientes cliente2 = em.find(Clientes.class, id);
        System.out.println(cliente2);
        em.close();
    }

}