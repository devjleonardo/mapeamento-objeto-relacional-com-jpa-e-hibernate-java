package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		/*
		Pessoa pessoa1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa pessoa2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa pessoa3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		entityManager.persist(pessoa3);
		
		entityManager.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		entityManager.close();
		entityManagerFactory.close();
		*/
		
		/*
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pessoa pessoa = entityManager.find(Pessoa.class, 2);
		
		System.out.println(pessoa);
		
		System.out.println("Pronto!");
		
		entityManager.close();
		entityManagerFactory.close();
		*/
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pessoa pessoa = entityManager.find(Pessoa.class, 2);
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(pessoa);
		
		entityManager.getTransaction().commit();
		
		System.out.println("Pronto!");
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
}
