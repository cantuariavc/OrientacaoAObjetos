#include "familia.hpp"

Familia::Familia(void)
{
    parentesco = "Parentesco";
    telefone = "(xx) xxxx-xxxx";
    umPaciente.doenca = "Doença";
}

void Familia::setParentesco(string parentesco)
{
    this->parentesco = parentesco;
}
string Familia::getParentesco(void)
{
    return parentesco;
}

void Familia::setTelefone(string telefone)
{
    this->telefone = telefone;
}
string Familia::getTelefone(void)
{
    return telefone;
}

void Familia::setUmPaciente(Paciente umPaciente)
{
    this->umPaciente = umPaciente;
}
Paciente Familia::getUmPaciente(void)
{
    return umPaciente;
}
