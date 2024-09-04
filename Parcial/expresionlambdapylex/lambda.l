%{
#include <stdio.h>
#include <stdlib.h>
%}

%option noyywrap

%%

lambda              { return 1; }      /* Reconocer la palabra clave "lambda" */
[a-zA-Z_][a-zA-Z0-9_]*  { return 2; }  /* Reconocer identificadores */
=                   { return 3; }      /* Reconocer el símbolo de asignación "=" */
:                   { return 4; }      /* Reconocer el símbolo ":" */
\*\*                { return 5; }      /* Reconocer el operador "**" */
[0-9]+              { return 6; }      /* Reconocer números */
[\+\-\*\/]          { return 7; }      /* Reconocer operadores aritméticos */
[\(\)]              { return 8; }      /* Reconocer paréntesis */
[ \t\n\r]+          { /* Ignorar espacios en blanco */ }

.                   { printf("NO ACEPTA\n"); exit(1); }

%%

int main(int argc, char **argv)
{
    if (argc != 2) {
        fprintf(stderr, "Uso: %s archivo.txt\n", argv[0]);
        return 1;
    }

    FILE *archivo = fopen(argv[1], "r");
    if (!archivo) {
        perror("No se pudo abrir el archivo");
        return 1;
    }

    yyin = archivo;
    yylex();
    fclose(archivo);
    printf("ACEPTA\n");
    return 0;
}
