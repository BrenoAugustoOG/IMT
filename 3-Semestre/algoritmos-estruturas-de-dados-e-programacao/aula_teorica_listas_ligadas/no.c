#include <stdio.h>
#include <stdlib.h>

struct no {
    int info;
    struct no *proximo;
};

int main() {
    printf("Tamanho do inteiro: %d\n", sizeof(int));
    printf("Tamanho da estrutura: %d\n", sizeof(struct no));

    struct no no1, no2; // no1 e no2 são do tipo struct no

    no1.info = 5;
    no1.proximo = &no2;

    printf("no1.info: %d\nno1.proximo: %p\n", no1.info, no1.proximo);

    struct no * pt_no; // ponteiro para o struct no

    pt_no = (struct no *) malloc(sizeof(struct no));
    pt_no -> info = 8; // A estrutura apontada pro campo info é 08
    pt_no -> proximo = &no1;

    printf("Onde está o ponteiro pt_no: %p\n", pt_no);
    printf("Para onde o pt_no aponta: %p\n", pt_no);

    printf("O próximo do pt_no é %p\n", pt_no -> proximo);
    
    return 0;
};