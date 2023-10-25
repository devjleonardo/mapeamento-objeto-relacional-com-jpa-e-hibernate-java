# Incluindo JPA para persistir os objetos em banco de dados 

## Passos:

1º - Inclua as dependências Maven a serem baixadas: 

```bash
<dependencies>
#   <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
    <dependency>
	    <groupId>org.hibernate</groupId>
		<artifactId>hibernate-core</artifactId>
		<version>5.4.12.Final</version>
    </dependency>
		
#   <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-entitymanager -->
    <dependency>
	    <groupId>org.hibernate</groupId>
		<artifactId>hibernate-entitymanager</artifactId>
		<version>5.4.12.Final</version>
    </dependency>
		
#   <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
	    <groupId>mysql</groupId>
	    <artifactId>mysql-connector-java</artifactId>
	    <version>8.0.19</version>
    </dependency>
</dependencies>
```
<br/>

2º - Configure o JPA no seu projeto por meio do arquivo persistence.xml 

  - Crie uma pasta "META-INF" a partir da pasta "resources"
  
  - Dentro da pasta META-INF crie um arquivo "persistence.xml"
  
  - Conteúdo do arquivo persistence.xml: 
  
```bash
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence 
	http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
	version="2.1">
	
	<persistence-unit name="exemplo-jpa" transaction-type="RESOURCE_LOCAL">
	    <properties>
			<property name="javax.persistence.jdbc.url"
				value="jdbc:mysql://localhost:3306/aulajpa?useSSL=FALSE&amp;serverTimezone=UTC" />
				
		    <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
				
			<property name="javax.persistence.jdbc.user" value="root" />
			<property name="javax.persistence.jdbc.password" value="root" />
			
			<property name="hibernate.hbm2ddl.auto" value="update" />

		    <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
	    </properties>
    </persistence-unit>
</persistence> 
```
<br/>

3º - Inclua os MAPEAMENTOS na classe de domínio: 

```bash
package dominio;

import (...)

@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    (...) 
```