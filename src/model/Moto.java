package model;

public class Moto extends Veiculo{

    private boolean compartimento;
    private double tamanhoBox;



    public void Moto(){
        this.setTipo(TipoVeiculo.MOTO);
    }

    public boolean isCompartimento() {
        return compartimento;
    }

    public void setCompartimento(boolean compartimento) {
        this.compartimento = compartimento;
    }

    public double getTamanhoBox() {
        return tamanhoBox;
    }

    public void setTamanhoBox(double tamanhoBox) {
        this.tamanhoBox = tamanhoBox;
    }
}