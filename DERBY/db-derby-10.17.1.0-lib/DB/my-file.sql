connect 'jdbc:derby:..\DB\DBDerby;create=true;';
CALL SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY('derby.user.admin','manage');
CREATE TABLE emp (ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,NAME VARCHAR(26),DEPTID VARCHAR(26));
INSERT INTO emp(NAME,DEPTID) values('John','1001');
INSERT INTO emp(NAME,DEPTID) values('Jane','1002');
INSERT INTO emp(NAME,DEPTID) values('Jackie','1003');
disconnect;
exit;