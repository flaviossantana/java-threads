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

Java Faker
==========

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
