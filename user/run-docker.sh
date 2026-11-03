#!/bin/bash

# Script to build and run the User microservice in Docker

# Stop execution on any error
set -e

# Navigate to the User service directory
cd "$(dirname "$0")"

# Build the project with Maven
echo "Building with Maven..."
mvn clean package

# Build the Docker image
echo "Building Docker image..."
docker build -t user-service .

# Run the Docker container
echo "Starting Docker container..."
docker run -d --name user-service -p 7050:7050 -p 7051:7051 user-service

echo "User service is running on http://localhost:7050/user"
