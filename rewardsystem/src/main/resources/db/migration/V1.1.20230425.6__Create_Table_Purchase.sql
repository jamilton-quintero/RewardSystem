CREATE TABLE purchase (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the purchase record',
  date DATE NOT NULL COMMENT 'Date of the purchase',
  amount DECIMAL(10, 2) NOT NULL COMMENT 'Amount of the purchase',
  user_id INT UNSIGNED NOT NULL COMMENT 'ID of the user who made the purchase',
  FOREIGN KEY (user_id) REFERENCES user(id)
);