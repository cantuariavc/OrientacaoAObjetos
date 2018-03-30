public class Turma {
    private String codTurma;
    private String nomeDisciplina;
    private String codDisciplina;
    private int totalVagasTurma;
    private int quantVagasOcupadas;
    private int quantVagasLivres;

    public Turma() {
    }

    public Turma(String codTurma, String nomeDisciplina, String codDisciplina, int totalVagasTurma, int quantVagasOcupadas) {
        setCodTurma(codTurma);

        setNomeDisciplina(nomeDisciplina);

        setCodDisciplina(codDisciplina);

        setTotalVagasTurma(totalVagasTurma);
    
        setQuantVagasOcupadas(quantVagasOcupadas);

        setQuantVagasLivres();
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }
    public String getCodTurma() {
        return codTurma;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }
    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setTotalVagasTurma(int totalVagasTurma) {
        this.totalVagasTurma = totalVagasTurma;
    }
    public int getTotalVagasTurma() {
        return totalVagasTurma;
    }
    
    public void setQuantVagasOcupadas(int quantVagasOcupadas) {
        this.quantVagasOcupadas = quantVagasOcupadas;
    }
    public int getQuantVagasOcupadas() {
        return quantVagasOcupadas;
    }

    public void setQuantVagasLivres() {
        this.quantVagasLivres = getTotalVagasTurma() - getQuantVagasOcupadas();
    }
    public int getQuantVagasLivres() {
        return quantVagasLivres;
    }
}
