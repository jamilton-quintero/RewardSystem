CREATE TABLE redemption (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the redemption record',
  date DATE NOT NULL COMMENT 'Date of the redemption',
  user_id INT UNSIGNED NOT NULL COMMENT 'ID of the user who redeemed the reward',
  reward_id INT UNSIGNED NOT NULL COMMENT 'ID of the reward that was redeemed',
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (reward_id) REFERENCES reward(id)
);
