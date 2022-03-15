CREATE DATABASE project_1;


CREATE TABLE employee_details(employee_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY, first_name varchar(25), last_name varchar(25), address varchar(25), contact varchar(12), email varchar(25), username varchar(25), password varchar(25));

ALTER TABLE employee_details add column role varchar(10);


CREATE TABLE manager_details(manager_id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY, first_name varchar(25), last_name varchar(25), address varchar(25), contact varchar(12), email varchar(25), username varchar(25), password varchar(25));

ALTER TABLE manager_details add column role varchar(10);


CREATE TABLE reimbursement_details(reimbursement_id int GENERATED ALWAYS AS IDENTITY, employee_id int, reimbursement_amount float(2), reimbursement_reason varchar(250), reimbursement_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (reimbursement_id), FOREIGN KEY(employee_id) REFERENCES employee_details(employee_id));

ALTER TABLE reimbursement_details add column status varchar(10);


CREATE TABLE denied_details(denied_id int GENERATED ALWAYS AS IDENTITY, employee_id int, reimbursement_amount float(2), reimbursement_reason varchar(250), reimbursement_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (denied_id), FOREIGN KEY(employee_id) REFERENCES employee_details(employee_id));

ALTER TABLE denied_details add column status varchar(10);


CREATE TABLE pending_details(pending_id int GENERATED ALWAYS AS IDENTITY, employee_id int, reimbursement_amount float(2), reimbursement_reason varchar(250), reimbursement_date TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY (pending_id), FOREIGN KEY(employee_id) REFERENCES employee_details(employee_id));

ALTER TABLE pending_details add column status varchar(10);



