CREATE TABLE reward (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the reward record',
  name VARCHAR(255) NOT NULL COMMENT 'Name of the reward',
  required_points INT NOT NULL COMMENT 'Required points to redeem the reward',
  company_id INT UNSIGNED NOT NULL COMMENT 'ID of the company who offers the reward',
  FOREIGN KEY (company_id) REFERENCES company(id)
);
