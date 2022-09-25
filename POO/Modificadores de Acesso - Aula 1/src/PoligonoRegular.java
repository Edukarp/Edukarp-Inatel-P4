public class PoligonoRegular {

    private int n;
    private float c;
    private float areaPoligono;

    //Metodos privados (internos)
    private float calculaPerimetro(){ //P
        float perimetro;

        perimetro = c*n;
        return perimetro;
    }

    private float calculaApotema(){ //a
        float apotema;

        apotema = (float) (c/(2*Math.tan(Math.toRadians(180/n))));
        return apotema;
    }

    //Metodo publico para interacao com o usuario
    public void calculaAreaPoligono(int nLados, float cLados){

        n = nLados;
        c = cLados;

        //Chamando os metodos internos
        areaPoligono = (calculaPerimetro()*calculaApotema())/2f;
    }

    //Recuperando o valor da area
    public float getAreaPoligono() {
        return areaPoligono;
    }
}
