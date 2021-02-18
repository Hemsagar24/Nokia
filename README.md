# Nokia
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
        
    Reference Link: https://drive.google.com/drive/folders/1YZ2xpbcdXYxGZqJEEd37Cj0jI3PZjoSw?usp=sharing
    
    
   
