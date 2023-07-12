public class Pitagoras{ 
    public double calcularHipotenusa(double catA, double catB){ 
        double resultado = 0.0;

        if(Math.abs(catA) > Math.abs(catB)){ 
            // resultado = catA/catB;
            resultado = Math.sqrt(catA*catA + catB*catB);
        }
        return resultado; 
    }
}