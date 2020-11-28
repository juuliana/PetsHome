package Model;

import java.sql.Date;

public class Agendamento {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pet
     */
    public String getPet() {
        return pet;
    }

    /**
     * @param pet the pet to set
     */
    public void setPet(String pet) {
        this.pet = pet;
    }
    
    /**
     * @return the pagamento
     */
    public String getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pet to set
     */
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
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
    private int id;
    private String dia;
    private String hora;
    private Double valor;
    private String tipo;
    private String cliente;
    private String pet;
    private String pagamento;
    private Boolean isUpdating = false;
}