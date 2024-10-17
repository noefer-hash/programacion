Indica els identificadors correctes
registro1 → Correcto
1registro → Incorrecto (comienza con un número)
archivo_3 → Correcto
while → Incorrecto (palabra reservada)
$impuesto → Correcto
año → Correcto (aunque es mejor evitar caracteres no ASCII por compatibilidad)
primer apellido → Incorrecto (espacio no permitido)
primer_apellido → Correcto
primer-apellido → Incorrecto (guion - no permitido)
primerApellido → Correcto
Tom’s → Incorrecto (carácter ' no permitido)
C3PO → Correcto
123# → Incorrecto (comienza con número y # no permitido)
PesoMáximo → Correcto
%descuento → Incorrecto (% no permitido)
Weight → Correcto
$$precioMínimo → Incorrecto (doble $ no es común, pero técnicamente permitido; sin embargo, es mejor evitarlo)
_$Único → Correcto (aunque usar caracteres especiales como Ú puede dar problemas)
tamaño_màximo → Incorrecto (carácter à no permitido)
peso.maximo → Incorrecto (. no permitido)
Precio___ → Correcto
matrícula? → Incorrecto (? no permitido)
cuántoVale → Incorrecto (carácter ñ puede dar problemas en algunos entornos)
high → Correcto
barça → Incorrecto (carácter especial ç)
piragüista → Correcto (aunque el uso de la ü puede ser problemático en algunos entornos)
B_011 → Correcto
X012AB → Correcto
70libro → Incorrecto (comienza con un número)
nombre&apellido → Incorrecto (& no permitido)
0X1A → Incorrecto (comienza con número)
else → Incorrecto (palabra reservada)


Vamos a analizar los literales de la lista:
0.5 → Correcto (literal de coma flotante)
.5 → Correcto (literal de coma flotante, 0 inicial opcional)
9.3e12 → Correcto (notación científica)
9.3e-12 → Correcto (notación científica con exponente negativo)
12345678 → Correcto (literal entero)
12345678_L → Incorrecto (el guion bajo _ no puede estar antes de la L)
0.8E+0.8 → Incorrecto (el exponente debe ser un número entero)
0.8E 8 → Incorrecto (no puede haber un espacio entre E y el exponente)
05_15 → Incorrecto (el formato octal solo permite dígitos del 0 al 7)
018CDF → Incorrecto (esto no es un literal hexadecimal válido, debería tener prefijo 0x)
0XBC5DA → Correcto (literal hexadecimal)
0x87e3a → Correcto (literal hexadecimal)
234567L → Correcto (literal entero largo)
0_B11 → Incorrecto (el guion bajo _ no puede estar después del prefijo)
010101 → Correcto (literal octal válido)
0_557 → Incorrecto (el guion bajo _ no puede estar después del prefijo octal 0)
.00.8E2 → Incorrecto (dos puntos decimales no permitidos)
.3e3f → Correcto (literal de coma flotante con sufijo f)
0b111 → Correcto (literal binario)
12_234L → Correcto (literal entero largo con guion bajo para legibilidad)
0Xabcd → Correcto (literal hexadecimal)
0xabcEL → Correcto (literal hexadecimal largo)
_234 → Incorrecto (el guion bajo _ no puede estar al inicio)
1010B → Incorrecto (la B solo se usa en binarios con prefijo 0B o 0b)
0x1010B → Incorrecto (B no es un dígito hexadecimal válido)
1_234.2E-2 → Correcto (literal de coma flotante con guion bajo para legibilidad)
1234.2EF → Incorrecto (F debería estar inmediatamente después del número)
1234.2E3F → Correcto (literal de coma flotante con sufijo F)
1_1.2e_2 → Incorrecto (el guion bajo _ no puede estar en el exponente)
0bABCDL → Incorrecto (en binarios solo se permiten los dígitos 0 y 1)
0X1A → Correcto (literal hexadecimal)
0X12AL → Incorrecto (A es un dígito válido en hexadecimal, pero el sufijo L debe estar después del número)
abcd → Incorrecto (esto no es un literal numérico, sino una cadena de texto no válida en este contexto)
0125 → Correcto (literal octal)
.01011 → Correcto (literal de coma flotante)
3e12 → Correcto (literal de coma flotante en notación científica)
3_e12 → Incorrecto (el guion bajo _ no puede estar antes del exponente)
-3E-1_2 → Incorrecto (el guion bajo _ no puede estar en el exponente)
0.8E → Incorrecto (el exponente debe estar completo)
0B1212 → Incorrecto (en binarios solo se permiten 0 y 1)
1_2_3 → Correcto (literal entero con guion bajo para legibilidad)
0xedad → Correcto (literal hexadecimal)
0XBE2 → Correcto (literal hexadecimal)
101e2 → Correcto (literal de coma flotante en notación científica)
B1101 → Incorrecto (falta prefijo 0B o 0b si es binario, B no es un literal válido por sí mismo)
1.34.5 → Incorrecto (dos puntos decimales no permitidos)
12.3E4F → Correcto (literal de coma flotante con sufijo F)
0X12AG → Incorrecto (G no es un dígito hexadecimal válido)


Exercicis de literals del tipus “char”

'a' → Correcto (literal char válido)
'$' → Correcto (literal char válido)
'\n' → Correcto (literal char con secuencia de escape para nueva línea)
'/n' → Incorrecto (esto es una cadena de dos caracteres, no una secuencia de escape válida)
'\' → Correcto (literal char con secuencia de escape para una barra invertida)
'\ñ' → Incorrecto (la secuencia de escape \ñ no es válida en Java)
"T" → Incorrecto (las comillas dobles son para strings, no para char)
'ñ' → Correcto (literal char válido)
'xyz' → Incorrecto (un literal char solo puede contener un carácter, y aquí hay tres)
'\u0066' → Correcto (literal Unicode que representa el carácter 'f')
"XYZ" → Incorrecto (esto es un string, no un char)
'4' → Correcto (literal char válido)
'\t' → Correcto (literal char con secuencia de escape para tabulación)
'\b' → Correcto (literal char con secuencia de escape para retroceso)
k → Incorrecto (falta estar entre comillas simples)
+ → Incorrecto (falta estar entre comillas simples)
'+' → Correcto (literal char válido)
'?' → Correcto (literal char válido)
'â' → Correcto (literal char válido)
':' → Correcto (literal char válido)
Literals char correctos:
'a', '$', '\n', '\', 'ñ', '\u0066', '4', '\t', '\b', '+', '?', 'â', ':'.


Exercicis sobre strings
Ejemplos válidos:
b) "Rojo, Blanco y Azul" → Correcto (es un String válido).
d) "Capítulo \’3\’" → Correcto (las comillas simples dentro del String son válidas con el escape \').
e) "1.3e-1-2" → Correcto (es un String válido, incluso si parece un número en notación científica, sigue siendo texto).
f) "" → Correcto (es un String vacío).
g) " " → Correcto (es un String con un espacio en blanco).
h) "A" → Correcto (es un String de un solo carácter, aún válido).
j) " programación " → Correcto (es un String con espacios alrededor).
n) "\n" → Correcto (es un String que contiene la secuencia de escape para nueva línea).
o) "4 + 5 * 2" → Correcto (es un String válido, aunque parece una expresión matemática).
Ejemplos incorrectos:
a) '8:15 P.M.' → Incorrecto (las comillas simples '' se usan para literales char, no String).
c) "Nombre: → Incorrecto (falta cerrar el String, no tiene la comilla final).
i) "FP' → Incorrecto (falta cerrar el String, solo tiene una comilla doble al principio).
k) "programación "Java"" → Incorrecto (las comillas dobles internas deben ser escapadas como \").
l) programación → Incorrecto (esto no está encerrado entre comillas dobles).
m) 'W' → Incorrecto (las comillas simples son para char, no para String).
Correcciones propuestas:
a) → Cambiar a comillas dobles: "8:15 P.M.".
c) → Completar el String: "Nombre:".
i) → Completar el String: "FP".
k) → Escapar las comillas internas: "programación \"Java\"" o usar comillas simples en las palabras si fuera texto no Java.
l) → Poner comillas dobles: "programación".
m) → Cambiar a comillas dobles: "W".
En resumen, los ejemplos válidos son:
b, d, e, f, g, h, j, n, o.



