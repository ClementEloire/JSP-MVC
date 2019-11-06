/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author pedago
 */
public class DAO {
    
    private final DataSource myDataSource;

	/**
	 * Construit le AO avec sa source de données
	 * @param dataSource la source de données à utiliser
	 */
    public DAO(DataSource dataSource) {
		this.myDataSource = dataSource;
    }
        
    public List<CodeDiscount> listeCode() throws SQLException {
        return null;
    }
    
    public int ajouterCodeDiscount(String code, float rate) throws SQLException {
        String sql = "INSERT INTO DISCOUNT_CODE WHERE VALUES (?,?)";
		try (   Connection connection = myDataSource.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql)
                ) {
                        // Définir la valeur du paramètre
			stmt.setString(1, code);
			stmt.setFloat(2, rate);
			return stmt.executeUpdate();

		}
    }
    
    public int effacerCodeDiscount(String code) throws SQLException {
        String sql = "DELETE FROM DISCOUNT_CODE WHERE DISCOUNT_CODE = ?";
		try (   Connection connection = myDataSource.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql)
                ) {
                        // Définir la valeur du paramètre
			stmt.setString(1, code);
			
			return stmt.executeUpdate();

		}
	}
    }

