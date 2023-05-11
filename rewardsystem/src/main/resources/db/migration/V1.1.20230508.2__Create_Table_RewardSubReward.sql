CREATE TABLE reward_subreward (
  reward_id INT UNSIGNED COMMENT 'ID of the company configuration',
  sub_reward_id INT UNSIGNED COMMENT 'ID of the sub reward',
  PRIMARY KEY (reward_id, sub_reward_id),
  FOREIGN KEY (reward_id) REFERENCES reward(id),
  FOREIGN KEY (sub_reward_id) REFERENCES sub_reward(id)
);

