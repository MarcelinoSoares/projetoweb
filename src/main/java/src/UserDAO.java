package src;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
  
import src.User;

public class UserDAO {

	private EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("usuarios");
private EntityManager em = factory.createEntityManager();

public User getUsuario(String userName, String password) {

      try {
            User user = (User) em
                       .createQuery(
                                   "SELECT u from Usuario u where u.nomeUsuario = :name and u.senha = :senha")
                       .setParameter("nameUser", userName)
                       .setParameter("password", password).getSingleResult();

            return user;
      } catch (NoResultException e) {
            return null;
      }
}

public boolean inserirUsuario(User user) {
      try {
            em.persist(user);
            return true;
      } catch (Exception e) {
            e.printStackTrace();
            return false;
      }
}
 
public boolean deletarUsuario(User user) {
      try {
            em.remove(user);
            return true;
      } catch (Exception e) {
            e.printStackTrace();
            return false;
      }
}
	
}
