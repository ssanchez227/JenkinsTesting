#!/usr/bin/env groovy

def namo = 'Bill'

def call(String name = 'human') {
  echo "Hello, ${name}."
  return true
}


