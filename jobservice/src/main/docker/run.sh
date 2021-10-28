#!/bin/sh
echo "********************************************************"
echo "Starting user service "
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/jobservice/@project.build.finalName@.jar