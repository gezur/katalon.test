
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.example.db.dbConnection.connectDB"(
    	String url	
     , 	String dbname	
     , 	String port	
     , 	String username	
     , 	String password	) {
    (new com.example.db.dbConnection()).connectDB(
        	url
         , 	dbname
         , 	port
         , 	username
         , 	password)
}

def static "com.example.db.dbConnection.executeQuery"(
    	String queryString	) {
    (new com.example.db.dbConnection()).executeQuery(
        	queryString)
}

def static "com.example.db.dbConnection.closeDatabaseConnection"() {
    (new com.example.db.dbConnection()).closeDatabaseConnection()
}

def static "com.example.db.dbConnection.execute"(
    	String queryString	) {
    (new com.example.db.dbConnection()).execute(
        	queryString)
}

def static "newpackage.newkeyword.myCustomPrint"(
    	String msg	) {
    (new newpackage.newkeyword()).myCustomPrint(
        	msg)
}
