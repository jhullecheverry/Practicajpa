package org.exmple;

import jakarta.persistence.EntityManager;
import org.example.utilidades.JpaUtil;
import org.exmple.Clientes;

import java.util.List;

public class Hibernate_Listar {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Clientes> clientes = em.createQuery("select c from Cliente c",
                Clientes.class).getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }

}