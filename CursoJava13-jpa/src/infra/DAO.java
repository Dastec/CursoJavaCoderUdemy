package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("CursoJava13-jpa");

		} catch (Exception e) {
			// logar -> log4j
		}
	}
	
	public DAO(Class<E> classe){
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO<E>teste(){
		return this;
	}
	
	public DAO<E> abrirTrasacao(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharTrasacao(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){
		
		return this.abrirTrasacao().incluir(entidade).fecharTrasacao();
	}
	
	public List<E> obterTodos(int qtd, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
			
		}
		String jpql = "select e from "+classe.getName()+" e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public List<E> obterTodos(){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
			
		}
		String jpql = "select e from "+classe.getName()+" e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
}
