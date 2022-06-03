/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import DTO.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDao {

    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;

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


    public int Salvar(Produto produto) {
        Conectar();

        try {
            String comando = "insert into produto(IDPro,Produto,Quantidade,ValorC,ValorV, Categoria) values (?,?,?,?,?,?)";
            st = con.prepareStatement(comando);
            st.setString(1, produto.getIDPro());
            st.setString(2, produto.getProduto());
            st.setDouble(3, produto.getQuantidade());
            st.setDouble(4, produto.getValorC());
            st.setDouble(5, produto.getValorV());
            st.setString(6, produto.getCategoria());

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

    public void Desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {

        }
    }
}
