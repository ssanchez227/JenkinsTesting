#!/usr/bin/env groovy

def namo = 'Bill'

Boolean call(String name = 'human') {
  echo "Hello, ${name}."
  return true
}


