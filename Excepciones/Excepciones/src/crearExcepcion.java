public class crearExcepcion {
    
    public static class MiExcepcion extends Exception {
        public MiExcepcion() { // Constructor por defecto
            super();
        }

        public MiExcepcion(String s) { // Constructor con mensaje
            super(s);
        }
    }
        
    // private void metodoExcepcion () throws MiExcepcion {
    //     MiExcepcion miError = new MiExcepcion("Error inventado por mi");
    //     throw miError;
    // }
        
    public static void main(String[] args) {
        crearExcepcion miPrograma = new crearExcepcion();
        try {
            throw new MiExcepcion();
            // miPrograma.metodoExcepcion();	
        } catch (MiExcepcion e) {
            System.out.println("El programa falló con el mensaje: " + e.getMessage());
        }
        System.out.println("A pesar del error anterior, la ejecución continúa");
    }
}


