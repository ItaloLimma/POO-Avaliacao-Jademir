Repository para Empregados:

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>com.devmedia</groupId>
<artifactId> empregados </artifactId>
<version>0.0.1</version>
<packaging>war</packaging>

<dependencies>
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>5.1.6</version>
<scope>compile</scope>
</dependency>
<dependency>
<groupId>org. empregados</groupId>
<artifactId>empregados</artifactId>
<version>5.1</version>
<scope>compile</scope>
</dependency>
<dependency>
<groupId>org.glassfish</groupId>
<artifactId>javax.faces</artifactId>
<version>2.1.13</version>
<scope>compile</scope>
</dependency>
</dependencies>
<repositories>
<repository>
<id> empre-repo</id>
<name> empregados Maven Repository</name>
<url>http://repository.empregados.org</url>
<layout>default</layout>
</repository>
</repositories>
</project>


Repository para Treinamentos:

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>com.devmedia</groupId>
<artifactId> treinamentos</artifactId>
<version>0.0.1</version>
<packaging>war</packaging>

<dependencies>
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>5.1.6</version>
<scope>compile</scope>
</dependency>
<dependency>
<groupId>org. treinamentos</groupId>
<artifactId> treinamentos</artifactId>
<version>5.1</version>
<scope>compile</scope>
</dependency>
<dependency>
<groupId>org.glassfish</groupId>
<artifactId>javax.faces</artifactId>
<version>2.1.13</version>
<scope>compile</scope>
</dependency>
</dependencies>
<repositories>
<repository>
<id>treina-repo</id>
<name> treinamentos Maven Repository</name>
<url>http://repository. treinamentos.org</url>
<layout>default</layout>
</repository>
</repositories>
</project>

Configuramdo a aplicação para usar o framework JSF:

<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee"
  xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
  http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">
    <display-name>com.devmedia.primefaces</display-name>
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.xhtml</url-pattern>
    </servlet-mapping>
    <welcome-file-list>
        <welcome-file>/index.xhtml</welcome-file>
    </welcome-file-list>
    <error-page>
        <exception-type>javax.faces.application.ViewExpiredException
        </exception-type>
        <location>/index.xhtml</location>
    </error-page>
</web-app>



Criando a aplicação Model Empregados:
package com.devmedia.model;

import java.util.Date;

public class empregados {

     private int id;
     private String nome;
     private String senha;
     private Date dataCadastro;
     private String descricao;

     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public String getSenha() {
          return senha;
     }
     public void setSenha(String senha) {
          this.senha = senha;
     }
     public Date getDataCadastro() {
          return dataCadastro;
     }
     public void setDataCadastro(Date dataCadastro) {
          this.dataCadastro = dataCadastro;
     }
     public String getDescricao() {
          return descricao;
     }
     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

}

Criando a aplicação Model Treinamentos:
package com.devmedia.model;

import java.util.Date;

public class treinamentos {

     private int id;
     private String nome;
     private String senha;
     private Date dataCadastro;
     private String descricao;

     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }
     public String getSenha() {
          return senha;
     }
     public void setSenha(String senha) {
          this.senha = senha;
     }
     public Date getDataCadastro() {
          return dataCadastro;
     }
     public void setDataCadastro(Date dataCadastro) {
          this.dataCadastro = dataCadastro;
     }
     public String getDescricao() {
          return descricao;
     }
     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

}

Banco de Dados Empregados:
CREATE DATABASE empregados;
use empregados;

CREATE TABLE empregados (
     id INT PRIMARY KEY,
     nome VARCHAR(30),
     senha VARCHAR(10),
     descricao VARCHAR(50),
     data_cadastro TIMESTAMP
);
Banco de Dados Treinamentos:
CREATE DATABASE treinamentos;
use treinamentos;

CREATE TABLE treinamentos (
     id INT PRIMARY KEY,
     nome VARCHAR(30),
     senha VARCHAR(10),
     descricao VARCHAR(50),
     data_cadastro TIMESTAMP
);
Controllers para Empregados:

@RestController
@RequestMapping(”/users”)
Public class > Innovatio.tag.empregados

<servlet>
         <servlet-name>empregados</servlet-name>
         <servlet-class> Innovatio.tag.empregados</servlet-class>
</servlet>
<servlet-mapping>
         <servlet-name> empregados </servlet-name>
         <url-pattern>/usuarios/*</url-pattern>
</servlet-mapping>

Controllers para Treinamentos:

@RestController
@RequestMapping(”/users”)
Public class > Innovatio.tag.treinamentos

<servlet>
         <servlet-name> treinamentos</servlet-name>
         <servlet-class> Innovatio.tag.treinamentos </servlet-class>
</servlet>
<servlet-mapping>
         <servlet-name> treinamentos</servlet-name>
         <url-pattern>/usuarios/*</url-pattern>
</servlet-mapping>
