grammar TrigCalc;

prog:   expr+ ;  // Un programa es una o más expresiones

expr:   function '(' angle ')' ;  // Una expresión es una función con un ángulo

function: 'Sin' | 'Cos' | 'Tan' ;  // Funciones trigonométricas

angle:   NUMBER ;  // Un ángulo es un número

NUMBER: [0-9]+ ('.' [0-9]+)? ;  // Definición de números

WS: [ \t\r\n]+ -> skip ;  // Ignorar espacios en blanco
