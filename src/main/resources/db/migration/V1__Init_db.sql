CREATE TABLE customer (
    id INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(125) NOT NULL,
    lastName VARCHAR(125) NOT NULL,
    email VARCHAR(125) NOT NULL,
    PRIMARY KEY (id)
) Engine=InnoDB;