#include "termometro.hpp"
#include "celsius.hpp"
#include "fahrenheit.hpp"
#include "kelvin.hpp"

int main(void)
{
    Termometro termometro;
    Celsius celsius;
    Fahrenheit fahrenheit;
    Kelvin kelvin;
    int opcao, continua;
    float temperatura;

    do
    {
        do
        {
            system("clear");
            cout << "Qual unidade a ser convertida?" << endl;
            cout << "1-Celsius  2-Fahrenheit  3-Kelvin" << endl;
            cout << "Opção: ";
            cin >> opcao;
            cin.ignore();
        }
        while (opcao < 1 || opcao > 3);
        cout << "Qual é o valor a ser convertido? ";
        cin >> temperatura;
        cin.ignore();
        termometro.setTemperatura(temperatura);
        cout << endl;

        switch(opcao)
        {
            case 1:
                celsius.converte(termometro.getTemperatura());
                break;
            case 2:
                fahrenheit.converte(termometro.getTemperatura());
                break;
            case 3:
                kelvin.converte(termometro.getTemperatura());
                break;
            default:
                break;
        }

    cout << endl;
    cout << "Deseja fazer outra conversão?" << endl;
    cout << "1-Sim  2-Não" << endl;
    cout << "Opção: ";
    cin >> continua;
    cin.ignore();
    }
    while (continua == 1);
    system("clear");

    return(0);
}
