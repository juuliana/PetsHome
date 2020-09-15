/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jumaj
 */
public class Cliente {

    //Métodos da Classe
    /**
     * @return the cli_id
     */
    public int getCli_id() {
        return cli_id;
    }

    /**
     * @param cli_id the cli_id to set
     */
    public void setCli_id(int cli_id) {
        this.cli_id = cli_id;
    }

    /**
     * @return the cli_nome
     */
    public String getCli_nome() {
        return cli_nome;
    }

    /**
     * @param cli_nome the cli_nome to set
     */
    public void setCli_nome(String cli_nome) {
        this.cli_nome = cli_nome;
    }

    /**
     * @return the cli_end
     */
    public String getCli_end() {
        return cli_end;
    }

    /**
     * @param cli_end the cli_end to set
     */
    public void setCli_end(String cli_end) {
        this.cli_end = cli_end;
    }

    /**
     * @return the cli_contato
     */
    public int getCli_contato() {
        return cli_contato;
    }

    /**
     * @param cli_contato the cli_contato to set
     */
    public void setCli_contato(int cli_contato) {
        this.cli_contato = cli_contato;
    }

    /**
     * @return the cli_cpf
     */
    public int getCli_cpf() {
        return cli_cpf;
    }

    /**
     * @param cli_cpf the cli_cpf to set
     */
    public void setCli_cpf(int cli_cpf) {
        this.cli_cpf = cli_cpf;
    }

    /**
     * @return the cli_email
     */
    public String getCli_email() {
        return cli_email;
    }

    /**
     * @param cli_email the cli_email to set
     */
    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    /**
     * @return the cli_senha
     */
    public String getCli_senha() {
        return cli_senha;
    }

    /**
     * @param cli_senha the cli_senha to set
     */
    public void setCli_senha(String cli_senha) {
        this.cli_senha = cli_senha;
    }
    
    //Atributos da Classe
    private int cli_id;
    private String cli_nome;
    private String cli_end;
    private int cli_contato;
    private int cli_cpf;
    private String cli_email;
    private String cli_senha;
    
}
