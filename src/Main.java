import com.erickmarques.desafio.dominio.Bootcamp;
import com.erickmarques.desafio.dominio.Curso;
import com.erickmarques.desafio.dominio.Dev;
import com.erickmarques.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso imersivo em Java e seus frameworks");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp java = new Bootcamp();
        java.setNome("Java Developer");
        java.setDescricao("Descrição BootCamp Java Developer");
        java.getConteudos().add(curso1);
        java.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Erick");
        System.out.println("Conteudos inscritos Dev "+dev1.getNome()+":\n"+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXP());
        dev1.inscreverBootcamp(java);
        System.out.println("Conteudos inscritos Dev "+dev1.getNome()+":\n"+dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos Dev "+dev1.getNome()+":\n"+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Vinicius");
        dev2.inscreverBootcamp(java);
        System.out.println("Conteudos inscritos Dev "+dev2.getNome()+":\n"+dev2.getConteudosInscritos());
        System.out.println("XP: "+dev2.calcularTotalXP());

        System.out.println(java.getDevsInscritos());




        
    }
}
