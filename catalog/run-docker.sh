#!/bin/bash

# Script to build and run the Catalog microservice in Docker

# Stop execution on any error
set -e

# Navigate to the Catalog service directory
cd "$(dirname "$0")"

# Build the project with Maven
echo "Building with Maven..."
mvn clean package

# Build the Docker image
echo "Building Docker image..."
docker build -t catalog-service .

# Run the Docker container
echo "Starting Docker container..."
docker run -d --name catalog-service -p 5050:5050 -p 5051:5051 catalog-service

echo "Catalog service is running on http://localhost:5050/catalog"
