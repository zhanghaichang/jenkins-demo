#!/bin/bash
export service_name=$1
sleep_second=3

echo 'kubectl delete rc ${service_name}'
kubectl delete rc ${service_name}

echo 'kubectl delete service ${service_name}'
kubectl delete service ${service_name}

echo 'kubectl delete pods -l app=${service_name}'
kubectl delete pods -l app=${service_name}

sleep ${sleep_second}

echo 'create rc'
kubectl create -f /data/${service_name}-rc.yaml

echo 'create service'
kubectl create -f /data/${service_name}-svc.yaml
