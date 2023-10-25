# Visão geral sobre mapeamento objeto-relacional 

![image](https://raw.githubusercontent.com/devjleonardo/assets/main/mapeamento-objeto-relacional-com-jpa-e-hibernate-java/Vis%C3%A3o%20geral%20sobre%20mapeamento%20objeto-relacional.png)

- Outros problemas que devem ser tratados:

  - Contexto de persistência (objetos que estão ou não atrelados a uma conexão em um dado    momento)

  - Mapa de identidade (cache de objetos já carregados)

  - Carregamento tardio (lazy loading)

  - Outros 

## JPA

Java Persistence API (JPA) é a especificação padrão da plataforma Java EE (pacote javax persistence) para mapeamento objeto-relacional e persistência de dados.

JPA é apenas uma especificação (JSR 338): <br/>
http://download.oracle.com/otn-pub/jcp/persistence-2_1-fr-eval-spec/JavaPersistence.pdf

Para trabalhar com JPA é preciso incluir no projeto uma implementação da API (ex: Hibernate). 

Arquitetura de uma aplicação que utiliza JPA:
![image](https://raw.githubusercontent.com/devjleonardo/assets/main/mapeamento-objeto-relacional-com-jpa-e-hibernate-java/JPA.png)

### Principais classes: 

- EntityManager: <br/>
https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html

  - Um objeto EntityManager encapsula uma conexão com a base de dados e serve para efetuar operações de acesso a dados (inserção, remoção, deleção, atualização) em entidades (clientes, produtos, pedidos, etc.) por ele monitoradas em um mesmo contexto de persistência. 
  
  - Escopo: tipicamente mantem-se uma instância única de EntityManager para cada thread do sistema (no caso de aplicações web, para cada requisição ao sistema). 

- EntityManagerFactory: <br/>
  https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManagerFactory.html 
  
  - Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager. 

  - Escopo: tipicamente mantem-se uma instância única de EntityManagerFactory para toda aplicação.