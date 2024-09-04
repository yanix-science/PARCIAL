#include <stdio.h>
#include <string.h>
#include <ctype.h>  // Incluir para la función tolower

#define MAX_LONGITUD_PALABRA 100

// Función para contar las ocurrencias de una palabra clave en el archivo
int contarOcurrencias(FILE *archivo, const char *clave) {
    char palabra[MAX_LONGITUD_PALABRA];
    int conteo = 0;

    // Leer cada palabra del archivo y compararla con la palabra clave
    while (fscanf(archivo, "%s", palabra) != EOF) {
        // Convertir ambas palabras a minúsculas para comparación insensible a mayúsculas
        char palabra_minuscula[MAX_LONGITUD_PALABRA], clave_minuscula[MAX_LONGITUD_PALABRA];
        for (int i = 0; palabra[i]; i++) {
            palabra_minuscula[i] = tolower((unsigned char)palabra[i]);
        }
        palabra_minuscula[strlen(palabra)] = '\0';
        for (int i = 0; clave[i]; i++) {
            clave_minuscula[i] = tolower((unsigned char)clave[i]);
        }
        clave_minuscula[strlen(clave)] = '\0';
        
        if (strcmp(palabra_minuscula, clave_minuscula) == 0) {
            conteo++;
        }
    }

    return conteo;
}

int main(int argc, char *argv[]) {
    // Verificar que se han pasado dos argumentos
    if (argc != 3) {
        printf("Uso: %s <archivo> <palabra clave>\n", argv[0]);
        return 1;
    }

    const char *nombre_archivo = argv[1];
    const char *clave = argv[2];

    // Abrir el archivo en modo lectura
    FILE *archivo = fopen(nombre_archivo, "r");
    if (archivo == NULL) {
        printf("Error al abrir el archivo %s\n", nombre_archivo);
        return 1;
    }

    // Contar las ocurrencias de la palabra clave en el archivo
    int ocurrencias = contarOcurrencias(archivo, clave);

    // Imprimir el resultado
    printf("La palabra '%s' se repite %d veces en el texto.\n", clave, ocurrencias);

    // Cerrar el archivo
    fclose(archivo);
    return 0;
}
