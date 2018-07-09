CREATE TABLE posts(
  id int(255) NOT NULL AUTO_INCREMENT,
  photo varchar(255) NOT NULL,
  description varchar(255) NOT NULL,
  country varchar(60) NOT NULL,
  city varchar (60) NOT NULL,
  user_id int NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;