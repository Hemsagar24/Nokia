# EntryPoint script
minikube start
minikube dashboard
# 2 deployment of MariaDB & Postgres
# with 2 internal service exposed
kubectl apply -f db-deployment.yaml
# 1 configMap for dynamic db URL
# change according according to ur choice
kubectl apply -f api-configmap.yml
# 1 deployment for push api
# with 1 external service exposed
kubectl apply -f mypush-deployment.yml 
# 1 deployment for pop api
# with 1 external service exposed
kubectl apply -f mypop-deployment.yaml
