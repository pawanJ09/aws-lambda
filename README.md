#This project is for my AWS Lambda learning

#Creating feature branch for daily work

#Invoke SAM locally to test the AWS Lambda without deploying
sam local invoke HelloWorldFunction --event events/paramTest.json

Before this ensure you have docker installed and running
Use this to check Docker has downloaded the AWS images
docker image ls
REPOSITORY                                 TAG            IMAGE ID       CREATED         SIZE
amazon/aws-sam-cli-emulation-image-java8   rapid-1.24.1   70c31dadd2a6   7 minutes ago   672MB
amazon/aws-sam-cli-emulation-image-java8   latest         54232d1923b5   6 days ago      656MB
redis                                      6.2            a617c1c92774   3 months ago    105MB
redis                                      latest         a617c1c92774   3 months ago    105MB