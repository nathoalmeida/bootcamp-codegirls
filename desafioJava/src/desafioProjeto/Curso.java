package desafioProjeto;

public class Curso extends Conteudo {


    public Curso() {



    }



    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }


    @Override
    public double calcularXP() {
        return (XP_PADRAO*getCargaHoraria());
    }
}
