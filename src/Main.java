import com.erickmarques.desafio.dominio.Curso;
import com.erickmarques.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso imersivo em Java e seus frameworks");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
        
    }
}
