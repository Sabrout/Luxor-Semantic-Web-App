#!/bin/sh

cd server/lib/apache-jena-fuseki-2.5.0

# Run the server
./fuseki-server --update --mem /ds
