package com.sparkmysql.Dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.stereotype.Repository;
@Repository("tabledataDao")
public class TableDataDaoImpl implements TableDataDao{


		 SparkSession ssc = SparkSession.builder().master("local").appName("test").getOrCreate();
		 public List<Map<String, Object>> getTableData() throws SQLException{ 
        Dataset<Row> sq = ssc.read().format("Jdbc").option("url","jdbc:mysql://localhost:3306/kiran").option("driver", "com.mysql.jdbc.Driver").option("dbtable","stockdata").option("user", "root").option("password", "root").load();
			 List<Map<String, Object>> stockList2 = new ArrayList<Map<String, Object>>();
			  Row[] dataRows = (Row[]) sq.collect();
			 
			  String[] columns = sq.columns();
			 
			    for (Row row : dataRows) {
			    		    		
			    	Map<String, Object> object= new HashMap<String, Object>();
			          
			        	   for(String column : columns)
			        	   {
			        		 
			        		   object.put(column, row.getAs(column));
			        		  
			        
			        	   }
			    
			        	   stockList2.add(object);
			    }

			return stockList2;
		}
	


}
