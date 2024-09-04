# PARCIAL

# 1. Proyecto #AWK

Este proyecto contiene un script AWK (`token.awk`) que procesa un archivo de entrada (`token.txt`). A continuación se detallan las instrucciones para ejecutar el script en un sistema basado en Linux.

## Requisitos

- **AWK**: Asegúrate de tener AWK instalado en tu sistema. En Ubuntu, puedes instalarlo con el siguiente comando:
```
- sudo apt update
- sudo apt install gawk
```

# Instrucciones para Ejecutar
1. Clona el Repositorio
```
git clone https://github.com/yanix-science/PARCIAL.git
```
2. Navega al Directorio del Proyecto
```
cd PARCIAL/AWK
```
4. Asegúrate de que el Script es Ejecutable
```
chmod +x token.awk
```
5. Si el script tiene permisos de ejecución, también puedes ejecutarlo directamente:
```
./token.awk token.txt
```

# 2. Expresión Lambda con Flex

## Requisitos:
Antes de comenzar, asegúrate de tener instalados los siguientes programas en tu sistema:

- Flex: Herramienta para generar analizadores léxicos.
- GCC: Compilador de C para compilar el archivo generado por Flex.

# Instrucciones para Ejecutar:
1. Clona el Repositorio
```
git clone https://github.com/yanix-science/PARCIAL.git
```
```
ls
```
```
cd expresionlambdapylex
```
3. Generar el analizador léxico
Utiliza Flex para generar el archivo (`lex.yy.c`) a partir del archivo (`lambda.l`):
```
flex lambda.l
```
5. Compilar el código
Compila el archivo generado por Flex usando GCC. Esto creará un ejecutable llamado lambda
6. Ejecutar el programa
```
./lambda archivo.txt
```

# 3. Programa en C

# Contador de Ocurrencias de Palabras en C

Este proyecto contiene un programa en C que cuenta cuántas veces aparece una palabra clave en un archivo de texto.

## Instrucciones

### Requisitos

- **GCC** (GNU Compiler Collection): Asegúrate de tener `gcc` instalado en tu sistema para compilar el programa.

### Archivos del Proyecto

- `miprograma.c`: El código fuente del programa en C.
- `texto.txt` (Opcional): Un archivo de texto de prueba que puedes crear usando el código proporcionado.

### Compilar el Programa

1. Abre una terminal.
Clona el Repositorio
```
git clone https://github.com/yanix-science/PARCIAL.git
```
3. Navega al directorio del proyecto donde se encuentra `miprograma.c`.
```
ls
```
5. Ejecuta el siguiente comando para compilar el programa:

   ```bash
   gcc -o miprograma miprograma.c
## Ejecuta el Programa:
si ejecutas, actualmente:
```
./miprograma texto.txt arroz
```
salida:
```
    La palabra 'arroz' se repite 5 veces en el texto.
```
## Crea un Archivo de Texto (Opcional): Puedes crear un archivo de texto con el siguiente comando:
```
    nano texto.txt
    Agrega el texto deseado y guarda el archivo.
    Reemplaza texto.txt con el nombre de tu archivo de texto y arroz con la palabra clave que deseas buscar.
```

# 4. Calculadora Trigonometria
Este proyecto es una calculadora de funciones trigonométricas implementada en ANTLR. El programa lee expresiones desde un archivo de texto y calcula las funciones trigonométricas especificadas.

## Instrucciones para Compilar y Ejecutar

### Requisitos

- Java JDK instalado
- ANTLR 4 instalado
- Git instalado

### Pasos

1. **Clonar el repositorio:**
Clona el Repositorio
```
git clone https://github.com/yanix-science/PARCIAL.git
```
```
ls
```
```
cd CalculadoraTrigo
```

3. Generar el código fuente desde la gramática ANTLR:
```
antlr4 TrigCalc.g4
```
```
javac *.java
```
5. Ejecutar el programa:
```
java TrigCalcMain
```


















