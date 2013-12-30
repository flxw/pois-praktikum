# Preparing for deployment
1.  Right-click the project name in the Eclipse package explorer and click *Create deployment artifacts*
2.  Right-click your classes and export them as JARs to a directory of your choice

# Deploying
1.  Stop Apache Tomcat
2.  Copy the JARS into **$TOMCAT-HOME/webapps/acticiti-explorer/WEB-INF/lib**
3.  Start Apache Tomcat
4.  Login to http://localhost:8080/activiti-explorer and click *Manage*
5.  There, click *Deployments* and *Upload New*
6.  In the file selection pop-up, choose the **.bar** file from your projects */deployment* subfolder
