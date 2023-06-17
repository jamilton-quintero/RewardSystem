CREATE TABLE user_company (
  user_id INT UNSIGNED COMMENT 'ID of the user record',
  company_id INT UNSIGNED COMMENT 'ID of the company record',
  PRIMARY KEY (user_id, company_id),
  FOREIGN KEY (user_id) REFERENCES user(id),
  FOREIGN KEY (company_id) REFERENCES company(id)
);



