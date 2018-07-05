CREATE TABLE posts(
  id bigint(255) NOT NULL AUTO_INCREMENT,
  photo varchar(255) NOT NULL,
  description varchar(255) NOT NULL,
  country varchar(60) NOT NULL,
  city varchar (60) NOT NULL,
  user_id bigint NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;