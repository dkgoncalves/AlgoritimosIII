CREATE TABLE users(
  id bigint(255) NOT NULL AUTO_INCREMENT,
  name varchar(60) NOT NULL,
  lastname varchar(60) NOT NULL,
  email varchar(60) NOT NULL,
  password varchar(10) NOT NULL,
  myphoto varchar(255) NOT NULL,
  usertype_id int NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (usertype_id) REFERENCES usertypes (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;