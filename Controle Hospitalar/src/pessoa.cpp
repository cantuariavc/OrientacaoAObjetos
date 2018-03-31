#include "pessoa.hpp"

Pessoa::Pessoa(void)
{
    nome = "Nome e Sobrenome";
    idade = "0 ano(s)";
    registro = "TA000";
}

void Pessoa::setNome(string nome)
{
    this->nome = nome;
}
string Pessoa::getNome(void)
{
    return nome;
}

void Pessoa::setIdade(string idade)
{
    this->idade = idade;
}
string Pessoa::getIdade(void)
{
    return idade;
}

void Pessoa::setRegistro(string registro)
{
    this->registro = registro;
}
string Pessoa::getRegistro(void)
{
    return registro;
}
