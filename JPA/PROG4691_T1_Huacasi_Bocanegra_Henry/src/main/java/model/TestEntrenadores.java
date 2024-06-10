package model;


public class TestEntrenadores {
    public static void main(String[] args) {
        CRUD ope = new CRUD();  
                
// PRUEBA LISTAR        
        for (Entrenadores e1 : ope.seleccionarTodo()) {
            System.out.println(e1);
        }
        
// PRUEBA CREAR     
        Entrenadores e1 = new Entrenadores();
        e1.setApellido("Huacasi");
        e1.setEdad(Integer.parseInt("28"));
        e1.setNacionalidad("Peruana");
        e1.setNombre("Henry");
        ope.insertar(e1);     
        
// PRUEBA ACTUALIZAR       
        ope.actualizar(new Entrenadores(6,"Castillo", Integer.parseInt("28"),"Peruana","Jesus"));
                
// PRUEBA ELIMINAR
        ope.eliminar(6);
        
    }
}
