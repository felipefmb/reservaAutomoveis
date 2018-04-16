# Garagem de veículos #

**Garagem de veículos** é um projeto desenvolvido para fazer um controle simplificado de uma garagem de veículos. 

## O que faz? ##

O projeto destina-se a fazer as seguintes funções:

- **Cadastrar Marcas de automóveis**
- **Cadastrar Automóveis**
- **Reservar Automóveis**

## Instalação ##

#### Requisitos ####

- **Java JDK 8**
- **Wildfly**
- **NodeJS**
- **PostgreSQL**

### Estrutura ###

Todo o projeto pode ser baixado por meio desse repositório, porém, a aplicação foi desenvolvida em módulos separados, portanto, deve ser executado um servidor para a aplicação e outro para a camada de serviços.

- **Aplicação:** Para facilitar a disponibilização do sistema, a aplicação foi disponibilizada no caminho: ..\garagemAutomoveis\ReservaAutomoveisApp e deve ser iniciada com o NodeJS.   

- **Serviços:** Para iniciar os serviços que irão se comunicar com a aplicação, subir o servidor wildFly e fazer deploy do módulo EAR.

- **Banco:** - Na instalação do banco, usar o usuário e senha postgresql, porta 5432 
- Após instalar, criar um banco de dados pela ferramenta pgAdmin com o nome reservaAutomoveis. Ao subir o servidor WildFly e fazer deploy dos serviços, o datasource já irá estar configurado para usar o sistema, caso contrário, é necessário alterar as configurações do datasource no módulo EAR. 
- Obs: Neste projeto foi utilizado o banco PostgreeSQL, portanto, no servidor wildfly deve ser registrado o módulo deste banco.

- **SQL Criação do banco: **

```
CREATE DATABASE "reservaAutomoveis"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
```