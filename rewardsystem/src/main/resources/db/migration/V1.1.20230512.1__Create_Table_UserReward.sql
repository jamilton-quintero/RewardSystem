CREATE TABLE user_reward (
  user_id INT UNSIGNED COMMENT 'ID of the user record',
  reward_id INT UNSIGNED COMMENT 'ID of the company configuration',
  PRIMARY KEY (user_id, reward_id),
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (reward_id) REFERENCES reward(id)
);



