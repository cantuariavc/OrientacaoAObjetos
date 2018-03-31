#include "formasGeometricas.hpp"
#include "quadrado.hpp"
#include "triangulo.hpp"
#include "trapezio.hpp"
#include "retangulo.hpp"
#include "circulo.hpp"

int main(void)
{

    int opcao, continua;
    float base, altura, lado, raio, lado1, lado2, baseMaior;

    do
    {
        FormasGeometricas();
        Quadrado *quadrado = new Quadrado();
        Triangulo *triangulo = new Triangulo();
        Trapezio *trapezio = new Trapezio();
        Retangulo *retangulo = new Retangulo();
        Circulo *circulo = new Circulo();

        do
        {
            system("clear");

            cout << "   Qual forma geométrica a ser trabalhada?" << endl;
            cout << "   1 - Quadrado" << endl;
            cout << "   2 - Triângulo Equilátero" << endl;
            cout << "   3 - Trapézio" << endl;
            cout << "   4 - Retângulo" << endl;
            cout << "   5 - Círculo" << endl;
            cout << endl;
            cout << "   Opção: ";
            cin >> opcao;
            cin.ignore();
            cout << endl;
        }
        while (opcao < 1 || opcao > 5);

        switch(opcao)
        {
            case 1:
                cout << "   Informe o valor do lado: ";
                cin >> lado;
                cin.ignore();
                quadrado->setLado(lado);
                cout << endl;
                cout << "   Valor do perimetro: " << quadrado->perimetro(quadrado->getLado()) << endl;
                cout << "   Valor da área: " << quadrado->area(quadrado->getLado()) << endl;
                free(quadrado);
                break;

            case 2:
                cout << "   Informe o valor da base: ";
                cin >> base;
                cin.ignore();
                triangulo->setBase(base);
                cout << endl;
                cout << "   Informe o valor do lado: ";
                cin >> lado;
                cin.ignore();
                triangulo->setLado(lado);
                cout << endl;
                triangulo->setAltura((triangulo->getBase() / 2) * 1.73205);
                cout << "   Valor do perimetro: " << triangulo->perimetro(triangulo->getBase(), triangulo->getLado()) << endl;
                cout << "   Valor da área: " << triangulo->area(triangulo->getBase(), triangulo->getAltura()) << endl;
                free(triangulo);
                break;

            case 3:
                cout << "   Informe o valor da base maior: ";
                cin >> baseMaior;
                cin.ignore();
                trapezio->setBaseMaior(baseMaior);
                cout << endl;
                cout << "   Informe o valor da base menor: ";
                cin >> base;
                cin.ignore();
                trapezio->setBase(base);
                cout << endl;
                cout << "   Informe o valor do lado 1: ";
                cin >> lado1;
                cin.ignore();
                trapezio->setLado1(lado1);
                cout << endl;
                cout << "   Informe o valor do lado 2: ";
                cin >> lado2;
                cin.ignore();
                trapezio->setLado2(lado2);
                cout << endl;
                cout << "   Informe o valor da altura: ";
                cin >> altura;
                cin.ignore();
                trapezio->setAltura(altura);
                cout << endl;
                cout << "   Valor do perimetro: " << trapezio->perimetro(trapezio->getBase(), trapezio->getBaseMaior(), trapezio->getLado1(), trapezio->getLado2()) << endl;
                cout << "   Valor da área: " << trapezio->area(trapezio->getBase(), trapezio->getBaseMaior(), trapezio->getAltura()) << endl;
                free(trapezio);
                break;

            case 4:
                cout << "   Informe o valor da base: ";
                cin >> base;
                cin.ignore();
                retangulo->setBase(base);
                cout << endl;
                cout << "   Informe o valor do lado: ";
                cin >> altura;
                cin.ignore();
                retangulo->setAltura(altura);
                cout << endl;
                cout << "   Valor do perimetro: " << retangulo->perimetro(retangulo->getBase(), retangulo->getAltura()) << endl;
                cout << "   Valor da área: " << retangulo->area(retangulo->getBase(), retangulo->getAltura()) << endl;
                free(retangulo);
                break;

            case 5:
                cout << "   Informe o valor da raio: ";
                cin >> raio;
                cin.ignore();
                circulo->setRaio(raio);
                cout << endl;
                cout << "   Valor do perimetro: " << circulo->perimetro(circulo->getPi(), circulo->getRaio()) << endl;
                cout << "   Valor da área: " << circulo->area(circulo->getPi(), circulo->getRaio()) << endl;
                free(circulo);
                break;

            default:
                break;
        }

        cout << "\n\n\n";
        cout << "   Deseja fazer novamente?" << endl;
        cout << "   1 - Sim" << endl;
        cout << "   2 - Não" << endl;
        cout << endl;
        cout << "   Opção: ";
        cin >> continua;
        cin.ignore();
    }
    while (continua == 1);

    system("clear");

    return(0);
}
