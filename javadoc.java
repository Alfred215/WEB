// metodos y parametros de una tele

public class tv {
    String marcar;
    float pulgadas;
    int volumen;
    int canal;
    String [] conexion;
    Boolean estado;

    public tv (String marca, float pulgadas, int volumen, int canal, String conexion, Boolean estado){
        this.marca=marca;
        this.pulgadas=pulgadas;
        this.volumen=volumen;
        this.canal=canal;
        this.conexion=conexion;
        this.estado=estado;
    }

    public Boolean encender(){
        
        return true;
    }

    public Boolean apagar(){

        return false;
    }

    public int subirCanal(){

        return +1;
    }

    public int bajarCanal(){

        return -1;
    }

    public int subirVolumen(){

        return +1;
    }

    public int bajarVolumen(){

        return -1;
    }

    public String entrada(){

        return "hdmi";
    }

    public float pulgadas(){

        return 24.2;
    }

    public String mostrarMarca(){

        return "LG";
    }
}