Declara les següents variables
a) Variables enteras
int p, q;

b) Variables float
float x, y, z;

c) Variables carácter
char a, b, c;

d) Variables double
double raiz1, raiz2;

e) Variable entera larga
long contador;

f) Variable entera corta
short indicador;

g) Variable entera
int indice;

h) Variables double
double precio, precioFinal;

i) Variables carácter
char car1, car2;

 j) Variable tipo byte
byte valor;

 k) Variables lógicas
boolean primero, ultimo;

 l) Variable de tipo cadena de caracteres
String nombre;


Declara aquestes variables
 a) Edad (entero)
int edad;

 b) Código postal (entero)
int codigoPostal;

 c) Altura (en metros o centímetros, usamos float)
float altura;

 d) Género (char: 'H' para hombre, 'M' para mujer)
char genero;

 e) Nombre (cadena de texto)
String nombre;

 f) Número de hijos (entero)
int numeroDeHijos;

 g) IVA (porcentaje a aplicar, usamos double)
double iva;

 h) Talla de camisa (valores numéricos, entero)
int tallaCamisa;

 i) Peso (en kilogramos, usamos float)
float peso;

 j) Precio (usamos double para manejar decimales)
double precio;

 k) Alumno repetidor (booleano: true/false o SI/NO)
boolean alumnoRepetidor;

 l) Mensaje (cadena de texto)
