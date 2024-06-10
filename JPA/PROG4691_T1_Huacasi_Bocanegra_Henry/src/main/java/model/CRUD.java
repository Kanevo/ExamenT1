package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CRUD {
	
	private EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("PROG4691_T1_Huacasi_Bocanegra_Henry");
	private EntityManager em = emf.createEntityManager();
	
	public List<Entrenadores> seleccionarTodo() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Entrenadores> cq = cb.createQuery(Entrenadores.class);
		Root<Entrenadores> registro = cq.from(Entrenadores.class);
		CriteriaQuery<Entrenadores> todos = cq.select(registro);
		TypedQuery<Entrenadores> lista = em.createQuery(todos);
		
		return lista.getResultList();
	}
	
	public void insertar(Entrenadores entr) {
		em.getTransaction().begin();
		em.persist(entr);
		em.getTransaction().commit();
		System.out.println("Registro de entrenador satisfactorio....");
		em.close();
	}
	
	public void actualizar(Entrenadores entr) {
		em.getTransaction().begin();
		Entrenadores enew = em.find(Entrenadores.class, entr.getId());
		enew.setApellido(entr.getApellido());
		enew.setEdad(entr.getEdad());
		enew.setNacionalidad(entr.getNacionalidad());
		enew.setNombre(entr.getNombre());
		
		em.getTransaction().commit();
		System.out.println("La actualizacion fue correcta...");
		em.close();
		
	}
	
	public void eliminar(int id) {
        em.getTransaction().begin();
        Entrenadores entr = em.find(Entrenadores.class, id);
        if (entr != null) {
            em.remove(entr);
            System.out.println("El entrenador fue eliminado correctamente...");
        } else {
            System.out.println("Entrenador no encontrado...");
        }
        em.getTransaction().commit();
        em.close();
     
	 }

}
