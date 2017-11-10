DROP TABLE users PURGE;

CREATE TABLE users ( 
user_id      VARCHAR2(12)   PRIMARY KEY,
user_name   VARCHAR2(15)   NOT NULL,
password    VARCHAR2(10)    NOT NULL,
age         NUMBER(3),
grade       NUMBER(3),
reg_date     DATE  );

INSERT INTO users VALUES('user01','ȫ�浿','user01',10,1,
  TO_DATE( '01/10/2011 01:10:11 ����', 'MM/DD/YYYY HH:MI:SS AM'));
INSERT INTO users VALUES('user02','�̼���','user02',20,2,
  TO_DATE( '02/20/2022 02:20:22 ����', 'MM/DD/YYYY HH:MI:SS AM'));
INSERT INTO users VALUES('user03','������','user03',30,3,
  TO_DATE( '03/30/2033 03:30:33 ����', 'MM/DD/YYYY HH:MI:SS AM'));
INSERT INTO users VALUES('ibatis01','ȫ�浿iba','ibatis01',10,1,
  TO_DATE( '01/10/2011 01:10:11 ����', 'MM/DD/YYYY HH:MI:SS AM'));
INSERT INTO users VALUES('ibatis02','�̼���iba','ibatis02',20,2,
  TO_DATE( '02/20/2022 02:20:22 ����', 'MM/DD/YYYY HH:MI:SS AM'));
INSERT INTO users VALUES('ibatis03','������iba','ibatis03',30,3,
TO_DATE( '03/30/2033 03:30:33 ����', 'MM/DD/YYYY HH:MI:SS AM'));

COMMIT;
