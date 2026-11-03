#!/bin/bash

# Build the application
mvn clean package

# Build the Docker image
docker build -t inventory-service .

# Run the container
docker run -d --name inventory-service -p 6050:6050 -p 6051:6051 inventory-service
