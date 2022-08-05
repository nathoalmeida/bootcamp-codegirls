package desafioProjeto;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate dataMentoria;



    public Mentoria() {

    }


    //getters e setters
    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    // tostring
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", dataMentoria=" + dataMentoria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
