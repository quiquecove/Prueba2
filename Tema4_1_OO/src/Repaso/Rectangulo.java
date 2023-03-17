package Repaso;

    class Rectangulo { 
        private int ancho = 0; 
        private int alto = 0; 
        
        Rectangulo(int an,int alto) { 
         ancho = an; // atributo ancho sin referencia 
         this.alto = alto; // atributo alto con referencia para evitar ambigüedad 
        } 
        
        public int getAncho() { 
         return this.ancho;// devuelvo el atrituto con this 
        } 
        
        public int getAlto() { 
         return alto;// se puede hacer sin this 
        }  
        
        public void setRectangulo(int ancho, int alto) { 
         // Se necesita para diferenciar entre atrubuto y parámetro 
         this.ancho = ancho;  
         this.alto = alto; 
        } 
        
        public Rectangulo getRectangulo() { 
         return this; // Devuelve una referencia al objeto completo 
        } 

        public static void main(String[] args) {
           
            Rectangulo miObjeto = new Rectangulo(12,15); //Declaramos y creamos el objeto en una línea
            System.out.println(miObjeto.getAlto());
        
        
        }
       } 
    




