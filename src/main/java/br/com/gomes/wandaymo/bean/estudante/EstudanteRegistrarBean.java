package br.com.gomes.wandaymo.bean.estudante;

import br.com.gomes.wandaymo.model.Estudante;
import java.io.Serializable;
import java.util.*;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import static java.util.Arrays.asList;

@Named

//Mantém o estado dos atributos enquanto o usuário não mudar de tela
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Wandaymo", "Gomes", "de", "Sousa"};
    private List<String> nomesList = asList("Teste1", "Teste2", "Teste3", "Teste4");
    private Set<String> nomesSet = new HashSet<>(asList("Teste5", "Teste6", "Teste7", "Teste8"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;


    {
        nomesMap.put("Goku", "O mais forte");
        nomesMap.put("Vegeta", "O mais orgulhoso");
        nomesMap.put("Mestre Kame", "O mais tarado");
    }

    public void executar(){
        System.out.println("Fazendo uma busca");
    }

    public void executar(String param){
        System.out.println("Fazendo uma busca");
    }

    public String irParaIndex2(){
        return "index2";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public String exibirNotas(){
        this.mostrarNotas = true;
        return "index";
    }

    public String esconderNotas(){
        this.mostrarNotas = false;
        return "index";
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public void calcularCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println("Aqui: " + result);
    }
}

