# Read Me First
The project is a POC on how to connect to Apache Derby in a Client Server connection via JDBC.
- a local derby server was started in server-client mode
- the project was configured to connect to it via - 'com.java.spring.starterjdbc.config' 
- it is also a poc on how to configure and use multiple Impl class for auto wired Interface. - SampleClient.java 

endpoints 
- http://localhost:8081/api/v1/sampleclient
- http://localhost:8081/api/v1/status
- http://localhost:8081/api/v1/employees


command used to start the derby server was : 
start cmd.exe /c java -jar "D:\programs\DB\db-derby-10.15.2.0-bin\lib\derbyrun.jar" server start