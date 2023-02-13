# Notas del curso de POO
 UML significa Unified Modeling Language el cual es un lenguaje estándar de modelado de sistemas orientados a objetos.

 ## UML:
 En la parte superior se colocan los atributos o propiedades, y debajo las operaciones de la clase. Notarás que el primer caracter con el que empiezan es un símbolo. Este denotará la visibilidad del atributo o método, esto es un término que tiene que ver con Encapsulamiento y veremos más adelante a detalle.

Estos son los niveles de visibilidad que puedes tener:

-private
+public
#protected
~default

Una forma de representar las relaciones que tendrá un elemento con otro es a través de las flechas en UML, y aquí tenemos varios tipos, estos son los más comunes:

### Asociación: 
Como su nombre lo dice, notarás que cada vez que esté referenciada este tipo de flecha significará que ese elemento contiene al otro en su definición. La flecha apuntará hacia la dependencia.
### Herencia: 
Siempre que veamos este tipo de flecha se estará expresando la herencia.
La dirección de la flecha irá desde el hijo hasta el padre.
### Agregación:
Este se parece a la asociación en que un elemento dependerá del otro, pero en este caso será: Un elemento dependerá de muchos otros. Aquí tomamos como referencia la multiplicidad del elemento. Lo que comúnmente conocerías en Bases de Datos como Relaciones uno a muchos.
### Composición:
Este es similar al anterior solo que su relación es totalmente compenetrada de tal modo que conceptualmente una de estas clases no podría vivir si no existiera la otra


# Sintaxis
## declarar clases person

java
class person {}

Python
class person:

javascript
Function person(){}

PHP
class Person {}

## declarar metodos walk

java
class person {
    String name= "";
    void walk(){}
}

Python
class person:
    name=""
    def walk():

javascript
person.prototype.walk= function(){
    
}

PHP
class Person {
    $name= "";
    function.walk(){}
}