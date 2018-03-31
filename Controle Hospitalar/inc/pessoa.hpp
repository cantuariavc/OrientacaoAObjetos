#ifndef PESSOA_HPP
#define PESSOA_HPP

#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;

class Pessoa
{
private:
    string nome;
    string idade;
    string registro;

public:
    Pessoa(void);
    void setNome(string nome);
    string getNome(void);
    void setIdade(string idade);
    string getIdade(void);
    void setRegistro(string registro);
    string getRegistro(void);
};

#endif
