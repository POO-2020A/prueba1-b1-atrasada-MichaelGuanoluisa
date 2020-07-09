[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=2909678&assignment_repo_type=AssignmentRepo)
# Prueba 1 - Bimestre 1

Esta prueba sirve para evaluar los conocimientos adquiridos en las secciones 1, 2 y 3 del curso. Esto incluye la sintaxis básica de Java.

Puedes trabajar los ejercicios en NetBeans o Replit pero únicamente debes subir los archivos .java correspondientes a los ejercicios propuestos. 

NO DEBES SUBIR NINGÚN OTRO ARCHIVO APARTE DE ESTOS:
```
MixedCase.java
SumOddsRange.java
Palindrome.java
```

Si trabajas en Replit, recuerda que el comando para compilar y correr los programas es:

```
javac NombreClase.java && java NombreClase
```

## Ejercicio 1
Obtener una cadena del usuario y almacenarla en:

`String s;`

Escribe un bucle for que imprima la cadena alternando las mayúsulas y minúsculas, siendo la primera letra siempre minúscula.

Ten en cuenta los siguientes métodos de la clase String:

```
str.toUpperCase(); //make it uppercase
str.toLowerCase(); //make it lowercase
```

NO UTILICES EL MÉTODO .chatAt ya que este retorna un char y lo que necesitas es un String para hacerlo mayúscula o minúscula. Para obtener una letra en una posición,
puedes usar el siguiente método:

`str.substring(x, x+1); //devuelve el caracter como string en la posición x`

Ejemplos de entrada/salida:
```
In: powerful
pOwErFuL

In: COMEDIC
cOmEdIc

In: acroBATics
aCrObAtIcS
```
PISTA: Necesitarás una sentencia if dentro del for!

## Ejercicio 2
Pedir 2 números al usuario:

```
int num1;
int num2;
```

Puedes asumir que `num2 > num1`

Escribe un programa que calcule e imprima la suma de los números impares que están entre `num1` y `num2` incluyendo estos números.

Ejemplo de entrada/salida:
```
#1: 3
#2: 11
35

#1: 4
#2: 20
96

#1: -2
#2: 6
8
```

## Ejercicio 3
La serie de Fibonacci es una serie en la que el siguiente número es la suma de los dos anteriores.

Los primeros números de la serie de Fibonacci son `0, 1`.

Los primeros 8 números de la serie son `0, 1, 1, 2, 3, 5, 8, 13`

Escribe un programa que imprima los primeros X números de la serie de Fibonacci.

La salida debe ser en una sola línea, separando los números por un espacio. Puedes asumir que X es por lo menos 2.
