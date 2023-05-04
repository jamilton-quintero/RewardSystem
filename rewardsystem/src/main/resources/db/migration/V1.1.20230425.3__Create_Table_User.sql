CREATE TABLE user (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the user record',
  first_name VARCHAR(255) NOT NULL COMMENT 'First name of the user',
  last_name VARCHAR(255) NOT NULL COMMENT 'Last name of the user',
  email VARCHAR(255) NOT NULL COMMENT 'Email address of the user',
  identification VARCHAR(20) NOT NULL COMMENT 'Identification number of the user',
  total_points INT NOT NULL DEFAULT 0 COMMENT 'Total points accumulated by the user'
);