String mensaje;

 m) Letra (carácter)
char letra;

 n) Mayor de edad (booleano)
boolean mayorEdad;

 o) Minutos (entero)
int minutos;

 p) Días (entero)
int dias;

 q) Matrícula de coche (cadena de texto)
String matriculaCoche;

 r) Contador (entero)
int contador;

 s) Mayor de edad (booleano, verdadero/falso)
boolean mayorDeEdad;

 t) Talla de camiseta (cadena de texto para valores como S, M, L, XL)
String tallaCamiseta;


Convertir les expressions algebràiques a algotímiques

a)  double resultado = ((b / 2) - (4 * a * c));

b) double resultado = (3 * x * y) - (5 * x) + (12 * x) - 17;

c) double resultado = (b + d) / (c + 4);

d) double resultado = (x * y) / y + 2;

e) double resultado = (1 / y) + (3 * x / z) + 1;

f)​ double resultado = (1 / (y + 3)) + (x / y);

g) double resultado = (1 / y) + ((3 + x) / (y + 1));



Convertir les expressions algebràiques a algorítmiques

Expresión
Algebraica	        Equivalente en Java
3/2+4/3	            double result = 3.0 / 2.0 + 4.0 / 3.0;
1/x-5-3xy/4	        double result = 1.0 / x - 5.0 - (3.0 * x * y) / 4.0;
½+7	                double result = 0.5 + 7.0;
7+½	                double result = 7.0 + 0.5;
a2/b-c+d-e/f-g*h/j	double result = (a * a) / b - c + d - e / f - g * h / j;
m/n+p	            double result = m / n + p;
m+n/p-q	            double result = m + n / p - q;
a2/b2+c2/d2	        double result = (a * a) / (b * b) + (c * c) / (d * d);
m+n/p/q-r/s	        double result = m + n / p / q - r / s;
3a+b/c-d+5e/f+g/2h	double result = 3 * a + b / c - d + 5 * e / f + g / (2 * h);
a2+2ab+b2/1/x2+2	double result = (a * a + 2 * a * b + b * b) / (1.0 / (x * x) + 2.0);


Si a, b y c son variables senceres amb valors a=8, b=3, c=-5, determina el valor de
les següents expressions aritmètiques:
 Datos:

a = 8
b = 3
c = -5
Cálculos:

a) a + b + c = 8 + 3 + (-5) = 6
b) 2 * b + 3 * (a – c) = 2 * 3 + 3 * (8 - (-5)) = 6 + 3 * 13 = 45
c) a / b = 8 / 3 = 2.666... (Como son enteros, normalmente se toma la parte entera, así que sería 2)
d) a % b = 8 % 3 = 2 (El resto de dividir 8 entre 3 es 2)
e) a / c = 8 / (-5) = -1.6 (Parte entera: -1)
f) a % c = 8 % (-5) = 3 (El resto de dividir 8 entre -5 es 3)
g) a * b / c = 8 * 3 / (-5) = -4.8 (Parte entera: -4)
h) a * (b / c) = 8 * (3 / (-5)) = -4.8 (Parte entera: -4)
i) (a * c) % b = (8 * (-5)) % 3 = -40 % 3 = 2
j) a * (c % b) = 8 * (-5 % 3) = 8 * (-2) = -16
k) (3 * a – 2 * b) % (2 * a – c) = (3 * 8 – 2 * 3) % (2 * 8 – (-5)) = 18 % 21 = 18
l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2) = 2 * (8 / 5 + (4 - 3 * 3)) % (8 + (-5) - 2) = 2 * (-0.2) % 1 = -0.4 % 1 = 0.6 (Parte entera: 0)
m) (a - 3 * b) % (c + 2 * a) / (a - c) = (8 - 3 * 3) % (-5 + 2 * 8) / (8 - (-5)) = -1 % 11 / 13 = -1 / 13 = 0 (Parte entera: 0)
n) a - b - c * 2 = 8 - 3 - (-5) * 2 = 8 - 3 + 10 = 15

