package Model;

public class Cliente {

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
     * @return the cli_cpf
     */
    public String getCli_cpf() {
        return cli_cpf;
    }

    /**
     * @param cli_cpf the cli_cpf to set
     */
    public void setCli_cpf(String cli_cpf) {
        this.cli_cpf = cli_cpf;
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
     * @return the cli_contato
     */
    public String getCli_contato() {
        return cli_contato;
    }

    /**
     * @param cli_contato the cli_contato to set
     */
    public void setCli_contato(String cli_contato) {
        this.cli_contato = cli_contato;
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

    /**
     * @return the isUpdating
     */
    public Boolean getIsUpdating() {
        return isUpdating;
    }

    /**
     * @param isUpdating the isUpdating to set
     */
    public void setIsUpdating(Boolean isUpdating) {
        this.isUpdating = isUpdating;
    }

    /**
     * @return the cli_end
     */
    public int getCli_end() {
        return cli_end;
    }

    /**
     * @param cli_end the cli_end to set
     */
    public void setCli_end(int cli_end) {
        this.cli_end = cli_end;
    }

    
    
    //Atributos da Classe
    private int cli_id;
    private String cli_cpf;
    private String cli_nome;
    private String cli_contato;
    private String cli_email;
    private String cli_senha;
    private Boolean isUpdating;
    private int cli_end;

}