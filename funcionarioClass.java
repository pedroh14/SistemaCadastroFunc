package codigo2;

public class funcionario {
    private String nome;
    private Integer horas;
    private double valor_hora;

    public funcionario(){
    }

    public funcionario(String nome, Integer horas, double valor_hora) {
        this.nome = nome;
        this.horas = horas;
        this.valor_hora = valor_hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    public double pagamento(){
        return horas * valor_hora;
    }

}
