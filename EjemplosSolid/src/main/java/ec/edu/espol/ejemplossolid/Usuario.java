
package ec.edu.espol.ejemplossolid;

public class Usuario {
    
    private String name;
    private String email;
    private String nickname;
    
    public Usuario(String name, String email){
        this.email= email;
        this.name= name;
    }
    
    public String generarNickname(){
        //Logica de generar nickname
        
        return nickname;
    }
    
    public void suscribiraSucursal(){
        //Logica para inscribirlo en una sucursal de trabajoS
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}

