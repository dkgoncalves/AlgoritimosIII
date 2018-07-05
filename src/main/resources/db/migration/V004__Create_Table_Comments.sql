CREATE TABLE comments(
  id bigint(255) NOT NULL AUTO_INCREMENT,
  description varchar (255) NOT NULL,
  user_id bigint(255) NOT NULL,
  post_id bigint(255) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (post_id) REFERENCES posts (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;