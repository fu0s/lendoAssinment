###################### Procedure to trigger job service in order to fetch application status #################
DELIMITER //
CREATE PROCEDURE fetch_application_status(id TEXT)
BEGIN

     DECLARE cmd CHAR(255);
     DECLARE result CHAR(255);
     SET cmd = CONCAT('curl "http://localhost:8082/api/job?application_id=',id,'"');
     SET result = sys_eval(cmd);

END;
//