Respuestas:

a) 6
b) 45
c) 2
d) 2
e) -1
f) 3
g) -4
h) -4
i) 2
j) -16
k) 18
l) 0
m) 0
n) 15
 
 
Si x, y, z son variables de tipus double amb valors x= 88, y = 3.5, z = -5.2, determina el
valor de les següents expressions aritmètiques. Obtén el resultat de cada expressió amb
un màxim de quatre decimals.
public class Aritmetica {
    public static void main(String[] args) {
        double x = 88, y = 3.5, z = -5.2;

         a) x + y + z
        double a = x + y + z;

         b) 2 * y + 3 * (x – z)
        double b = 2 * y + 3 * (x - z);

         c) x / y
        double c = x / y;

         d) x % y  // Resto de la división, no aplicable para double
        double d = Double.NaN; // Not a Number

         e) x / (y + z)
        double e = x / (y + z);

         f) (x / y) + z
        double f = (x / y) + z;

         g) 2 * x / 3 * y
        double g = 2 * x / 3 * y;

         h) 2 * x / (3 * y)
        double h = 2 * x / (3 * y);

         i) x * y % z  // Resto de la división, no aplicable para double
        double i = Double.NaN;

         j) x * (y % z)  // Resto de la división, no aplicable para double
        double j = Double.NaN;

         k) 3 * x – z – 2 * x
        double k = 3 * x - z - 2 * x;

         l) 2 * x / 5 % y  // Resto de la división, no aplicable para double
        double l = Double.NaN;

         m) x - 100 % y % z  // Resto de la división, no aplicable para double
        double m = Double.NaN;

         n) x - y - z * 2
        double n = x - y - z * 2;

        // Imprimir resultados con 4 decimales
        System.out.printf("a) %.4f\n", a);
        System.out.printf("b) %.4f\n", b);
        System.out.printf("c) %.4f\n", c);
        System.out.printf("d) %.4f\n", d);
        // ... y así sucesivamente para todas las expresiones
    }
}
resultado
double a = 86.3;
double b = 286.6;
double c = 25.14;
double d = Double.NaN;
double e = -51.76;
double f = 19.94;
double g = 58.67;
double h = 11.14;
double i = Double.NaN;
double j = Double.NaN;
double k = 93.2;
double l = Double.NaN;
double m = Double.NaN;
double n = 95.9;

Expresión	Tipo de Dato del Resultado	Explicación
a) i + c	int	                        Suma de un entero y un caracter (convertido a entero).
b) f - c	float	                    Resta de un flotante y un caracter (convertido a flotante).
c) d + f	double	                    Suma de un double y un float.
d) d + i	double	                    Suma de un double y un entero.
e) i / f	float	                    División de un entero entre un flotante.
f) s + j	int	                        Suma de dos enteros.
g) d + j	double	                    Suma de un double y un entero.
h) s * c	int	                        Multiplicación de un corto y un caracter (convertido a entero).
i) d + c	double	                    Suma de un double y un caracter (convertido a entero).
j) b + c	int	                        Suma de dos caracteres (convertidos a enteros).
k) b/c + s	int	                        División de dos caracteres (convertidos a enteros) y suma con un corto.
l) c + c	int	                        Suma de dos caracteres (convertidos a enteros).
m) i + ln + d	double	                Suma de un entero, un long y un double.
n) ln + c	long	                    Suma de un long y un caracter (convertido a entero).
o) 5/j	int	                            División de dos enteros (resultado entero).
p) 5.2 / j	double	                    División de un double y un entero.
q) i* f * 2.5	float	                Multiplicación de un entero, un float y un float.
r) ln* f * 2.5F	double	                Multiplicación de un long, un float y un float (resultado promovido a double).
s) j - 4L	long	                    Resta de un entero y un long.
t) j - 4L * 2.5F	double	            Resta de un entero y el resultado de una multiplicación (long * float, promovido a double).
u) b + 2.5 * i + 35F	float	        Suma de un byte, el resultado de una multiplicación (float * int, promovido a float) y un float.
v) 'a' + b	int	                        Suma de un caracter y un byte (ambos convertidos a enteros).
w) 'a' + c	int	                        Suma de dos caracteres (convertidos a enteros).
x) c + 2	int	                        Suma de un caracter y un entero.
y) cln/2	Error	                    No existe una variable llamada "cln".
z) 2/i + 2.0 / j	double	            División de dos enteros (resultado entero) y división de un double y un entero (resultado double). El resultado final será double debido a la promoción.




