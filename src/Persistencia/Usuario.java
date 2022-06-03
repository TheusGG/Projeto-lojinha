
package Persistencia;


public class Usuario {
  String Nome,Email,Senha,Telefone,CPF,Login,Cargo;
  
  public String getCargo () {
      return Cargo;
  
  }
  public void setCargo (String Cargo) {
        this.Cargo = Cargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login  = Login;
    }
  public void setTelefone (String Telefone){
      this.Telefone = Telefone;
  }
   public String getTelefone() {
        return Telefone;
    }
  
    
   
}
