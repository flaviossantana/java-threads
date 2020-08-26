# Java Thread

Projeto Java utilizando thread para programação paralalela.

### JConsole

> O JConsole é uma ferramenta de monitoramento gráfico para monitorar 
> Java Virtual Machine e aplicativos Java em uma máquina local ou remota.
> [Para saber mais...](https://docs.oracle.com/javase/7/docs/technotes/guides/management/jconsole.html)

Execute no prompt do windows:
```sh
$ jconsole
```
![alt text](https://docs.oracle.com/javase/7/docs/technotes/guides/management/figures/memtab.gif)

### Thread

  - Através das Threads podemos executar tarefas em paralelo;
  - Uma classe que implementa a interface Runnable define a tarefa que o Thread executará;
  - O construtor da classe Thread recebe esse Runnable;
  - Devemos inicializar uma Thread explicitamente através do método start();
  - Através do Thread.sleep(millis) podemos mandar uma thread dormir.
  - Synchronized deve ser colocado em um método para que não possa ser executado por duas Threads ao mesmo tempo.
  - Um Thread pode ter um nome;
  - Podemos pegar o Thread atual através do método Thread.currentThread();
  - Para sincronizar threads, devemos utilizar um bloco synchronized;
  - O synchronized significa que bloqueamos o objeto para outros threads;
  - A sincronização é feita através de mutex, que nada mais é do que a chave do objeto.
  - Ao modificar o objeto concorrentemente, coisas inesperadas podem aparecer;
  - Thread safe significa que o código funciona corretamente mesmo com vários threads compartilhando o objeto;
  - Há coleções thread safe, como o java.util.Vector para lista ou java.util.Hashtable para mapas
  - ao chamar object.wait() a thread fica no estado de espera
  - estado de espera significa WAITING no mundo de threads
  - uma thread esperando pode ser notificada pelo método object.notifyAll()
  - existem daemon threads para executar tarefas ou serviços secundários
  - daemons serão automaticamente desligados quando todas as outras threads terminarem
  - wait() e notify() sempre devem ser chamados dentro de um bloco synchronized;
  - Temos que ter cuidado para não mandar um thread esperar quando não há necessidade;

### Dependências

Java Faker
-----

Esta biblioteca gera daddos falsos.
É útil quando você está desenvolvendo um novo projeto e precisa de alguns dados bonitos para mostrar.

Maven
-----
Em pom.xml, adicione a seguinte estrofe xml entre <dependencies> ... </dependencies>

```xml
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>
```
[Para saber mais...](https://github.com/DiUS/java-faker)
