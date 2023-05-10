CREATE TABLE companyconfiguration_subreward (
  company_configuration_id INT UNSIGNED COMMENT 'ID of the company configuration',
  sub_reward_id INT UNSIGNED COMMENT 'ID of the sub reward',
  PRIMARY KEY (company_configuration_id, sub_reward_id),
  FOREIGN KEY (company_configuration_id) REFERENCES company_configuration(id),
  FOREIGN KEY (sub_reward_id) REFERENCES sub_reward(id)
);

