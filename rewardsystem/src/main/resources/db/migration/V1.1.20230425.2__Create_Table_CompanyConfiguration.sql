CREATE TABLE company_configuration (
  id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT 'ID of the company configuration record',
  points_to_redeem INT NOT NULL COMMENT 'Number of points required to redeem a reward',
  available_rewards TEXT NOT NULL COMMENT 'List of available rewards for the company',
  daily_points_limit INT NOT NULL COMMENT 'Maximum number of points that a user can accumulate in a day',
  weekly_points_limit INT NOT NULL COMMENT 'Maximum number of points that a user can accumulate in a week',
  points_accumulated_message VARCHAR(255) NOT NULL COMMENT 'Message displayed to the user when points are accumulated',
  redemption_message VARCHAR(255) NOT NULL COMMENT 'Message displayed to the user when a reward is redeemed',
  points_range INT NOT NULL COMMENT 'Range of points used to calculate the available rewards',
  expiration_date DATE NOT NULL COMMENT 'Expiration date of the company configuration record',
  company_id INT UNSIGNED NOT NULL,
  FOREIGN KEY (company_id) REFERENCES company(id)
);
