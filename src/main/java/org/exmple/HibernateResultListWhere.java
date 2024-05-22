package org.exmple;

import org.exmple.Utilidades.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.Scanner;

class HibernateResultListWhere {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Clientes c where c.formaPago=?1", Clientes.class);
        System.out.println("Ingrese una forma de pago valida: ");
        String pago = s.next();
        query.setParameter(1, pago);
        query.setMaxResults(1);
        Clientes c = (Clientes) query.getSingleResult();
        System.out.println(c);
        em.close();
    }
}