#!/bin/sh

# Run the server
./server/lib/apache-jena-fuseki-2.5.0/fuseki-server --update --mem /ds

# Seed with our ontology
./server/lib/apache-jena-fuseki-2.5.0/bin/s-put http://localhost:3030/ds/data default TouristObtoRDF.owl
