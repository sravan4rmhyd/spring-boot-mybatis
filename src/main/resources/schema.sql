create table IF NOT EXISTS employee (
  id int primary key auto_increment,
  email varchar(255),
  empName varchar(255)
);
INSERT INTO employee (email, empName) VALUES
	('emp1@example.com', 'emp1'),
	('emp2@example.com', 'emp2'),
	('emp3@example.com', 'emp3'),
	('emp4@example.com', 'emp4'),
	('emp5@example.com', 'emp5'),
	('emp6@example.com', 'emp6'),
	('emp7@example.com', 'emp7'),
	('emp8@example.com', 'emp8'),
	('emp9@example.com', 'emp9'),
	('emp10@example.com', 'emp10'),
	('emp11@example.com', 'emp11'),
	('emp12@example.com', 'emp12');