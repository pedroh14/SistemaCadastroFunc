package codigo2;

public class funcionariotemp extends funcionario {
    private double adicionaltemp;

    public funcionariotemp(){
        super();
    }

    public funcionariotemp(String nome, Integer horas, double valor_hora, double adicionaltemp) {
        super(nome, horas, valor_hora);
        this.adicionaltemp = adicionaltemp;
    }

    public double getAdicionaltemp() {
        return adicionaltemp;
    }

    public void setAdicionaltemp(double adicionaltemp) {
        this.adicionaltemp = adicionaltemp;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicionaltemp * 1.1;
    }
}
