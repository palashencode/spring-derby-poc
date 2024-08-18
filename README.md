# Read Me First
The project is a POC on how to connect to Apache Derby in a Client Server connection via JDBC.
- a local derby server was started in server-client mode
- the project was configured to connect to it via - 'com.java.spring.starterjdbc.config' 
- it is also a poc on how to configure and use multiple Impl class for auto wired Interface. - SampleClient.java 

endpoints 
- http://localhost:8081/api/v1/sampleclient
- http://localhost:8081/api/v1/status
- http://localhost:8081/api/v1/employees

## Delete DB
- Just delete the DB folder `DBDerby`

## Pre-Create & Pre-Populate the DB
You can pre-create apache derby db from the `ij` tool and pre-populate it
```batch
cmd
cd .\DERBY\db-derby-10.17.1.0-lib\bin
ij
run '..\DB\my-file.sql'; 
```

## RUN the Server
- open terminal in intellij
``` batch 
cd DERBY\db-derby-10.17.1.0-lib\DB
java -jar -Dderby.system.home=. "..\lib\derbyrun.jar" server start
```

## User Authentication 
Apache Derby by default allows anyone to connect to the db. 
To enforce user authentication following steps have been taken
- add user password in initialization script via `CALL`
- enforce authentication by adding a file called `derby.properties`
- add property `derby.connection.requireAuthentication=true`
- put the property file in system.home and specify system home in startup param as current folder
- `-Dderby.system.home=.`

Everytime a new connection is created to apache derby with `create=true`, 
it will create the DB `DBDerby` if it does not exist.
`jdbc:derby://localhost:1527/DBDerby;create=true`

command used to start the derby server was : 
start cmd.exe /c java -jar "C:\Users\palas\Downloads\db-derby-10.17.1.0-bin\lib\derbyrun.jar" server start

# Reference : 
- https://db.apache.org/derby/releases/release-10_17_1_0.cgi
- https://db.apache.org/derby/papers/DerbyTut/ij_intro.html
- https://db.apache.org/derby/docs/10.6/devguide/cdevcsecureDbOwner.html
  - `SET SCHEMA APP;`
