CREATE TABLE sub_reward (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the company configuration record',
  name TEXT NOT NULL COMMENT 'Name of available rewards for the company',
  points_to_redeem INT NOT NULL COMMENT 'Number of points required to redeem a reward'
);