#!/bin/bash

APP_DIR=/stacks
STACKS_DIR=$APP_DIR/stacksonstacks.org

if [ ! -d "$APP_DIR" ]; then
  mkdir $APP_DIR;
fi

if [ ! -d "$STACKS_DIR" ]; then
  init=true
  cd $APP_DIR && pwd && git clone https://github.com/romanrafacz/stacksonstacks.org
  cd $STACKS_DIR
  sudo mvn clean install
  java -Dspring.profiles.active=dev -jar $STACKS_DIR/target/stacks-0.0.1-SNAPSHOT.jar
else
  cd $STACKS_DIR
  sudo mvn clean install
  java -Dspring.profiles.active=dev -jar $STACKS_DIR/target/stacks-0.0.1-SNAPSHOT.jar
fi