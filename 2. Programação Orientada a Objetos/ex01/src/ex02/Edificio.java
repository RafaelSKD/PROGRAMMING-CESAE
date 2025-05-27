package ex02;

import javax.sound.midi.VoiceStatus;

public class Edificio {
    private String nome;
    private String rua;
    private String cor;
    private int andares;
    private boolean garagem;

    public Edificio(String nome, String rua, String cor, int andares, boolean garagem) {
        this.nome = nome;
        this.rua = rua;
        this.cor = cor;
        this.andares = andares;
        this.garagem = garagem;
    }

    public String getNome(){

        return this.nome;
    }
    public String getRua(){

        return this.rua;
    }
    public String getCor(){

        return this.cor;
    }
    public int getAndares(){

        return this.andares;
    }

    public Boolean getGaragem(){

        return this.garagem;
    }

//    public void setNome(String nome){
//        this.nome = nome;
//    }
//    public void setRua(String rua){
//        this.rua = rua;
//    }
    public void setCor(String cor){
        this.cor = cor;
    }
//    public void setAndares(int andares){ this.andares = andares; }
//    public void setGaragem(Boolean garagem){this.garagem = garagem;}




}