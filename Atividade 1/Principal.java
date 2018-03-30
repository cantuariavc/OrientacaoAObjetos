import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Turma> turmas = new ArrayList<>();
        Turma oo = new Turma("B", "Orientação por objetos", "25", 45, 35);
        Turma das = new Turma("A", "Desenvolvimento Avançado de Software", "13", 30, 30);
        Turma aux;

        turmas.add(oo);
        turmas.add(das);
        
        for (int i = 0; i < turmas.size(); i++) {
            int k = turmas.size() - 1;
            for (int j = 0; j < k; j++) {
                if (turmas.get(j).getCodTurma().compareTo(turmas.get(j+1).getCodTurma()) > 0) {
                    aux = turmas.get(j);
                    turmas.set(j, turmas.get(j+1));
                    turmas.set((j+1), aux);
                }
            }
        k--;
        }

        for (Turma turma : turmas) {
            System.out.println("Código da turma:\t\t" + turma.getCodTurma());
            System.out.println("Nome da disciplina:\t\t" + turma.getNomeDisciplina());
            System.out.println("Código da Disciplina:\t\t" + turma.getCodDisciplina());
            System.out.println("Total de vagas na turma:\t" + turma.getTotalVagasTurma());
            System.out.println("Total de vagas ocupadas:\t" + turma.getQuantVagasOcupadas());
            System.out.println("Total de vagas livres:\t\t" + turma.getQuantVagasLivres());
            System.out.println();
        }
    }
}
