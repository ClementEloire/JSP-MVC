/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp;

/**
 *
 * @author pedago
 */
import javax.sql.DataSource;

/**
 *
 * @author rbastide
 */
public class DataSourceFactory {

	/**
	 * Renvoie la source de données (server ou embbeded)
	 * @return  la source de données
	 */
	public static DataSource getDataSource() {
		DataSource result;
                // Derby mode serveur, doit être démarré indépendamment
				org.apache.derby.jdbc.ClientDataSource ds = new org.apache.derby.jdbc.ClientDataSource();
				ds.setDatabaseName("sample");
				ds.setUser("app");
				ds.setPassword("app");
				// The host on which Network Server is running
				ds.setServerName("localhost");
				// port on which Network Server is listening
				ds.setPortNumber(1527);
				result = ds;
				return result;
	

}
}
