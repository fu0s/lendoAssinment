#!/bin/sh
echo "********************************************************"
echo "Starting user service "
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/applicationservice/@project.build.finalName@.jar