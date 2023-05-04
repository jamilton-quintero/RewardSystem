CREATE TABLE company (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the company record',
  name VARCHAR(255) NOT NULL COMMENT 'Name of the company',
  email VARCHAR(255) NOT NULL COMMENT 'Email address of the company',
  password VARCHAR(255) NOT NULL COMMENT 'Password of the company',
  creation_date DATE NOT NULL COMMENT 'Creation date of the company record'
);
