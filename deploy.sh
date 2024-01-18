#!/bin/bash

IMAGE=10.0.4.60:5000/ibank-gw-core

if [ -n "$1" ]; then VERSION=$1; else VERSION="latest";fi

echo "Building image $IMAGE:$VERSION"

mvn clean dependency:tree compile package

docker build --platform=linux/amd64 -t $IMAGE:$VERSION .

docker push $IMAGE:$VERSION
