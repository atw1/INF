class Cliente {
    private int ci;
    private String nombre;
    
    public Cliente() {
      this.ci = 0;
      this.nombre = "";
    }
    //-------------------------------------
    public int getCi() {
      return ci;
    }
    public void setCi(int ci) {
      this.ci = ci;
    }
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
}