CREATE TABLE comments(
  id bigint(255) NOT NULL AUTO_INCREMENT,
  photo varchar(255) NOT NULL,
  description varchar(255) NOT NULL,
  country varchar(50) NOT NULL,
  city varchar(50) NOT NULL,
  user_id bigint(255) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;