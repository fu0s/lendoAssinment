###### create application tables ###########
CREATE TABLE APPLICATION (id int,application_id varchar(255));
CREATE TABLE APPLICATIONUPDATE (id int,job_id varchar(255),application_id varchar(255),status varchar(255));

#################### new application notification and trigger application status fetch ##################
DELIMITER $$
CREATE TRIGGER application_notification_trigger AFTER INSERT ON APPLICATION
    FOR EACH ROW
    CALL fetch_application_status(NEW.application_id);
$$


