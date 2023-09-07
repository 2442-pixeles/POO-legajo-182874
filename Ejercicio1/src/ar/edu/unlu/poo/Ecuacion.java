package ar.edu.unlu.poo;

public class Ecuacion {

    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    private void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    private void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    private void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public Ecuacion (double coeficienteA, double coeficienteB, double coeficienteC){
        this.setCoeficienteA(coeficienteA);
        this.setCoeficienteB(coeficienteB);
        this.setCoeficienteC(coeficienteC);
    }

    public String resolucionEcuacion() {
        String retorno = "";
        double radicando = (this.getCoeficienteB() * this.getCoeficienteB()) - (4 * this.getCoeficienteA() * this.getCoeficienteC());
        if (radicando < 0) {
            retorno += "No hay raíces reales \n";
            return retorno;
        } else if (radicando == 0) {
            retorno += "raiz unica: " + (-(this.getCoeficienteB()) / (2 * this.getCoeficienteA()))+ "\n";
            return retorno;
        } else {
            retorno += "raiz 1: " + ( ( (-(this.getCoeficienteB())) + Math.sqrt(radicando)) / (2 * this.getCoeficienteA())) + "\n";
            retorno += "raiz 2: " + ( ( (-(this.getCoeficienteB())) - Math.sqrt(radicando)) / (2 * this.getCoeficienteA())) + "\n";
            return retorno;
        }
    }

    public double calcularY (double x) {
        double y = (this.getCoeficienteA() * (x * x)) + (this.getCoeficienteB() * x) + this.getCoeficienteC();
        return y;
    }





}
