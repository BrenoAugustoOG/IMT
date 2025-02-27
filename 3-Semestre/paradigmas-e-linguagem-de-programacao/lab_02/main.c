#include <stdio.h>

void duplicaValor(int *x) {
    *x *= 2;
}

int main()
{
    // int num = 0;
    // int cubo = 0;

    // printf("Digite um numero: ");
    // scanf("%d", &num);

    // cubo = num * num * num;
    // printf("O cubo de %d eh %d\n", num, cubo);

    // int numero = 42;
    // int *ponteiro = &numero;
    // printf("O valor de numero é %d\n", numero);
    // *ponteiro = 100; //modificando o valor diretamente através do ponteiro
    // printf("O novo valor de numero, através do ponteiro, é %d\n", numero);

    // int numeros[] = {21, 52, 33, 46, 57};
    // int *ponteiroArray = numeros;
    // printf("O valor do primeiro elemento do array é %d\n", *ponteiroArray);
    // printf("O valor do segundo elemento do array é %d\n", *(ponteiroArray + 1));

    // char *ptr;
    // int i;
    // char vet[5] = {'a', 'b', 'c', 'd', 'e'};

    // ptr = vet; // A vartiável ponteiro ptr aponta para o primeiro elemento do vetor
    // for (i = 0; i < 5; i++){
    //     printf("\nVet[%d] = %c,  ptr = %c", i, vet[i], *ptr); // o conteudo do vetor acessado pela variavel e pelo ponteiro
    //     ptr++; // Incrementa o ponteiro para apontar para o próximo elemento do vetor
    // }

    int numero = 5;
    duplicaValor(&numero);
    printf("O valor de numero é %d\n", numero);

    return 0;
}