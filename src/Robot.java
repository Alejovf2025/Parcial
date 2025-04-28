public class Robot {

    Bateria bateria = new Bateria(1000);
    private boolean estado;
    int pasosAvanzados = 0;
    int pasosretro = 0;



    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void avanzar(int pasos){
     int consumo = (pasos/100)*10;
     int nuevaCarga = bateria.getCarga() - consumo;
     bateria.setCarga(nuevaCarga);
        System.out.println("El robot avanzo " + pasos + "pasos");

    }
    public void retroceder(int pasos){
        int consumo = (pasos/100)*10;
        int nuevaCarga = bateria.getCarga() - consumo;
        System.out.println("El robot retrocedio " + pasos + "pasos");
        bateria.setCarga(nuevaCarga);

    }

    public void dormir(){
        estado = true;
        System.out.println("Tengo sueño, me voy a dormir.....");


    }

    public void despertar(){
        estado = false;
        System.out.println("He vuelto jejej...");

    }

    public void recargar(){
        bateria.setCarga(1000);
        System.out.println("Estamos al 100% chicos");

    }
    public void bateriaLlena(){

    }
    public void bateriaVacia(){

    }

    public void energiaActual(){

    }
    public void estaDormido(){

    }
}
