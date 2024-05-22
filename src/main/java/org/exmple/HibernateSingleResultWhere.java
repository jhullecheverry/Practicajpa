package org.exmple;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.exmple.Clientes;
import java.util.Scanner;

public class HibernateSingleResultWhere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.formaPago=?1", Clientes.class);
        System.out.println("Ingrese una forma de pago: ");
        String pago = s.next();
        query.setParameter(1, pago);
        query.setMaxResults(1);
        Clientes c = (Clientes) query.getSingleResult();
        System.out.println(c);
        em.close();
    }
}

