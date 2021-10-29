######################## add system functionalities to mysql docker container #############
CREATE FUNCTION lib_mysqludf_sys_info RETURNS string SONAME 'lib_mysqludf_sys_64.so';
CREATE FUNCTION sys_get RETURNS string SONAME 'lib_mysqludf_sys_64.so';
CREATE FUNCTION sys_set RETURNS int SONAME 'lib_mysqludf_sys_64.so';
CREATE FUNCTION sys_exec RETURNS int SONAME 'lib_mysqludf_sys_64.so';
CREATE FUNCTION sys_eval RETURNS string SONAME 'lib_mysqludf_sys_64.so';