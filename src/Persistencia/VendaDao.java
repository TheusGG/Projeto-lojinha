/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import DTO.Produto;
import DTO.Tabela;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VendaDao {

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

    public int registrar(Tabela tabela) {
        Conectar();

        Tabela salvar = new DTO.Tabela();

        LinkedList<Tabela> produtos = new LinkedList<>();
        
         

        try {

            String comando = "INSERT TO venda (Codigo,Produto,Quantidade,ValorUnitario,ValorTotal) Values (?,?,?,?,?)";

            st = con.prepareStatement(comando);

           
            st.setString(1, tabela.getCodigo());
            st.setString(2, tabela.getProduto());
            st.setDouble(3, tabela.getQuantidade());
            st.setDouble(4, tabela.getValorUnitario());
            st.setFloat(5, tabela.getValorTotal());
          
            produtos.add(tabela);

            int result = st.executeUpdate();;

            return result;

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 0;
            }

        }
    }
}
