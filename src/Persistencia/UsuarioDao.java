package Persistencia;

import DTO.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {

    private Connection con; // conexao com o BD
    private PreparedStatement st;// executar comandos SQL
    private ResultSet rs; // guardar o retorno de consulta BD

    public void Conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lojinha", "root", "46813252");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nas operacoes de banco");
        }

    }

    public int Salvar(Usuario usuario) {
        Conectar();
       

        try {
            String comando = "insert into usuario(Nome, Login, Senha, CPF, Telefone, Email,Cargo) values (?,?,?,?,?,?,?)";
            st = con.prepareStatement(comando);
            st.setString(1, usuario.Nome);
            st.setString(2, usuario.Login);
            st.setString(3, usuario.Senha);
            st.setString(4, usuario.CPF);
            st.setString(5, usuario.Telefone);
            st.setString(6, usuario.Email);
            st.setString(7, usuario.Cargo);
            int result = st.executeUpdate();;
            Desconectar();
            return result;

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 0;
            }

        }
    }

    public Usuario Consultar(String Login, String Senha) {
        Conectar();
        Usuario usuario = new Usuario();
        try {
            String comando = "select * from usuario where usuario = ? and senha = ?";
            st = con.prepareStatement(comando);
            st.setString(1, Login);
            st.setString(2, Senha);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                usuario.Login = rs.getString("Login");
                usuario.Senha = rs.getString("senha");
                usuario.Nome = rs.getString("nome");
                usuario.CPF = rs.getString("CPF");
                usuario.Email = rs.getString("Email");
                usuario.Telefone = rs.getString("Telefone");
                usuario.Cargo = rs.getString("Cargo");
                Desconectar();
                return usuario;
            }
        } catch (SQLException ex) {

        }
        Desconectar();
        return usuario;
    }

    public Usuario ConsultarPorUser(String CPF) {
        Conectar();
        Usuario usuario = new Usuario();
        try {
            String comando = "select * from usuario where CPF = ?";
            st = con.prepareStatement(comando);
            st.setString(1, CPF);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                usuario.Login = rs.getString("Login");
                usuario.Senha = rs.getString("senha");
                usuario.Nome = rs.getString("nome");
                usuario.CPF = rs.getString("CPF");
                usuario.Email = rs.getString("Email");
                usuario.Telefone = rs.getString("Telefone");
                usuario.Cargo = rs.getString("Cargo");
JOptionPane.showMessageDialog(null, "Consultado com Sucesso");
                Desconectar();
                return usuario;
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado");
            }
        } catch (SQLException ex) {

        }
        Desconectar();
        return usuario;
    }

    public int Deletar(String CPF) {
        Conectar();
        try {
            String comando = "Delete from usuario where CPF = ?";
            st = con.prepareStatement(comando);
            st.setString(1, CPF);
            int result = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso");

            Desconectar();
            return result;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir ");
            return 0;
        }
    }

    public void Desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }

}