Anem a calcular els valors de les expressions lògiques en Java amb els valors de les variables booleanes \( X = true \), \( Y = false \), i \( Z = true \).

Expressions:

a) \( (X && Y) || (X && Z) \)

true && false || true && true
= false || true
= true
```

b) \( (X || !Y) && (!X || Z) \)

(true || true) && (false || true)
= true && true
= true

c) \( X || (Y && Z) \)

true || (false && true)
= true || false
= true

d) \( !(X || Y) && Z \)

!(true || false) && true
= !true && true
= false && true
= false

e) \( X || Y || (X && !Z && !Y) \)


true || false || (true && false && true)
= true || false || false
= true


f)\( !X || !Y || (Z && X && !Y) \)
false || true || (true && true && true)
= false || true || true
= true

Resultats finals:

- a) true
- b) true
- c) true
- d) false
- e) true
- f) true



Si W, X i Y son variables de tipus boolean amb valors W = false, X =
true, Y = true, Z = false, determina el valor de les següents
expressions lògiques:
Datos:

W = false
X = true
Y = true
Z = false
Cálculos:

a) W || Y && X && W || Z
= false || true && true && false || false
= false || false || false
= false

b) X && !Y && !X || !W && Y
= true && false && false || true && true
= false || true
= true

c) !(W || !Y) && X || Z
= !(false || false) && true || false
= !false && true || false
= true && true || false
= true

d) X && Y && W || Z || X
= true && true && false || false || true
= false || false || true
= true

e) Y || !(Y || Z && W)
= true || !(true || false && false)
= true || !true
= true || false
= true

f) !X && Y && (!Z || !X)
= false && true && (true || false)
= false && true && true
= false

Respuestas:

a) false
b) true
c) true
d) true
e) true
f) false

A partir de les sigüents declaracions de variables:

int i = 8, j = 5;

float x = 0.005F, y = -0.01F;

char c = ‘c’, d = ‘d’;

Determina el valor de les següents expressions:
Soluciones:

a) i <= j: Falso (8 no es menor o igual que 5)
b) c > d: Falso (El valor ASCII de 'c' es menor que el de 'd')
c) x >= 0: Verdadero (0.005 es mayor o igual a 0)
d) x < y--: Verdadero (0.005 es menor que -0.01 antes de que y se decremente)
e) j != 6: Verdadero (5 es diferente de 6)
f) c == 99: Falso (El valor ASCII de 'c' no es 99)
g) !(i <= j): Verdadero (Lo contrario de falso es verdadero)
h) !(c == 99): Verdadero (Lo contrario de falso es verdadero)
i) !(x > 0): Falso (Lo contrario de falso es verdadero)
j) –j == i - 13: Verdadero (-5 es igual a 8 - 13)
k) ++x > 0: Verdadero (x se incrementa a 0.0055, que es mayor que 0)
l) y-- < 1: Verdadero (y se decrementa a -0.02, que es menor que 1)
m) c > d || c > 0: Falso (Ninguna de las condiciones es verdadera)
n) 5 * (i + j) > ‘c’: Verdadero (65 es mayor que el valor ASCII de 'c')
o) 2 * x + y == 0: Falso (0.01 no es igual a 0)
p) 2 * x + (y == 0): Verdadero (y == 0 es falso, lo cual se convierte en 0, y 2 * x es 0.01)
q) x + y >= 0: Falso (-0.005 no es mayor o igual a 0)
r) x < ++y: Verdadero (x es menor que -0.01 después de que y se incremente)
s) – (i + j) != -i + j: Falso (Ambos lados de la ecuación son iguales a -13)
t) i <= j && i >= c: Falso (i no es menor o igual que j)
u) i > 0 && j < 5: Falso (j no es menor que 5)
v) i > 0 || j < 5: Verdadero (i es mayor que 0)
w) x > y && i > 0 || j < 5: Verdadero (x es mayor que y e i es mayor que 0)
x) (3 * i – 2 * j) % (2 * d – c) > 3 * d : Falso 
y) 2 * ((i / 5) + (4 * (j – 3)) % (i + j – 2)) >= 10: Falso (El resultado es menor que 10)
z) (i – 3 * j) % (c + 2 * d) / (x – y) >= 0: Indeterminado (División por cero)