package pe.edu.upeu.oarc.utils;

class Sobrecarga{
    void demoSobrec(){
        System.out.println("Sin parámetros\n");
    }

    //Sobrecargando demoSobrec para un parámetro int
    void demoSobrec(int a){
        System.out.println("Un parámetro: " +a+"\n");
    }

    //Sobrecargando demoSobrec para dos parámetros int
    int demoSobrec(int a, int b){
        System.out.println("Dos parámetros: "+a+", "+b);
        return a+b;
    }

    //Sobrecargando demoSobrec para dos parámetros double
    double demoSobrec(double a, double b){
        System.out.println("Dos parámetros tipo double: "+a+", "+b);
        return a+b;
    }
}

class DemoSobrecarga{
    public static void main(String[] args) {
        Sobrecarga sc= new Sobrecarga();
        int sumaint;
        double sumadouble;

        //Llamando todas las versiones de demoSobrec
        sc.demoSobrec();

        sc.demoSobrec(2);

        sumaint=sc.demoSobrec(4,6);
        System.out.println("Resultado de demoSobrec(4,6) es: "+sumaint+"\n");

        sumadouble=sc.demoSobrec(1.1,2.2);
        System.out.println("Resultado de demoSobrec(1.1,2.2) es: "+sumadouble);

    }
}