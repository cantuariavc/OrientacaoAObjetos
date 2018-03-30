public class Aluno {
    private String matricula;
    private String nome;
    private String email;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String email) {
        setMatricula(matricula);
        setNome(nome);
        setEmail(email);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula ;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
