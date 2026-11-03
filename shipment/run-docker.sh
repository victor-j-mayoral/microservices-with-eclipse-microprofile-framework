#!/bin/bash

# Build and run the Shipment Service in Docker
echo "Building and starting Shipment Service in Docker..."

# Build the application
mvn clean package

# Build and run the Docker image
docker build -t shipment-service .
docker run -p 8060:8060 -p 8061:8061 --name shipment-service shipment-service
