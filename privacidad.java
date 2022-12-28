public class privacidad {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombrePersona("cristhian");
        persona.setedadPersona(28);
        persona.settelefonoPersona(344554563);

        System.out.println(persona.getNombrePersona());
        System.out.println(persona.getedadPersona());
        System.out.println(persona.gettelefonoPersona());
    
}
}

class Persona{
    private String NombrePersona = " ";
    private int edadPersona = 0;
    private int telefonoPersona = 0;


    public void setNombrePersona(String NombrePersona){
        this.NombrePersona = NombrePersona;
    }

    public String getNombrePersona(){
        return this.NombrePersona;
    }

    
    public void setedadPersona(int edadPersona){
        this.edadPersona = edadPersona;
    }

    public int getedadPersona(){
        return this.edadPersona;
    }
    
    public void settelefonoPersona(int telefonoPersona){
        this.telefonoPersona = telefonoPersona;
    }

    public int gettelefonoPersona(){
        return this.telefonoPersona;
    }
    
}