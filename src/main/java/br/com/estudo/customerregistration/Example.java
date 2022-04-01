package br.com.estudo.customerregistration;

import br.com.estudo.customerregistration.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Client-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client cliente = entityManager.find(Client.class, 1);
        System.out.println(cliente.getNome());

        entityManager.close();
        entityManagerFactory.close();
    }
}
