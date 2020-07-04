package src;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import src.User;
import src.UserDAO;

@ManagedBean(name= "LoginMB")
@ViewScoped

public class LoginManageBean {

	private UserDAO userDAO = new UserDAO();
    private User user = new User();
     
    public String envia() {
           
          user = userDAO.getUsuario(user.getUserName(), user.getPassword());
          if (user == null) {
                user = new User();
                FacesContext.getCurrentInstance().addMessage(
                           null,
                           new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                       "Erro no Login!"));
                return null;
          } else {
                return "/main";
          }
           
           
    }

    public User getUser() {
          return user;
    }

    public void setUsuario(User user) {
          this.user = user;
    }
	
}
