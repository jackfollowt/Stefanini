package com.hackaton.ws.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Source implements Serializable {

    @JsonProperty("source_id")
    private String source_id;
    @JsonProperty("dataRegistro")
    private Date dataRegistro;
    @JsonProperty("dataAtualizacao")
    private Date dataAtualizacao;
    @JsonProperty("municipio")
    private String municipio;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("municipioNotificacao")
    private String municipioNotificacao;
    @JsonProperty("estadoNotificacao")
    private String estadoNotificacao;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("idade")
    private int idade;
    @JsonProperty("dataTeste")
    private Date dataTeste;
    @JsonProperty("tipoTeste")
    private String tipoTeste;
    @JsonProperty("classificacaoFinal")
    private String classificacaoFinal;
    @JsonProperty("sintomas")
    private String sintomas;
    @JsonProperty("profissionalSaude")
    private String profissionalSaude;
    @JsonProperty("profissionalSeguranca")
    private Object profissionalSeguranca;
    @JsonProperty("cbo")
    private String cbo;
    @JsonProperty("dataNotificacao")
    private Date dataNotificacao;
    @JsonProperty("outrosSintomas")
    private String outrosSintomas;
    @JsonProperty("estrangeiro")
    private String estrangeiro;
    @JsonProperty("racaCor")
    private String racaCor;
    @JsonProperty("evolucaoCaso")
    private String evolucaoCaso;
    @JsonProperty("estadoTeste")
    private String estadoTeste;
    @JsonProperty("condicoes")
    private String condicoes;
    @JsonProperty("dataEncerramento")
    private Date dataEncerramento;
    @JsonProperty("dataInicioSintomas")
    private Date dataInicioSintomas;
    @JsonProperty("resultadoTeste")
    private String resultadoTeste;
    @JsonProperty("cnes")
    private Object cnes;
    @JsonProperty("testeSorologico")
    private Object testeSorologico;
    @JsonProperty("dataTesteSorologico")
    private Object dataTesteSorologico;
    @JsonProperty("tipoTesteSorologico")
    private Object tipoTesteSorologico;
    @JsonProperty("resultadoTesteSorologicoIgA")
    private Object resultadoTesteSorologicoIgA;
    @JsonProperty("resultadoTesteSorologicoIgG")
    private Object resultadoTesteSorologicoIgG;
    @JsonProperty("resultadoTesteSorologicoIgM")
    private Object resultadoTesteSorologicoIgM;
    @JsonProperty("resultadoTesteSorologicoTotais")
    private Object resultadoTesteSorologicoTotais;
    @JsonProperty("@timestamp")
    private Date timestamp;
    @JsonProperty("estadoIBGE")
    private String estadoIBGE;
    @JsonProperty("estadoNotificacaoIBGE")
    private String estadoNotificacaoIBGE;
    @JsonProperty("municipioIBGE")
    private String municipioIBGE;
    @JsonProperty("municipioNotificacaoIBGE")
    private String municipioNotificacaoIBGE;

    public Source() {
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public String getEstadoNotificacao() {
        return estadoNotificacao;
    }

    public void setEstadoNotificacao(String estadoNotificacao) {
        this.estadoNotificacao = estadoNotificacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataTeste() {
        return dataTeste;
    }

    public void setDataTeste(Date dataTeste) {
        this.dataTeste = dataTeste;
    }

    public String getTipoTeste() {
        return tipoTeste;
    }

    public void setTipoTeste(String tipoTeste) {
        this.tipoTeste = tipoTeste;
    }

    public String getClassificacaoFinal() {
        return classificacaoFinal;
    }

    public void setClassificacaoFinal(String classificacaoFinal) {
        this.classificacaoFinal = classificacaoFinal;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getProfissionalSaude() {
        return profissionalSaude;
    }

    public void setProfissionalSaude(String profissionalSaude) {
        this.profissionalSaude = profissionalSaude;
    }

    public Object getProfissionalSeguranca() {
        return profissionalSeguranca;
    }

    public void setProfissionalSeguranca(Object profissionalSeguranca) {
        this.profissionalSeguranca = profissionalSeguranca;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public Date getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(Date dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getOutrosSintomas() {
        return outrosSintomas;
    }

    public void setOutrosSintomas(String outrosSintomas) {
        this.outrosSintomas = outrosSintomas;
    }

    public String getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(String estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getEvolucaoCaso() {
        return evolucaoCaso;
    }

    public void setEvolucaoCaso(String evolucaoCaso) {
        this.evolucaoCaso = evolucaoCaso;
    }

    public String getEstadoTeste() {
        return estadoTeste;
    }

    public void setEstadoTeste(String estadoTeste) {
        this.estadoTeste = estadoTeste;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public Date getDataInicioSintomas() {
        return dataInicioSintomas;
    }

    public void setDataInicioSintomas(Date dataInicioSintomas) {
        this.dataInicioSintomas = dataInicioSintomas;
    }

    public String getResultadoTeste() {
        return resultadoTeste;
    }

    public void setResultadoTeste(String resultadoTeste) {
        this.resultadoTeste = resultadoTeste;
    }

    public Object getCnes() {
        return cnes;
    }

    public void setCnes(Object cnes) {
        this.cnes = cnes;
    }

    public Object getTesteSorologico() {
        return testeSorologico;
    }

    public void setTesteSorologico(Object testeSorologico) {
        this.testeSorologico = testeSorologico;
    }

    public Object getDataTesteSorologico() {
        return dataTesteSorologico;
    }

    public void setDataTesteSorologico(Object dataTesteSorologico) {
        this.dataTesteSorologico = dataTesteSorologico;
    }

    public Object getTipoTesteSorologico() {
        return tipoTesteSorologico;
    }

    public void setTipoTesteSorologico(Object tipoTesteSorologico) {
        this.tipoTesteSorologico = tipoTesteSorologico;
    }

    public Object getResultadoTesteSorologicoIgA() {
        return resultadoTesteSorologicoIgA;
    }

    public void setResultadoTesteSorologicoIgA(Object resultadoTesteSorologicoIgA) {
        this.resultadoTesteSorologicoIgA = resultadoTesteSorologicoIgA;
    }

    public Object getResultadoTesteSorologicoIgG() {
        return resultadoTesteSorologicoIgG;
    }

    public void setResultadoTesteSorologicoIgG(Object resultadoTesteSorologicoIgG) {
        this.resultadoTesteSorologicoIgG = resultadoTesteSorologicoIgG;
    }

    public Object getResultadoTesteSorologicoIgM() {
        return resultadoTesteSorologicoIgM;
    }

    public void setResultadoTesteSorologicoIgM(Object resultadoTesteSorologicoIgM) {
        this.resultadoTesteSorologicoIgM = resultadoTesteSorologicoIgM;
    }

    public Object getResultadoTesteSorologicoTotais() {
        return resultadoTesteSorologicoTotais;
    }

    public void setResultadoTesteSorologicoTotais(Object resultadoTesteSorologicoTotais) {
        this.resultadoTesteSorologicoTotais = resultadoTesteSorologicoTotais;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getEstadoIBGE() {
        return estadoIBGE;
    }

    public void setEstadoIBGE(String estadoIBGE) {
        this.estadoIBGE = estadoIBGE;
    }

    public String getEstadoNotificacaoIBGE() {
        return estadoNotificacaoIBGE;
    }

    public void setEstadoNotificacaoIBGE(String estadoNotificacaoIBGE) {
        this.estadoNotificacaoIBGE = estadoNotificacaoIBGE;
    }

    public String getMunicipioIBGE() {
        return municipioIBGE;
    }

    public void setMunicipioIBGE(String municipioIBGE) {
        this.municipioIBGE = municipioIBGE;
    }

    public String getMunicipioNotificacaoIBGE() {
        return municipioNotificacaoIBGE;
    }

    public void setMunicipioNotificacaoIBGE(String municipioNotificacaoIBGE) {
        this.municipioNotificacaoIBGE = municipioNotificacaoIBGE;
    }

    @Override
    public String toString() {
        return "Source{" +
                "source_id='" + source_id + '\'' +
                ", dataRegistro=" + dataRegistro +
                ", dataAtualizacao=" + dataAtualizacao +
                ", municipio='" + municipio + '\'' +
                ", estado='" + estado + '\'' +
                ", municipioNotificacao='" + municipioNotificacao + '\'' +
                ", estadoNotificacao='" + estadoNotificacao + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", dataTeste=" + dataTeste +
                ", tipoTeste='" + tipoTeste + '\'' +
                ", classificacaoFinal='" + classificacaoFinal + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", profissionalSaude='" + profissionalSaude + '\'' +
                ", profissionalSeguranca=" + profissionalSeguranca +
                ", cbo='" + cbo + '\'' +
                ", dataNotificacao=" + dataNotificacao +
                ", outrosSintomas='" + outrosSintomas + '\'' +
                ", estrangeiro='" + estrangeiro + '\'' +
                ", racaCor='" + racaCor + '\'' +
                ", evolucaoCaso='" + evolucaoCaso + '\'' +
                ", estadoTeste='" + estadoTeste + '\'' +
                ", condicoes='" + condicoes + '\'' +
                ", dataEncerramento=" + dataEncerramento +
                ", dataInicioSintomas=" + dataInicioSintomas +
                ", resultadoTeste='" + resultadoTeste + '\'' +
                ", cnes=" + cnes +
                ", testeSorologico=" + testeSorologico +
                ", dataTesteSorologico=" + dataTesteSorologico +
                ", tipoTesteSorologico=" + tipoTesteSorologico +
                ", resultadoTesteSorologicoIgA=" + resultadoTesteSorologicoIgA +
                ", resultadoTesteSorologicoIgG=" + resultadoTesteSorologicoIgG +
                ", resultadoTesteSorologicoIgM=" + resultadoTesteSorologicoIgM +
                ", resultadoTesteSorologicoTotais=" + resultadoTesteSorologicoTotais +
                ", timestamp=" + timestamp +
                ", estadoIBGE='" + estadoIBGE + '\'' +
                ", estadoNotificacaoIBGE='" + estadoNotificacaoIBGE + '\'' +
                ", municipioIBGE='" + municipioIBGE + '\'' +
                ", municipioNotificacaoIBGE='" + municipioNotificacaoIBGE + '\'' +
                '}';
    }
}
