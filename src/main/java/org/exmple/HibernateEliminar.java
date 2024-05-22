package org.exmple;

import jakarta.persistence.EntityManager;
import org.example.utilidades.JpaUtil;
import org.exmple.Clientes;

import java.util.Scanner;

public class HibernateEliminar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el id del cliente uese va a eliminar:");
        Long id = s.nextLong();
        EntityManager em = JpaUtil.getEntityManager();
        try {
            Clientes cliente = em.find(Clientes.class, id);
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }
}