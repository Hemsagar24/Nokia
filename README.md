# Nokia (Language: JAVA)
  #Execution Steps: 
  
    1. Assuming Docker and minikube has been installed on the system.
   
    2. open Terminal 
   
    3. go to the "The Final" folder which have all the ymal files
   
    4. execute the Main.sh file
      
      a. if have Linux OS else execute the statments sequentially mention inside the file
      
      b. Note : to switch other database storage change the api-ConfigMap.yml.
   
    5.now we should have all container & services up and minikube dashboard opens
   
    6.execute "kubectl get services"
   
    7.execute "minikube service mypop-externalservice"
        
        a.pickup the url starting with 127.*.*.*:XXXXX and append "/swagger-ui/"
        
        e.g: http://127.0.0.1:49292/swagger-ui/[Can test the API here]
       
    8.execute "minikube service mypush-externalservice"
        
        a.pickup the url starting with 127.*.*.*:XXXXX and append "/swagger-ui/"
        
        e.g: http://127.0.0.1:49292/swagger-ui/[Can test the API here]
        
    Reference Link:
    
    https://drive.google.com/drive/folders/1YZ2xpbcdXYxGZqJEEd37Cj0jI3PZjoSw?usp=sharing
    
    ** In order to run the docker-compose that can also be done by going to the same folder 
        1. docker-compose up -d
        2. .env file present to change the Db before run(urls & profiles are mentioned in the .env file comment section)
    
    
   Note: Just adding one point 
   
   this implementation i thought of doing via Actual Stack(LIFO) methodology, 
         
         like implementing proper push()/pop(),
         
         as it was mentioned in the problem statment to implement Stack(LIFO),
         
         however i find some loopholes on that implementation as per my analysis.
         
         1. Suppose i go with my current approach(My current Submitted Project )
         
         2. Then how could i share my same stack java object across microservice for doing 
         
         3. operation like push and pop without storing it in any persistance layer
         
         4. or else even if i go with a single microservice that time also this couldbe an issue.

  Adding this as per my analysis.
 
