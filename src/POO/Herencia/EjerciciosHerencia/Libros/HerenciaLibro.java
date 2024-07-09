package POO.Herencia.EjerciciosHerencia.Libros;

public class HerenciaLibro extends ItemBiblioteca{//hereda los valores de ItemBiblioteca

        private String autor;
        private int Cantidad_paginas;//y estira la informacion segun los requirimientos
        public HerenciaLibro(String autor,int Cantidad_paginas){
            super();//esto es herencia, 
            this.autor = autor;
            this.Cantidad_paginas = Cantidad_paginas;
        }
        public String LeerMasInfoLibro(){
            return "El autor del libro es: " + this.autor +"\n el libro tiene "+ this.Cantidad_paginas+ " paginas";
        }

}
