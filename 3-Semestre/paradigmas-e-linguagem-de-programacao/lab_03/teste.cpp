#include <iostream>
using namespace std;
// variáveis globais
float dados[10] = {21.5, 25.5, 14.5, 15.8, 17.6,
                   8.9, 9.6, 18.6, 17, 12};
int n = 10;
// função principal
int main()
{
    cout << "Vetor dados original: \n";
    cout << "Indice\tElemento\n";
    for (int i = 0; i <= n - 1; i++)
        cout << "[" << i << "]\t" << dados[i] << endl;
    cout << "\n\nVetor dados ordenado: \n";
    // ordenação do vetor
    float aux;
    int i, j, k;
    for (i = 0; i <= n - 2; i++)
    {
        k = i;
        aux = dados[i];
        for (j = i + 1; j <= n - 1; j++)
            if (dados[j] < aux)
            {
                k = j;
                aux = dados[k];
            }
        dados[k] = dados[i];
        dados[i] = aux;
    }
    for (int i = 0; i <= n - 1; i++)
        cout << "[" << i << "]\t" << dados[i] << endl;
    system("Pause");
    return 0;
}
